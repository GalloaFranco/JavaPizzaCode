/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Persistencia;

import MainPackage.Logica.Comida;
import MainPackage.Logica.Pedido;
import java.sql.*;
/**
 *
 * @author Franco
 */
public class SQLServer_DAOimpl implements PedidoDAO {

    @Override
    public void addPedido(Pedido pedido) throws SQLException{
        try(Connection con = Singleton_ConexionSQLServer.getInstance().getConexionSQL();
           PreparedStatement stmtPedido = con.prepareStatement(QuerySelector.getINSERT_PEDIDOS());
           PreparedStatement stmtDetalle = con.prepareStatement(QuerySelector.getINSERT_DETALLE())){
            
            stmtPedido.setInt(1, pedido.getNumero_pedido());
            stmtPedido.setDate(2, new java.sql.Date(pedido.getFecha().getTime()));
            
            stmtPedido.executeUpdate();   
            
            stmtDetalle.setInt(1, pedido.getNumero_pedido());
            for(Comida comida : pedido.getComidas()){
            stmtDetalle.setInt(2, comida.getId());
            stmtDetalle.setInt(3, comida.retornarMasUno());
            stmtDetalle.executeUpdate();
            }
            
        }catch(SQLException exception){
            throw new SQLException();//Con esta exception queremos indicar que se cargo un pedido con el mismo nro_pedido
                                     //Se deberia agregar una exception especial para esta situacion
        }
    }

    @Override
    public StringBuilder mostrarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
