
package util;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravaArqBin {

    public static void main(String[] args) {
       
        try{
            System.out.println("Abrindo para Gravação");
            FileOutputStream fout = new FileOutputStream("arqui.bin");
            DataOutputStream dout = new DataOutputStream (fout);

            System.out.println("Gravando");
            dout.writeUTF("Maria da Silva");
            dout.writeInt(123456);
            dout.writeDouble(1200.97);
            dout.writeBoolean (false);
            dout.writeUTF("Rua das Flores, 137");
            
            System.out.println("Fechando");
            dout.close();
            fout.close(); 
        
        }catch(Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
        
        
    }
    
}
