/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Interface;

/**
 *
 * @author Franco Gallo
 */
public  class Fritas implements Adicionales {

    private double price = 45;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String description() {
        return "Frita";
    }
    
}
