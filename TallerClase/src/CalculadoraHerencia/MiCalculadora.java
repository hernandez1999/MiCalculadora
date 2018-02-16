
package CalculadoraHerencia;


public class MiCalculadora {
    
    
    protected int x;
    private int y;
    private int r;

    int sumar() {

        r = x + y;
        
        System.out.println("El resultado es igual a:" +r);
        
        return r;
    }

    int restar() {
       
        r = x - y;
        
        System.out.println("El resultado es igual a:" +r);
        
        return r;
    }
    
    int multi(){
        
        r=x*y;
        
        System.out.println("El resultado es igual a:" +r);
        
        return r;
    }    
    
    
    float divi(){
        r=x/y;
        
        System.out.println("El resultado es igual a:" +r);
        
        return r;
    }
   public void setx(int x){
       this.x = x;
   }
   
   public void sety(int y){
       this.y = y;
   }

    public int getR() {
        
        return r;
    }
}
