
package util;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class GravaArqTexto {

    public static void main(String[] args) {
        try {
            System.out.println("Abrindo para gravação texto.txt");
            FileWriter  fout = new FileWriter("C:\\Users\\User\\Documents\\teste.txt");
            PrintWriter pout = new PrintWriter(fout);
            
            System.out.println("Gravando texto.txt");
            pout.println("Linha 01");
            pout.println("Linha 02");
            pout.println("Linha 03");
            pout.println("Linha 04");
            pout.println("Linha 05");
            
            System.out.println("Fechando texto.txt");
            pout.close();
            fout.close();
            
            
            
        }  catch (IOException e){
            System.out.println("ERRO "+ e.getMessage() );
        }
        
        try {
            double result = 5/0;
        } catch (Exception e) {
            System.out.println("ERRO");
        }
    }
    
}
