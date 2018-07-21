/*
 *Interfaz que nos brinda politicas de descuento para productos seleccionados (pollo y lomo para la version actual de pizza java code)
 */
package MainPackage;

/**
 *
 * @author Franco Gallo
 */
public interface Politicas_descuento {
    
    public double getDescuento(Pedido pedido);
    
}
