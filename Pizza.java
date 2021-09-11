
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class Pizza {
    
    protected  String nome;
    protected  String massa;
    protected  String molho;
    protected  String temperatura;
    protected  int tempo;
    ArrayList coberturas = new ArrayList();
    
        public void preparar(){
            System.out.println("Preparando: " + nome);
            System.out.println("Amassando: " + massa);
            System.out.println("Adicionando: " + molho);
            System.out.println("Temperatura: " + temperatura + " Cº");
            
            System.out.println("Adicionado as Coberturas: ");
            for(int i = 0 ; i < coberturas.size() ; i++){
                System.out.println(" " + coberturas.get(i));
            }
        }
        
        public void assar(){
            System.out.println("Assando por: " + tempo + " Minutos !!!");
        }
        
        public void cortar(){
            System.out.println("Cortando a Pizza !!!");
        }
        
        public void embalar(){
            System.out.println("Embalando a Pizza !!!");
        }
        
        public String getNome(){
            return nome;
        }
}
