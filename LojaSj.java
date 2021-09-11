/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class LojaSj extends LojaPizza{

    @Override
    public Pizza criarPizza(String tipo) {
        if(tipo.equals("Mussarela")){
            return new SjMussarela();
        }
        else if(tipo.equals("Marguerita")){
            return new SjMarguerita();
        }
        else 
            return null;
    }
}
