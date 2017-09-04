/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author User
 */
public class FirstWindows {
    public static void main (String[]args){
        
        Frame janela = new Frame("Título da Janela");
        
        Button btnCentroN = new Button("Clique em Mim no Norte ...");
        Button btnCentroS = new Button("Clique em Mim no Sul ...");
        Button btnCentroL = new Button("Clique em Mim no Leste ...");
        Button btnCentroO = new Button("Clique em Mim no Oeste ...");
        Button btnCentroC = new Button("Clique em Mim no Centro ...");
        
        janela.add(btnCentroN,BorderLayout.NORTH);
        janela.add(btnCentroS,BorderLayout.SOUTH);
        janela.add(btnCentroO,BorderLayout.WEST);
        janela.add(btnCentroL,BorderLayout.EAST);
        janela.add(btnCentroC,BorderLayout.CENTER);
        
        btnCentroN.setBackground(Color.red);//Cor de fundo do broão
        btnCentroS.setBackground(Color.blue);
        btnCentroO.setBackground(Color.yellow);
        btnCentroL.setBackground(Color.green);
        
        btnCentroN.setForeground(Color.white);//Cor da fonte
        

        janela.setVisible(true);
        janela.setSize(300, 400);
        
    }
    
}
