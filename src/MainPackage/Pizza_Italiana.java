/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author usuario
 */
public class Pizza_Italiana extends Pizza {


    public Pizza_Italiana(double price, int id,String medida, String description) {
        super(price, id, medida, description);
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
