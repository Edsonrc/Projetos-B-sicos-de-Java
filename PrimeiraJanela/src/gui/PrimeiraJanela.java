
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class PrimeiraJanela {
    public static void main (String[] args){
        Frame janela = new Frame();
        janela.setTitle("Uma janela em Java");        
        
        Button btNorte = new Button("Norte");
        Button btSul = new Button("Sul");
        Button btLeste = new Button("Leste");
        Button btOeste = new Button("Oeste");
        Button btCentro = new Button("Centro");
        
        btNorte.setBackground(Color.red);
        btSul.setBackground(Color.blue);
        btLeste.setBackground(Color.green);
        btOeste.setBackground(Color.yellow);
        
        btNorte.setForeground(Color.white);
       
       
        
        janela.add(btNorte, BorderLayout.NORTH);
        janela.add(btSul, BorderLayout.SOUTH);
        janela.add(btLeste, BorderLayout.EAST);
        janela.add(btOeste, BorderLayout.WEST);
        janela.add(btCentro, BorderLayout.CENTER);
        
        janela.setSize(640,480);
        janela.setVisible(true);
        
    }    
}
