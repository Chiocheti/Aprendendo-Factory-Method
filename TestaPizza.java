/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class TestaPizza {
    
    public static void main(String[] args) {
        LojaPizza lojaSj = new LojaSj();
        LojaPizza lojaPocos = new LojaPocos();
        
        Pizza pizza = lojaSj.orderPizza("Mussarela");
        System.out.println("Eu pedi uma pizza de " + pizza.getNome() + "\n");
        
        pizza = lojaPocos.orderPizza("Marguerita");
        System.out.println("Eu pedi uma pizza de " + pizza.getNome() + "\n");
    }
}
