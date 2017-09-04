
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
//import java.awt.LayoutManager;


public class FlowLayout {

    public static void main (String[] args){
        Frame janela = new Frame();
        janela.setTitle("Janela FlowLayout"); 
        
        //janela.setLayout((LayoutManager) new FlowLayout());      
       
        Button btn1 = new Button("Norte");
        Button btn2 = new Button("Sul");
        Button btn3 = new Button("Leste");
        
        
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.blue);
        btn3.setBackground(Color.green);
       
        
        btn1.setForeground(Color.white);
       
       
        
        janela.add(btn1, BorderLayout.NORTH);
        janela.add(btn2, BorderLayout.SOUTH);
        janela.add(btn3, BorderLayout.EAST);
      
        
        janela.setSize(640,480);
        janela.setVisible(true);
        
    }    


}