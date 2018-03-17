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
public abstract class Pizza extends Comida {

    public Pizza(double price, int id, String medida, String description) {
        super(price, id, medida, description);
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description); 
    }

    @Override
    public String getDescription() {
        return super.getDescription(); 
    }

    @Override
    public int getId() {
        return super.getId(); 
    }

    @Override
    public double getPrice() {
        return super.getPrice(); 
    }
    
    
    
    
}
