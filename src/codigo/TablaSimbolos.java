/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cosmo
 */
public class TablaSimbolos {
    private static ArrayList<objeto> tabla;
    private static ArrayList<objeto> repetidos;
    public TablaSimbolos(){
        tabla=new ArrayList<>();
        repetidos=new ArrayList<>();
    }
    
    public static void agregar(objeto a){
        repetidos.add(a);
        
        
     if(buscarElemento(a.nombre)!=true){
         tabla.add(a);
     }
     
    }
    
    
    public ArrayList Repetidos(){
        return repetidos;
    }
    
    public ArrayList getArray(){
        return tabla;
    }
    
    public static void imprimir(){
    
        System.out.println(tabla.toString());
    }
    public static boolean buscarElemento(String nombre){
    boolean encontrado=false;
    int i=0;
    objeto e;
    
     while(i<tabla.size())
    {
      e= (objeto)tabla.get(i);
      if(e.getNombre().equals(nombre)){
        encontrado=true;
        break;
      } 
    
      i++;
    }
     return encontrado;
    }
    
    public boolean repetidos (){
        boolean repetidos=false;
        boolean bandera=false;
        objeto x;
        objeto y;
      
         int contadorRepetidos=1;
         int contadorNoRepetidos=1;
        
            for (int i = 0; i < tabla.size(); i++) {
                x=tabla.get(i);
                System.out.println(x.toString());
                for (int j = 0; j < tabla.size(); j++) {
                    y=tabla.get(j); 
                     System.out.println(y.toString());
                   
                    if((x.nombre.equals(y.nombre)&&(x.tipo.equals(y.tipo)))){    
                           
                       
                    }
                }
                
               
               
            }
        
        
         
    
   return repetidos;
                               
    }
    
   
}
