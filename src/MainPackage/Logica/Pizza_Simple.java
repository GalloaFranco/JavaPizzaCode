/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Logica;

import MainPackage.Logica.Politicas_descuento;

/**
 *
 * @author Franco Gallo
 */
public class Pizza_Simple extends Pizza{


    public Pizza_Simple(double price, int id, String medida, String description) {
        super(price, id,medida, description);
    }

    @Override
    public String getMedida() {
        return super.getMedida(); 
    }
    

    @Override
    public double getPrice() {
        return super.getPrice(); 
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getDescription() {
        return super.getDescription(); 
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description); 
    }
 
    
}
