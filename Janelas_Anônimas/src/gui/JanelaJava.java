/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author User
 */
public class JanelaJava extends JDialog {//O dialog não é uma janela e precisa do main para aparecer

    /**
     * Não é necessario o void main pois o mesmo será chamado na classe
     * principal que já tem.
     */
    private Container container;
    private FormulaBaskaraSwing janelaPrincipal;
    private JButton btEnviar;
    private JProgressBar pbStatus;
    //Para compartilhar dados entre janelas

    public JanelaJava(FormulaBaskaraSwing janelaPrincipal) {
        super(janelaPrincipal, true);//true ou false para se a janela será modal

        this.janelaPrincipal = janelaPrincipal;

        btEnviar = new JButton("Enviar");
        pbStatus = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);

        container = this.getContentPane();//Criando novo Painel container
        container.setLayout(new GridLayout(7, 1));//Escolhendo o layout 3 linhas uma coluna
        container.add(new JLabel("A :" + janelaPrincipal.getTfA().getText()));
        container.add(new JLabel("B :" + janelaPrincipal.getTfB().getText()));
        container.add(new JLabel("C :" + janelaPrincipal.getTfC().getText()));
        container.add(new JLabel("X' :" + janelaPrincipal.getLbResulX1().getText()));
        container.add(new JLabel("X'' :" + janelaPrincipal.getLbResulX2().getText()));
        container.add(btEnviar);
        container.add(pbStatus);

        btEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btEnviarAction();
            }

        });

        //Para fechar
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Dispose fecha apenas a janela da aplicação

        //Tamanho padrão
        this.pack();
        this.setLocationRelativeTo(null);//Ficar centralizado na tela
        this.setVisible(true);//Para aparecer janela na tela
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);//Janela começa maximizada
        //this.setResizable(false);//Não permite redimensionar a janela

    }

    //Fora do construtor
    public void btEnviarAction() {
     //Invicando classe ProcessarThread
     ProcessarThread pt = new ProcessarThread();
     pt.start();
    }

    /*Criando uma classe interna para tratar Thread e 
     * não travar o sistema
     */
    class ProcessarThread extends Thread {

        //Método responsável para execução da Thread
        public void run() {
            for (int i = 1; i <= 100; i++) {
                pbStatus.setValue(i);
                try {
                    Thread.sleep(100);//Dá pausas em milisegundos no processo
                } catch (InterruptedException ex) {
                    System.out.println("ERRO ao carregar arquivos!");
                }
            }
        }
    }

}
