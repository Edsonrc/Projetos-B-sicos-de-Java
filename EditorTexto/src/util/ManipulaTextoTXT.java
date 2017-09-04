
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipulaTextoTXT {
    
    public static boolean gravarArquivoTXT ( String nomeArquivo, String conteudo ) throws IOException{
        FileWriter  fout = new FileWriter(nomeArquivo);
            PrintWriter pout = new PrintWriter(fout);

            pout.println(conteudo);
            
            pout.close();
            fout.close();
            
            return true;
    }
    
    public static String lerArquivoTXT ( String nomeArquivo ) throws FileNotFoundException, IOException{
            FileReader  fin = new FileReader( nomeArquivo );
            BufferedReader pin = new BufferedReader(fin);
     
            String linha = pin.readLine();
            String retorno = "";
            
            while( linha != null){
                retorno += linha + "\n";
                linha = pin.readLine();
            }
          
            pin.close();
            fin.close();
            
            return retorno;
    
    }
    
}
