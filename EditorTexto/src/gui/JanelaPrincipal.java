
package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import util.ManipulaTextoTXT;
import util.ManipulaArquivoBin;

public class JanelaPrincipal extends JFrame{
    
    private JMenuBar barraMenu;
    private JMenu mnArquivo;
    private JMenuItem miNovo;
    private JMenuItem miAbrir;
    private JMenuItem miSalvar;
    private JMenuItem miSair;
    
    private JTextArea taTexto;
    private JLabel lbQtdAcesso;
    
    
    public JanelaPrincipal () {
        super("Editor de Texto Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        barraMenu = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        miNovo = new JMenuItem("Novo");
        miAbrir = new JMenuItem("Abrir");
        miSalvar = new JMenuItem("Salvar");
        miSair = new JMenuItem("Sair");
        taTexto = new JTextArea();
        lbQtdAcesso = new JLabel("Quantidade Acesso = 0");
        
        mnArquivo.add (miNovo);
        mnArquivo.add (miAbrir);
        mnArquivo.add (miSalvar);
        mnArquivo.addSeparator();
        mnArquivo.add (miSair);
        
        barraMenu.add(mnArquivo);
        this.setJMenuBar(barraMenu);
        
        this.getContentPane().add( taTexto, BorderLayout.CENTER );
        this.getContentPane().add( lbQtdAcesso, BorderLayout.SOUTH );
        
        miNovo.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed ( ActionEvent e){
                miNovoOnClick();
            }  

        });
        
         miAbrir.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed ( ActionEvent e){
                miAbrirOnClick();
            }  

        });
         
          miSalvar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed ( ActionEvent e){
                miSalvarOnClick();
            }  
 
        });
          
           miSair.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed ( ActionEvent e){
                miSairOnClick();
            }  

        });
        
        tratarQtdAcesso();
        this.setSize(640, 480);
        this.setVisible(true);
    
}

    public static void main(String[] args) {
       new JanelaPrincipal();

    }
    
    private void miNovoOnClick() {
        taTexto.setText("");
            }
    
     private void miAbrirOnClick() {
         try {
             
             JFileChooser arquivo = new JFileChooser();
             int retorno = arquivo.showOpenDialog(null);
             
             if (retorno == JFileChooser.APPROVE_OPTION) {
                  String nomeArquivo = arquivo.getSelectedFile().getAbsolutePath();
             
                  String retorno2 = ManipulaTextoTXT.lerArquivoTXT(nomeArquivo );
             
                  taTexto.setText(retorno2); 
             }

            
            }catch ( Exception e){
               JOptionPane.showMessageDialog( this, "ERRO: "+ e.getMessage() );
            }
            }
     
      private void miSalvarOnClick() {
          try {
             JFileChooser arquivo = new JFileChooser();
             int retorno = arquivo.showSaveDialog(null);
             
             if (retorno == JFileChooser.APPROVE_OPTION) {
                  String nomeArquivo = arquivo.getSelectedFile().getAbsolutePath();
                  String conteudo = taTexto.getText();
             
                  boolean retorno2 = ManipulaTextoTXT.gravarArquivoTXT(nomeArquivo, conteudo);
   
              if (retorno2 == true) {
                 JOptionPane.showMessageDialog( this, "Arquivo salvo com sucesso!" ); 
              }
             }
            
            }catch ( Exception e){
               JOptionPane.showMessageDialog( this, "ERRO: "+ e.getMessage() );
            }
      }
      
        private void miSairOnClick() {
            System.exit(0);
            }

    private void tratarQtdAcesso() {
            ManipulaArquivoBin arqBin = new ManipulaArquivoBin( "draft.bin" );
            int qtdAcesso = 0;
            
        try {
            qtdAcesso = arqBin.leArquivoBin();
        } catch (FileNotFoundException ex){
            qtdAcesso = 0;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro " + ex.getMessage());
        }
        
            qtdAcesso ++;
            
            lbQtdAcesso.setText("Quantidade de Acesso = "+ qtdAcesso );
            
        try {
            arqBin.gravaArquivoBin(qtdAcesso);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro " + ex.getMessage());
        }
    }
    
}
