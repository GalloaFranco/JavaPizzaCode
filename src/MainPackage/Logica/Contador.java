/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Logica;

import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public interface Contador {
    
    ArrayList <Integer> arregloEnteros = new ArrayList<>();
    
    public default void masUno(int i){
        
       arregloEnteros.add(i);
       
    }
    
    public default int retornarMasUno(){

        return arregloEnteros.size() -1;
    }
}
