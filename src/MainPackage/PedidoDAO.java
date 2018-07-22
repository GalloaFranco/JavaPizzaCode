/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author Franco
 */
public interface PedidoDAO {
    
    public void addPedido(Pedido pedido);//METODO PARA INSERTAR UN PEDIDO EN LA BASE DE DATOS
    
    public StringBuilder mostrarTodo();//METODO QUE DEVUELVE TODOS LOS PEDIDOS ALMACENADOS
    
    public void borrarTodo();//METODO QUE ELIMINA TODA LA INFORMACION ALMACENADA SOBRE LOS PEDIDOS
}
