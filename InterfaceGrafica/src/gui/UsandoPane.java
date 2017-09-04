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
import java.awt.Panel;

/**
 *
 * @author User
 */
public class UsandoPane {
    public static void main (String[]args){
        
        Frame janela = new Frame("Título da Janela");
       
        
        Button btnCentroN1 = new Button("Norte 1");
        Button btnCentroN2 = new Button("Norte 2");
        Button btnCentroS = new Button("Clique em Mim no Sul ...");
        Button btnCentroL = new Button("Clique em Mim no Leste ...");
        Button btnCentroO = new Button("Clique em Mim no Oeste ...");
        Button btnCentroC = new Button("Clique em Mim no Centro ...");
        
        Panel pNorte = new Panel();
        pNorte.add(btnCentroN1);
        pNorte.add(btnCentroN2);
        
        janela.add(pNorte,BorderLayout.NORTH);
        janela.add(pNorte,BorderLayout.NORTH);
        janela.add(btnCentroS,BorderLayout.SOUTH);
        janela.add(btnCentroO,BorderLayout.WEST);
        janela.add(btnCentroL,BorderLayout.EAST);
        janela.add(btnCentroC,BorderLayout.CENTER);


        janela.setVisible(true);
        janela.setSize(300, 400);
        
    }
    
}

