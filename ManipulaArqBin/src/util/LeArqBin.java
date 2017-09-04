
package util;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class LeArqBin {

    public static void main(String[] args) {
       
        try{
            System.out.println("Abrindo para Gravação");
            FileInputStream fin = new FileInputStream("arqui.bin");
            DataInputStream din = new DataInputStream (fin);
            
            String nome = din.readUTF();
            int senha = din.readInt();
            double salario = din.readDouble();
            boolean fumante = din.readBoolean();
            String endereco = din.readUTF();

            System.out.println("Nome: " + nome);
            System.out.println("Senha: " + senha);
            System.out.println("Salario: " + salario);
            System.out.println("Fumante: " + fumante);
            System.out.println("Endereço: " + endereco);
            
            System.out.println("Fechando");
            din.close();
            fin.close(); 
        
        }catch(Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
        
        
    }
    
}
