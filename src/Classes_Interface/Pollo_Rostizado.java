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
public class Pollo_Rostizado extends Comida {

  
    public Pollo_Rostizado(double price, int id, String medida, String description) {
        super(price, id, medida, description);
    }
/*
********************************************************************************
*/
    @Override
    public String getMedida() {
        return super.getMedida(); 
    }
/*    
*************************************************************************** 
*/    
    @Override
    public void setDescription(String description) {
        super.setDescription(description); 
    }
/*    
*************************************************************************** 
*/
    @Override
    public String getDescription() {
        return super.getDescription(); 
    }
/*    
*************************************************************************** 
*/
    @Override
    public int getId() {
        return super.getId(); 
    }
/*    
*************************************************************************** 
*/
    @Override
    public double getPrice() {
       return super.getPrice();
    }
/*    
*************************************************************************** 
*/
    public void agregarAdicional(Rejilla r){
      r.getPrice();
      
    }
/*    
*************************************************************************** 
*/    
    public void agregarAdicional(Fritas f){
      f.getPrice();
      
    }

    
}
