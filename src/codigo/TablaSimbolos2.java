package codigo;

import java.util.Vector;
import codigo.objeto;

public class TablaSimbolos2 {
  private static Vector tabla = new Vector();    

    public TablaSimbolos2() {
    }
  
  public static void crearEntrada(String nombre, String tipo)
  {
  String subStr;
  objeto e= TablaSimbolos2.busca(nombre);
  if(e==null)
  {
  e = new objeto(nombre, tipo);
  tabla.add(e);  
  }
  else
      {
  }
  }
  
  
  public static String getTipo(String nombre)
  {
    objeto e= TablaSimbolos2.busca(nombre);
    if(e==null)
     {
       
     }
    return e.getTipo();    
  }
  
  public static String getValor(String nombre)
  {
    objeto e= TablaSimbolos2.busca(nombre);
    if(e==null)
     {
       
     }
    return e.getValor();    
  }
  
  public static objeto busca(String nombre)
  {
    objeto e= null;
    int i=0;
    while(i<tabla.size())
    {
      e= (objeto)tabla.elementAt(i);
      if(e.getNombre().equals(nombre)) break;
      e= null;
      i++;
    }
    return e;
  }
  
  public static Vector getTabla()
  {
    return tabla;
  }
  
  public static void Imprimir()
  {
    for(int i=0; i<tabla.size();i++)
    {
       System.out.println( tabla.elementAt(i).toString());
    }
  }
  
  public static void setValor(String pnombre, String pval)
  {
    objeto e= null;
    int i=0;
    while(i<tabla.size())
    {
      e= (objeto)tabla.elementAt(i);
      if(e.getNombre().equals(pnombre))
      {
        e.setValor(pval);
        tabla.set(i, e);
        break;
      }
      e= null;
      i++;
    }
  }
}

