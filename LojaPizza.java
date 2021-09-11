/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public abstract class LojaPizza {
    
    public Pizza orderPizza(String tipo){
        
        Pizza pizza;
        pizza = criarPizza(tipo);
        
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        
        return pizza;
    }
    
    public abstract Pizza criarPizza(String tipo);
}
