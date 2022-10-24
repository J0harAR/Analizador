
package codigo;
public class objeto {
    String nombre;
    String valor;
    String tipo;
    
    public String toString()
    {
      return nombre+" "+valor+" "+tipo;
    }
    
    public objeto(String pnombre, String ptipo)
    {
        nombre= pnombre;
        tipo= ptipo;
    }
    
    public void setNombre(String pnombre)
    {
      nombre= pnombre;
    }
    
    public String getNombre()
    {
      return nombre;
    }

    public void setValor(String pvalor) {
        this.valor = pvalor;        
    }
    
    public String getValor() {
        return valor;        
    }
    
    public void setTipo(String ptipo) {        
        this.tipo = ptipo;
    }

   public String getTipo() {        
        return tipo;
    }
    
    
}
