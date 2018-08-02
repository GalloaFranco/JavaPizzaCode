/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Persistencia;

/**
 *
 * @author Franco
 */
public class QuerySelector {//ESTA CLASE CONSTA DE TODAS LAS QUERYS QUE SE UTILIZARAN EN LA IMPLEMENTACION DAO
   
    //CAMPOS CONSTANTES DE LA CLASE QUE CONTIENEN 
    //LAS SENTENCIAS SQL A UTILIZAR POR NUESTRA IMPL DAO
    private static final String SELECT_COMIDAS = "SELECT * FROM COMIDAS";
    private static final String SELECT_PEDIDOS = "SELECT * FROM PEDIDOS";
    private static final String SELECT_DETALLES = "SELECT * FROM DETALLE_PEDIDOS";
    
    private static final String INSERT_COMIDAS = "INSERT INTO COMIDAS (ID_COMIDA,PRECIO,DESCRIPCION,MEDIDA) VALUES (?,?,?,?)";
    private static final String INSERT_PEDIDOS = "INSERT INTO PEDIDOS (NRO_PEDIDO,FECHA) VALUES (?,?)";
    private static final String INSERT_DETALLE = "INSERT INTO DETALLE_PEDIDOS (NRO_PEDIDO,ID_COMIDA) VALUES (?,?)";
    
    /*
    ****************************************************************************
    */
    public static String getSELECT_COMIDAS() {
        return SELECT_COMIDAS;
    }
    /*
    ****************************************************************************
    */
    public static String getSELECT_PEDIDOS() {
        return SELECT_PEDIDOS;
    }
    /*
    ****************************************************************************
    */
    public static String getSELECT_DETALLES() {
        return SELECT_DETALLES;
    }
    /*
    ****************************************************************************
    */
    public static String getINSERT_COMIDAS() {
        return INSERT_COMIDAS;
    }
    /*
    ****************************************************************************
    */
    public static String getINSERT_PEDIDOS() {
        return INSERT_PEDIDOS;
    }
    /*
    ****************************************************************************
    */
    public static String getINSERT_DETALLE() {
        return INSERT_DETALLE;
    }
    
}
