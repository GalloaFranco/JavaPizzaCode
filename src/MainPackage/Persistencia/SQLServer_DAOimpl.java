/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Persistencia;

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
           PreparedStatement stmt = con.prepareStatement(QuerySelector.getINSERT_PEDIDOS())){
            
            stmt.setInt(1, pedido.getNumero_pedido());
            stmt.setDate(2, (Date) pedido.getFecha());
            
            
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
