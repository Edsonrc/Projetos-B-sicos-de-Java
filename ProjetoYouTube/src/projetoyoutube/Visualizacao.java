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
public class Visualizacao {
    private Gafanhoto espectador;//Agregação
    private Video filme;
    
    //Sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);        
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);        
    }
    public void avaliar (float porc){
               
    }
    
    //Criando Construtor

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    //Criando Getter e Setter

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
