
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class LerArqTexto {

    public static void main(String[] args) {
        try {
            System.out.println("Abrindo texto.txt");
            FileReader  fin = new FileReader("C:\\Users\\User\\Documents\\teste.txt");
            BufferedReader bin = new BufferedReader(fin);
           
            System.out.println("Lendo texto.txt");
            
            String linha = bin.readLine();
            
            while( linha != null){
                System.out.println(linha);
                linha = bin.readLine();
            }
                        
            System.out.println("Fechando texto.txt");
            fin.close();
            bin.close();
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: Arquivo não existe");
        } catch (IOException e){
            System.out.println("ERRO "+ e.getMessage() );
        }
        
        try {
            double result = 5/0;
        } catch (Exception e) {
            System.out.println("ERRO");
        }
    }
    
}
