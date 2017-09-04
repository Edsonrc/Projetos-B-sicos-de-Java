/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class JanelaJava extends JFrame {
    /**
     * Não é necessario o void main pois o mesmo será chamado na
     * classe principal que já tem.
     */
    private Container container;
    private FormulaBaskaraSwing janelaPrincipal;
                      //Para compartilhar dados entre janelas
    public JanelaJava(FormulaBaskaraSwing janelaPrincipal){
        super("Dados sobre a Janela Principal");
        
       this.janelaPrincipal = janelaPrincipal;       
        
       container = this.getContentPane();//Criando novo Painel container
       container.setLayout(new GridLayout(5,1));//Escolhendo o layout 3 linhas uma coluna
       container.add(new JLabel ("A :" + janelaPrincipal.getTfA().getText()));
       container.add(new JLabel ("B :" + janelaPrincipal.getTfB().getText()));
       container.add(new JLabel ("C :" + janelaPrincipal.getTfC().getText()));
       container.add(new JLabel ("X' :" + janelaPrincipal.getLbResulX1().getText()));
       container.add(new JLabel ("X'' :" + janelaPrincipal.getLbResulX2().getText()));
       
       
       //Para fechar
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Dispose fecha apenas a janela da aplicação
       
       //Tamanho padrão
       this.pack();
       this.setLocationRelativeTo(null);//Ficar centralizado na tela
       this.setVisible(true);//Para aparecer janela na tela
       //this.setExtendedState(JFrame.MAXIMIZED_BOTH);//Janela começa maximizada
       //this.setResizable(false);//Não permite redimensionar a janela
       
        
    }
    
}
