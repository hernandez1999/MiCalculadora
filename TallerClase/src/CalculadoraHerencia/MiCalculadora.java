
package CalculadoraHerencia;


public class MiCalculadora {
    
    
    protected int x;
    private int y;
    private int r;

    int sumar() {

        r = x + y;
        return r;
    }

    int restar() {
       
        r = x - y;
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