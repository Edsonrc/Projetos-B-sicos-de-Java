/*
 * O componente FlowLayout constrói os componentes um após o outro
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;




/**
 *
 * @author User
 */
public class UsandoFlowLayout {
    public static void main (String[]args){
        
        Frame janela = new Frame("Título da Janela");
        
        janela.setLayout(new FlowLayout());//Por padrão, ele escolhe Border Layout, que não necessita ser declarado.
        //Mas neste caso, o FlowLayout precisa
        Button btn1 = new Button("BTN1");
        Button btn2 = new Button("BTN2");
        Button btn3 = new Button("BTN3");
        Button btn4 = new Button("BTN4");
        Button btn5 = new Button("BTN4");
        
        janela.add(btn1);
        janela.add(btn2);
        janela.add(btn3);
        janela.add(btn4);
        janela.add(btn5);

        janela.setVisible(true);
        janela.setSize(640, 480);
        
    }
    
}
