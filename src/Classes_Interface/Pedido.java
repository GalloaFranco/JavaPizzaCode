/*
 * CLASE PEDIDO, ES EL NEXO ENTRE LA CLASE MAIN Y LAS DEMAS.
 */
package Classes_Interface;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Franco Gallo
 */
public class Pedido implements Politicas_descuento {//CAMPOS DE LA CLASE PEDIDO
    private int numero_pedido;
    private double total;
    private ArrayList <String> resumen;
    private Date d;
    private int counterPollo;
    private int counterLomo;
    private int counterAdicionales;
    private int counterPizzaItaliana;
    private int counterPizzaRucula;
    private int counterPizzaSimple;
    private int counterDescuentoPollo;
    private int counterDescuentoLomo;
    private double auxiliarDescuentoPollo;
    private double auxiliarDescuentoLomo;
/*    
*************************************************************************** 
*/
    public Pedido(int numero_pedido) {//CONSTRUCTOR
        this.numero_pedido = numero_pedido;
        this.resumen = new ArrayList<>();
        d = new Date();
    }
/*    
*************************************************************************** 
*/
    public int getNumero_pedido() {//DEVUELVE EL NUMERO DE PEDIDO
        return numero_pedido;
    }
/*    
*************************************************************************** 
*/
    public double getTotal() {//DEVUELVE EL TOTAL
        return total;
    }
/*
********************************************************************************
*/
    public void setNumero_pedido(int numero_pedido) {//CONFIGURA EL NUMERO DE PEDIDO
        this.numero_pedido = numero_pedido;
    }
/*    
*************************************************************************** 
*/
    @Override
    public  double getDescuentoPollo() {//REALIZA Y DEVUELVE EL DESCUENTO DEL 30% EN POLLO
        double z = 130;//variable que hace referencia al valor del pollo.
        double x = (z*0.3);
        this.total = total - x;
        counterDescuentoPollo++;
        auxiliarDescuentoPollo = x;
        return total;
    }  
/*    
*************************************************************************** 
*/
    @Override
    public double getDescuentoLomo() {//realiza el calculo para el descuento del lomo en promocion actual
        Lomo l2 = new Lomo(190, 104, "Unidad", "Lomaso de ternera con mayonesa casera y huevo frito");
        this.total = this.total - l2.getPrice();//l2 variable auxiliar para realizar el descuento.
        counterDescuentoLomo++;
        auxiliarDescuentoLomo = l2.getPrice();
        return total;
    }
/*    
*************************************************************************** 
*/  
    public ArrayList getResumen(){//DEVUELVE EL ARRAYLIST RESUMEN
            if(counterLomo >= 1 ){
                resumen.add("\n-Lomo $190"+" ||Cantidad pedida: "+ counterLomo);
            }
            if(counterPollo >= 1){
                resumen.add("\n-Pollo $130"+" ||Cantidad pedida: "+ counterPollo);  
            }
            if(counterPizzaItaliana>= 1){
                resumen.add("\n-Pizza Italiana $110"+" ||Cantidad pedida: "+ counterPizzaItaliana);
            }
            if(counterPizzaRucula>= 1){
                resumen.add("\n-Pizza Rucula $135"+" ||Cantidad pedida: "+ counterPizzaRucula);
            }
            if(counterPizzaSimple>= 1){
                resumen.add("\n-Pizza Simple $95"+" ||Cantidad pedida: "+ counterPizzaSimple);
            }
            if (counterDescuentoPollo >= 1 ){
                resumen.add("\n*Descuento pollo 30% descuento= -$"+auxiliarDescuentoPollo);
            }
            if (counterDescuentoLomo >= 1){
                resumen.add("\n*Descuento promo 4x3 en lomos= -$"+auxiliarDescuentoLomo);
            }
        resumen.add("\nFecha :"+ d);
        resumen.add("\nN°Pedido: "+getNumero_pedido());
        resumen.add("\nMONTO TOTAL: "+total);
        return resumen;
    }
/*    
*************************************************************************** 
*/    
    public double getLomo(){//GENERA  EL ITEM LOMO
        Lomo l = new Lomo(190, 104,"Unidad","Lomaso de ternera con mayonesa casera y huevo frito.");
        this.total += l.getPrice();
        counterLomo ++;
        //resumen.add("\n-Lomo $190");
        if (counterLomo == 4){
            getDescuentoLomo();
        }
        return total;
    }
/*    
*************************************************************************** 
*/    
    public double getFritas(){//GENERA ADICIONAL FRITAS
        Fritas f = new Fritas();
        this.total += f.getPrice();
        counterAdicionales ++;
        resumen.add("\n-Adicional de fritas $45");
        return total;
    }
/*    
*************************************************************************** 
*/    
     public double getRejilla(){//GENERA ADICIONAL REJILLA
        Rejilla re = new Rejilla();
        this.total += re.getPrice();
        counterAdicionales ++;
        resumen.add("\n-Adicional de Rejilla $37");
        return total;
    }
/*    
*************************************************************************** 
*/    
    public double getPollo(){ //GENERA EL ITEM POLLO
        Pollo_Rostizado p = new Pollo_Rostizado(130, 100,"Unidad","Pollo de calidad, bien doradito con tomillo, mostaza y manteca derretida");
        this.total += p.getPrice();
        counterPollo ++;
        //resumen.add("\n-Pollo $130");
        if ((counterPollo == 2) && (counterAdicionales == 2)){
            getDescuentoPollo();
        }
        return total;
    }
/*    
*************************************************************************** 
*/    
    public double getPizzaItaliana(){ //GENERA EL ITEM PIZZA ITALIANA
        Pizza_Italiana pi = new Pizza_Italiana(110, 102,"Porciones", "Pizza a la italiana, casera con queso rallado, anchoas y salame.");
        this.total += pi.getPrice();
        counterPizzaItaliana++;
        //resumen.add("\n-Pizza Italiana $110");
        return total;
    }
/*    
*************************************************************************** 
*/    
    public double getPizzaRucula(){ //GENERA EL ITEM PIZZA RUCULA
        Pizza_Rucula pr = new Pizza_Rucula(135, 103, "Porciones", "Pizza con rucula, casera queso, tomate y pimiento");
        this.total += pr.getPrice();
        counterPizzaRucula++;
        //resumen.add("\n-Pizza Rúcula $135");
        return total;
    }
/*    
*************************************************************************** 
*/       
    public double getPizzaSimple(){ //GENERA EL ITEM PIZZA SIMPLE
        Pizza_Simple ps = new Pizza_Simple(95, 101,"Porciones","Pizza simple, casera con queso muzarella y tomate");
        this.total += ps.getPrice();
        counterPizzaSimple++;
        //resumen.add("\n-Pizza Simple $95");
        return total;
    }
}