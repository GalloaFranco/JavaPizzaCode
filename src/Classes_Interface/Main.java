/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Franco Gallo
 */
public class Main {
    
   
    
    public static void main(String[] args) {
        
       System.out.println("----------'JAVA PIZZA CODE'----------");
       
       Pedido r = new Pedido(1);
       Scanner sc = new Scanner(System.in); 
       boolean salirOp1 = false;
       
        do{
                boolean salirOp2 = false;
                boolean salirOp3 = false;
                boolean salirOp4 = false;
        
            try{    
                System.out.println("1) Iniciar pedido");
                System.out.println("2) Ver resumen");
                System.out.println("3) Salir del programa ");

                int opcion1 = sc.nextInt();
       
                switch(opcion1){
                
                 case 1: 
                    do{
                        System.out.println("Ingrese el numero de pedido :");
                        int numPedido = sc.nextInt();
                        Pedido s = new Pedido(numPedido);
                        r = s ; 
                            
                            do{
                                try{
                        

                      
                                    System.out.println("Agregue uno de los siguientes items... ");
                                    System.out.println("1)Agregar Pizza Simple ");
                                    System.out.println("2)Agregar Pizza Italiana ");
                                    System.out.println("3)Agregar Pizza Rucula ");
                                    System.out.println("4)Agregar Pollo Rostizado ");
                                    System.out.println("5)Agregar Lomo ");
                                    System.out.println("0)Finalizar pedido ");
                                    System.out.println("----------------------------------------");

                      
                                    int opcion2 = sc.nextInt();
                       
                                        switch(opcion2){
                                            case 0 :
                                                salirOp2 = true;
                                            break;
                                            
                                            case 1 : 
                                                s.getPizzaSimple();
                                            break;
                                            
                                            case 2 : 
                                                s.getPizzaItaliana();
                                            break;
                                            
                                            case 3 :
                                                s.getPizzaRucula();
                                            break;
                                            
                                            case 4 :
                                                do{
                                                    try{
                                                    System.out.println("Si desea agregar un adicional, seleccione una de las opciones siguientes: ");
                                                    System.out.println("1)Papas rejilla");
                                                    System.out.println("2)Papas baston ");
                                                    System.out.println("Si desea salir del menu presione 0 (cero) ");
                                                    System.out.println("----------------------------------------");

                                                
                                                    int opcionAdicional = sc.nextInt();
                                                        switch(opcionAdicional){
                                                            case 1 :
                                                                s.getRejilla();
                                                            break;
                                                            
                                                            case 2 :
                                                                s.getFritas();
                                                            break;
                                                            
                                                            case 0 :
                                                                salirOp3 = true;
                                                            break;
                                                            
                                                            default :
                                                                System.out.println("Debe ingresar un numero del 0 al 2");
                                                        }
                                                    } catch (InputMismatchException e){
                                                        System.out.println("El caracter ingresado no es valido, debe ingresar un numero ");
                                                        System.out.println("Vuelva a intentar...");
                                                        sc.next();
                                                    }   
                                                }while(!salirOp3);
                                                s.getPollo();
                                                salirOp3 = false;
                                            break;
                                            
                                            case 5 :
                                                do{
                                                    try{
                                                    System.out.println("Si desea agregar un adicional, seleccione una de las opciones siguientes: ");
                                                    System.out.println("1)Papas rejilla");
                                                    System.out.println("2)Papas baston ");
                                                    System.out.println("Si desea salir del menu presione 0 (cero) ");
                                                    System.out.println("----------------------------------------");
                                                
                                                    int opcionAdicional = sc.nextInt();
                                                        switch(opcionAdicional){
                                                            case 1 :
                                                                s.getRejilla();
                                                            break;
                                                            
                                                            case 2 :
                                                                s.getFritas();
                                                            break;
                                                            
                                                            case 0 :
                                                                salirOp4 = true;
                                                            break;
                                                            
                                                            default :
                                                                System.out.println("Debe ingresar un numero del 0 al 2");
                                                        }
                                                    } catch (InputMismatchException e){
                                                        System.out.println("El caracter ingresado no es valido, debe ingresar un numero ");
                                                        System.out.println("Vuelva a intentar...");
                                                        sc.next();
                                                    }   
                                                }while(!salirOp4);
                                                s.getLomo();
                                                salirOp4 = false;
                                            break;
                                        }
                                }catch(InputMismatchException i){
                                    System.out.println("El caracter ingresado no es válido, debe ingresar un numero");
                                    System.out.println("Vuelva a intentar....");
                                    sc.next();
                                }
                            }while(!salirOp2);
                    }while(!salirOp2);       
                break;
                    
                 case 2 :
                     System.out.println(r.getResumen());
    
                break;
                
                 case 3 :
                     salirOp1 = true;
                     System.out.println("Muchas gracias por utilizar Java Pizza Code, hasta luego!!!");
                break;
                
                 default:
                     System.out.println("Debe ingresar un digito del 1 al 3 ");   
                }
                
            } catch(InputMismatchException e){
                System.out.println("El caracter ingresado no es válido, debe ingresar un numero");
                System.out.println("Vuelva a intentar....");
                sc.next();
              }
        
        }while(!salirOp1);
    }
}