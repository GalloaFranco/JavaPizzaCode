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
public class Pollo_Rostizado extends Comida implements Politicas_descuento {

  
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

    /*
     ***************************************************************************
     */
    @Override
    public double getDescuento(Pedido pedido) {
        //REALIZA Y DEVUELVE EL DESCUENTO DEL 30% EN POLLO
        Pollo_Rostizado pollo = new Pollo_Rostizado(130, 100,"Unidad","Pollo de calidad, bien doradito con tomillo, mostaza y manteca derretida");
        double porcentajeDescuento = 0.3; //variable que hace referencia al valor del porcentaje de descuento que se aplicara
        double valorPolloConDescuento = pollo.getPrice() * 0.3;
        pedido.total = pedido.total - valorPolloConDescuento;
        pedido.counterDescuentoPollo++;
        pedido.auxiliarDescuentoPollo = valorPolloConDescuento;
        return pedido.total;
    }
    
}
