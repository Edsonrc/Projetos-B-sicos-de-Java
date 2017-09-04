/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author EdsonRicardoCzarneski
 */
public class FormulaBaskara extends Frame implements WindowListener, ActionListener  {
    //Atributos
    private Button btCalcular, lbLimpar;
    private TextField tfA, tfB, tfC;
    private Label lbA, lbB, lbC, lbX1, lbX2, lbResulX1, lbResulX2;
    

    //Criando método Construtor
    public FormulaBaskara(){ 
        super("Fórmula de Báskara");//Chamando da superclasse Frame
        this.setLayout(new FlowLayout());
        btCalcular = new Button("Calcular");
        tfA = new TextField(10);
        tfB = new TextField(10);
        tfC = new TextField(10);
        lbA = new Label ("A:");
        lbB = new Label ("B:");
        lbC = new Label ("C:");
        lbX1 = new Label ("X' :");
        lbX2 = new Label ("X'':");
        lbResulX1 = new Label ("0.0");
        lbResulX2 = new Label ("0.0"); 
        lbLimpar = new Button ("Limpar");
        
        this.add(lbA);
        this.add(tfA);
        this.add(lbB);
        this.add(tfB);
        this.add(lbC);
        this.add(tfC);
        this.add(btCalcular);
        this.add(lbX1);
        this.add(lbResulX1);
        this.add(lbX2);
        this.add(lbResulX2);
        this.add(lbLimpar);
         
        this.addWindowListener(this);
        btCalcular.addActionListener(this);

        this.pack();
        this.setVisible(true); 

    }

    public static void main (String[] args){
        
        FormulaBaskara jb = new FormulaBaskara();
   
    }
    //Método para fechra janela
    @Override
    public void windowActivated(WindowEvent e){
        System.out.println("Window Activated");        
    }
    //Método que conta o tempo de perca de foco
    @Override
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");        
    }
    //Método para minimizar janela
    @Override
    public void windowIconified (WindowEvent e){
        System.out.println("Window Iconfied");        
    }
    //Método para maximizar
    @Override
   public void windowDeiconified (WindowEvent e){
        System.out.println("Window Deiconified");       
   }
   //Quando a janela abre pela primeira vez
   @Override
   public void windowOpened (WindowEvent e){
       System.out.println("Window Opened");       
   }
   //Para fechar a janela
   @Override
   public void windowClosing (WindowEvent e){
       System.out.println("Windos Closing"); 
       System.exit (0);
   }
   //Chamado para finalizar a janela
   @Override
   public void windowClosed (WindowEvent e){
       System.out.println("Window Closed");       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setBackground(Color.orange);
    }


    
}
