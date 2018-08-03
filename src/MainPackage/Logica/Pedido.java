/*
 * CLASE PEDIDO, ES EL NEXO ENTRE LA CLASE MAIN Y LAS DEMAS.
 */
package MainPackage.Logica;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Franco Gallo
 */
public class Pedido{//CAMPOS DE LA CLASE PEDIDO
    private int numero_pedido;
    double total;
    private ArrayList <String> resumen;
    private ArrayList <Comida> arrayComida;
    private Date fecha;
    private int counterPollo;
    private int counterLomo;
    private int counterAdicionales;
    private int counterPizzaItaliana;
    private int counterPizzaRucula;
    private int counterPizzaSimple;
    int counterDescuentoPollo;
    int counterDescuentoLomo;
    double auxiliarDescuentoPollo;
    double auxiliarDescuentoLomo;
/*    
*************************************************************************** 
*/
    public Pedido(int numero_pedido) {//CONSTRUCTOR
        this.numero_pedido = numero_pedido;
        this.resumen = new ArrayList<>();
        this.arrayComida = new ArrayList<>();
        fecha = new Date();
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
    public void validateResumen(){//REALIZA LAS VALIDACIONES CORRESPONDIENTES PARA INSERTAR TEXTO EN EL RESUMEN
            
        if (counterLomo >= 1) {
            resumen.add("\n-Lomo $190" + " ||Cantidad pedida: " + counterLomo);
            arrayComida.add(getLomoPersistencia());
        }
        if (counterPollo >= 1) {
            resumen.add("\n-Pollo $130" + " ||Cantidad pedida: " + counterPollo);
            arrayComida.add(getPolloPeristencia());
        }
        if (counterPizzaItaliana >= 1) {
            resumen.add("\n-Pizza Italiana $110" + " ||Cantidad pedida: " + counterPizzaItaliana);
            arrayComida.add(getPizzaItalianaPersistencia());
        }
        if (counterPizzaRucula >= 1) {
            resumen.add("\n-Pizza Rucula $135" + " ||Cantidad pedida: " + counterPizzaRucula);
            arrayComida.add(getPizzaRuculaPersistencia());
        }
        if (counterPizzaSimple >= 1) {
            resumen.add("\n-Pizza Simple $95" + " ||Cantidad pedida: " + counterPizzaSimple);
            arrayComida.add(getPizzaSimplePersistencia());
        }
        if (counterDescuentoPollo >= 1) {
            resumen.add("\n*Descuento pollo 30% descuento= -$" + auxiliarDescuentoPollo);
        }
        if (counterDescuentoLomo >= 1) {
            resumen.add("\n*Descuento promo 4x3 en lomos= -$" + auxiliarDescuentoLomo);
        }
    }
/*
***************************************************************************    
*/
    public ArrayList getResumen(){//DEVUELVE UN ARRAYLIST RESUMEN
        validateResumen();
        resumen.add("\nFecha :"+ fecha);
        resumen.add("\nN°Pedido: "+getNumero_pedido());
        resumen.add("\nMONTO TOTAL: "+total);
        return new ArrayList<>(resumen);
    }
/*
***************************************************************************    
*/
    public ArrayList <Comida> getComidas(){
        
        return new ArrayList<>(arrayComida);
    }
/*    
***************************************************************************
*/    
    public Lomo getLomo(){//GENERA  EL ITEM LOMO
        Lomo lomo = new Lomo(190, 104,"Unidad","Lomaso de ternera con mayonesa casera y huevo frito.");
        this.total += lomo.getPrice();
        counterLomo ++;
        getLomoPersistencia();
        if (counterLomo == 4){
            lomo.getDescuento(this);
        }
        return lomo;
    }
    
    public Lomo getLomoPersistencia(){//GENERA  EL ITEM LOMO PARA PERSISTENCIA
        Lomo lomo = new Lomo(190, 104,"Unidad","Lomaso de ternera con mayonesa casera y huevo frito.");
        lomo.masUno(counterLomo);

        return lomo;
    }
/*    
*************************************************************************** 
*/    
    public double getFritas(){//GENERA ADICIONAL FRITAS
        Fritas f = new Fritas();
        this.total += f.getPrice();
        counterAdicionales ++;
        resumen.add("\n-Adicional de: "+ f.description() +" $45");
        return total;
    }
/*    
*************************************************************************** 
*/    
     public double getRejilla(){//GENERA ADICIONAL REJILLA
        Rejilla re = new Rejilla();
        this.total += re.getPrice();
        counterAdicionales ++;
        resumen.add("\n-Adicional de:"+ re.description() +" $37");
        return total;
    }
/*    
*************************************************************************** 
*/    
    public Pollo_Rostizado getPollo(){ //GENERA EL ITEM POLLO
        Pollo_Rostizado pollo = new Pollo_Rostizado(130, 100,"Unidad","Pollo de calidad, bien doradito");
        this.total += pollo.getPrice();
        counterPollo ++;
        pollo.masUno(counterPollo);
        if ((counterPollo == 2) && (counterAdicionales == 2)){
            pollo.getDescuento(this);
        }
        return pollo;
    }
    
    public Pollo_Rostizado getPolloPeristencia(){ //GENERA EL ITEM POLLO PARA PERSISTENCIA
        Pollo_Rostizado pollo = new Pollo_Rostizado(130, 100,"Unidad","Pollo de calidad, bien doradito");
        pollo.masUno(counterPollo);
       
        return pollo;
    }
/*    
*************************************************************************** 
*/    
    public Pizza_Italiana getPizzaItaliana(){ //GENERA EL ITEM PIZZA ITALIANA
        Pizza_Italiana pi = new Pizza_Italiana(110, 102,"Porciones", "Pizza a la italiana, queso rallado, anchoas y salame.");
        this.total += pi.getPrice();
        counterPizzaItaliana ++;
        pi.masUno(counterPizzaItaliana);
        return pi;
    }
    
    public Pizza_Italiana getPizzaItalianaPersistencia(){ //GENERA EL ITEM PIZZA ITALIANA PARA PERSISTENCIA
        Pizza_Italiana pi = new Pizza_Italiana(110, 102,"Porciones", "Pizza a la italiana, queso rallado, anchoas y salame.");
        pi.masUno(counterPizzaItaliana);
    
        return pi;
    }
/*    
*************************************************************************** 
*/    
    public Pizza_Rucula getPizzaRucula(){ //GENERA EL ITEM PIZZA RUCULA
        Pizza_Rucula pr = new Pizza_Rucula(135, 103, "Porciones", "Pizza con rucula, casera queso, tomate y pimiento");
        this.total += pr.getPrice();
        counterPizzaRucula ++;
        pr.masUno(counterPizzaRucula);
        return pr;
    }
    
    public Pizza_Rucula getPizzaRuculaPersistencia(){ //GENERA EL ITEM PIZZA RUCULA PARA PERSISTENCIA
        Pizza_Rucula pr = new Pizza_Rucula(135, 103, "Porciones", "Pizza con rucula, casera queso, tomate y pimiento");
        pr.masUno(counterPizzaRucula);

        return pr;
    }
/*    
*************************************************************************** 
*/       
    public Pizza_Simple getPizzaSimple(){ //GENERA EL ITEM PIZZA SIMPLE
        Pizza_Simple ps = new Pizza_Simple(95, 101,"Porciones","Pizza simple, casera con queso muzarella y tomate");
        this.total += ps.getPrice();
        counterPizzaSimple++;
        ps.masUno(counterPizzaSimple);
        return ps;
    }
    
    public Pizza_Simple getPizzaSimplePersistencia(){ //GENERA EL ITEM PIZZA SIMPLE PARA PERSISTENCIA
        Pizza_Simple ps = new Pizza_Simple(95, 101,"Porciones","Pizza simple, casera con queso muzarella y tomate");
        ps.masUno(counterPizzaSimple);

        return ps;
    }
/*
***************************************************************************    
*/
    public Date getFecha() {//DEVUELVE LA FECHA DEL PEDIDO
        return fecha;
    }
    
}