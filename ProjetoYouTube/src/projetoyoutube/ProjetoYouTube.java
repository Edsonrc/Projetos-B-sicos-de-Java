/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author EdsonRicardoCzarneski
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO"); //O Construtor precisa do título, o resto é implementado
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5"); 
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        
        g[0] = new Gafanhoto("Jubileu", 22, "M","Juba");
        g[1] = new Gafanhoto("Creuza", 19, "F", "creuzita");
        
       /* System.out.println("------ VIDEOS ------");
       * System.out.println(v[0].toString());
       * System.out.println(v[1].toString()); 
       * System.out.println(v[2].toString());
       * System.out.println("------ GAFANHOTOS ------");
       * System.out.println(g[0].toString());
       * System.out.println(g[1].toString());
       */ 
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[1]);
        vis[0] = new Visualizacao(g[0],v[2]);
        System.out.println(vis[0].toString());
       
    }
    
}
