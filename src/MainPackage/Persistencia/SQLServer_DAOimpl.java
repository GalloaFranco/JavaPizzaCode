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
    public void addPedido(Pedido pedido) {
        try(Connection con = Singleton_ConexionSQLServer.getInstance().getConexionSQL();
           PreparedStatement stmtPedido = con.prepareStatement(QuerySelector.getINSERT_PEDIDOS());
           PreparedStatement stmtComida = con.prepareStatement(QuerySelector.getINSERT_COMIDAS())){
            
            stmtPedido.setInt(1, pedido.getNumero_pedido());
            stmtPedido.setDate(2, new java.sql.Date(pedido.getFecha().getTime()));
            
            stmtPedido.executeUpdate();
            
            for(Comida comida : pedido.getComidas()){
                stmtComida.setInt(1, comida.getId());
                stmtComida.setDouble(2, comida.getPrice());
                stmtComida.setString(3, comida.getDescription());
                stmtComida.setString(4, comida.getMedida());
            }
            
            stmtComida.executeUpdate();
            
        }catch(SQLException exception){
            exception.getMessage();
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
