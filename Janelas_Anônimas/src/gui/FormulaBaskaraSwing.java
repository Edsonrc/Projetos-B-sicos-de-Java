/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author EdsonRicardoCzarneski
 */
public class FormulaBaskaraSwing extends JFrame {

    //Atributos
    private Button btCalcular, btLimpar;
    private TextField tfA, tfB, tfC;
    private Label lbA, lbB, lbC, lbX1, lbX2, lbResulX1, lbResulX2;
    private JMenuBar barraMenu;
    private JMenu mnArquivo, mnAjuda;
    private JMenuItem miNovo, miSair, miSobre;

    private Container container;

    //Criando método Construtor
    public FormulaBaskaraSwing() {
        super("Fórmula de Báskara");//Chamando da superclasse Frame
        this.setLayout(new FlowLayout());

        container = this.getContentPane();
        btCalcular = new Button("Calcular");
        btLimpar = new Button("Limpar");
        tfA = new TextField(10);
        tfB = new TextField(10);
        tfC = new TextField(10);
        lbA = new Label("A:");
        lbB = new Label("B:");
        lbC = new Label("C:");
        lbX1 = new Label("X' :");
        lbX2 = new Label("X'':");
        lbResulX1 = new Label("0.0");
        lbResulX2 = new Label("0.0");
        barraMenu = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnAjuda = new JMenu("Ajuda");
        miNovo = new JMenuItem("Novo");
        miSair = new JMenuItem("Sair");
        miSobre = new JMenuItem("Sobre");

        barraMenu.add(mnArquivo);
        barraMenu.add(mnAjuda);

        mnArquivo.add(miNovo);
        mnArquivo.add(miSair);
        mnAjuda.add(miSobre);

        this.setJMenuBar(barraMenu);

        container.add(lbA);
        container.add(tfA);
        container.add(lbB);
        container.add(tfB);
        container.add(lbC);
        container.add(tfC);
        container.add(btCalcular);
        container.add(lbX1);
        container.add(lbResulX1);
        container.add(lbX2);
        container.add(lbResulX2);
        container.add(btLimpar);

        container.setBackground(java.awt.Color.ORANGE);

        btCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                btCalcularAction();
            }
        });
        btLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                btLimparAction();
            }
        });
        miNovo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                miNovoAction();
            }
        });
        miSair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                miSairAction();
            }
        });
        miSobre.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                miSobreAction();
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);

    }

    public static void main(String[] args) {

        new FormulaBaskaraSwing();

    }

    private void btCalcularAction() {
        //Criando uma rotina para validação dos campos
        if (isCamposConsistentes()) {
            //Entrada de Dados   
            double a = Double.parseDouble(tfA.getText());
            double b = Double.parseDouble(tfB.getText());
            double c = Double.parseDouble(tfC.getText());
            //Processamento
            double delta = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            //Saída de Dados
            lbResulX1.setText(String.valueOf(x1));
            lbResulX2.setText(String.valueOf(x2));
        } else {
            JOptionPane.showMessageDialog(this, "ERRO - Campos Inválidos!");
        }
    }
    private void btLimparAction(){
        limpar();
    }
    private void miNovoAction(){
        limpar();
    }
    private void miSairAction(){
        System.exit(0);
    }
    private void miSobreAction(){
        new JanelaJava(this);
    }
    
    private void limpar() {
        tfA.setText("");
        tfB.setText("");
        tfC.setText("");
        lbResulX1.setText("0.0");
        lbResulX2.setText("0.0");

    }

    //Método responsável pela validação dos campos
    private boolean isCamposConsistentes() {
        //Recuperando dados - o trim() tira o espaço do campo
        String a = tfA.getText().trim();
        String b = tfB.getText().trim();
        String c = tfC.getText().trim();

        //Ver se algum campo está em branco
        if (a.equals(" ")) {
            tfA.requestFocus();//Coloca foco no campo.
            return false;
        } else if (b.equals(" ")) {
            tfB.requestFocus();
            return false;
        } else if (c.equals(" ")) {
            tfC.requestFocus();
            return false;
        }

        /*Vericando se o tipo do valor condiz com o programado
         *O try tentará executar o comando, fazendo a verificação
         *Não é necessário criar variável, pois  objetivo é verificar, 
         *não armazenar
         */
        try {
            Double.parseDouble(a);
        } catch (Exception e) {
            tfA.requestFocus();
            return false;
        }

        try {
            Double.parseDouble(b);
        } catch (Exception e) {
            tfB.requestFocus();
            return false;
        }

        try {
            Double.parseDouble(c);
        } catch (Exception e) {
            tfC.requestFocus();
            return false;
        }
        return true;
    }
    //Métodos especiais para compartilhar dados entre janelas (encapsulamento)
    public TextField getTfA() {
        return tfA;
    }

    public void setTfA(TextField tfA) {
        this.tfA = tfA;
    }

    public TextField getTfB() {
        return tfB;
    }

    public void setTfB(TextField tfB) {
        this.tfB = tfB;
    }

    public TextField getTfC() {
        return tfC;
    }

    public void setTfC(TextField tfC) {
        this.tfC = tfC;
    }

    public Label getLbResulX1() {
        return lbResulX1;
    }

    public void setLbResulX1(Label lbResulX1) {
        this.lbResulX1 = lbResulX1;
    }

    public Label getLbResulX2() {
        return lbResulX2;
    }

    public void setLbResulX2(Label lbResulX2) {
        this.lbResulX2 = lbResulX2;
    }
    
}
