/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Logica;

/**
 *
 * @author Franco Gallo
 */
public abstract class Comida {

private double price;
private int id;
private String description;
private String medida;
/*
********************************************************************************
*/
    public Comida(double price, int id, String medida, String description) {
        this.price = price;
        this.id = id;
        this.medida = medida;
        this.description = description;
    }
/*
********************************************************************************
*/
    public String getMedida() {
        return medida;
    }
/*
********************************************************************************
*/
    public double getPrice(){
        return price;
    }
/*
********************************************************************************
*/    
    public int getId(){
        return id;
    }
/*
********************************************************************************
*/
    public String getDescription() {
        return description;
    }
/*
********************************************************************************
*/
    public void setDescription(String description) {
        this.description = description;
    }
    
}