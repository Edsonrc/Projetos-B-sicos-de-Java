/*
 * O componente FlowLayout constrói os componentes um após o outro
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 *
 * @author User
 */
public class UsandoGridLayout {
    public static void main (String[]args){
        
        Frame janela = new Frame("Título da Janela");
        
        janela.setLayout(new GridLayout(3,2));
        
        Button btn1 = new Button("BTN1");
        Button btn2 = new Button("BTN2");
        Button btn3 = new Button("BTN3");
        Button btn4 = new Button("BTN4");
        Button btn5 = new Button("BTN5");
        Button btn6 = new Button("BTN6");
        
        janela.add(btn1);
        janela.add(btn2);
        janela.add(btn3);
        janela.add(btn4);
        janela.add(btn5);
        janela.add(btn6);

        janela.setVisible(true);
        janela.setSize(640, 480);
        
    }
    
}
