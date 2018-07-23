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
public class Lomo extends Comida implements Politicas_descuento {


    public Lomo(double price, int id, String medida, String description) {
        super(price, id, medida, description);
    }
/*    
*************************************************************************** 
*/
    @Override
    public String getMedida() {
        return super.getMedida(); 
    }
/*
********************************************************************************
*/
    @Override
    public void setDescription(String description) {
        super.setDescription(description); //Metodo sobre_escrito.
    }
/*    
*************************************************************************** 
*/
    @Override
    public String getDescription() {
        return super.getDescription(); //Metodo sobre_escrito.
    }
/*    
*************************************************************************** 
*/
    @Override
    public int getId() {
        return super.getId(); //Metodo sobre_escrito.
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //Metodo sobre_escrito.
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
        //realiza el calculo para el descuento del lomo en promocion actual
        Lomo lomo = new Lomo(190, 104, "Unidad", "Lomaso de ternera con mayonesa casera y huevo frito");
        pedido.total = pedido.total - lomo.getPrice(); //l2 variable auxiliar para realizar el descuento.
        pedido.counterDescuentoLomo++;
        pedido.auxiliarDescuentoLomo = lomo.getPrice();
        return pedido.total;
    }

 
}
