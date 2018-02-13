
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        
       MiCalculadora calculadora1; //Definir el objeto
       
       calculadora1 = new MiCalculadora(); //Construir el objeto
       
        Scanner entrada = new Scanner(System.in);
        
        int op;
        
        System.out.println("Bienvenido, por favor escoja la opcion: ");
        System.out.println("1. Sumar");  
        System.out.println("2. Restar");    
        System.out.println("3. Coseno");    
        
        op=entrada.nextInt();
        
        switch (op){
            
            case 1:
               
                entrada = miEscaner.nextInt();
                MiCalculadora.setX(entrada);
                
                entrada = miEscaner.nextInt();
                MiCalculadora.setY(entrada);
                sumar();
                
                break;
                
            case 2:
                
                entrada = miEscaner.nextInt();
                MiCalculadora.setX(entrada);
                
                entrada = miEscaner.nextInt();
                MiCalculadora.setY(entrada);  
                restar();
                
                break;
                
            case 3:

                entrada = miEscaner.nextInt();
                MiCalculadora.setX(entrada);
                
                coseno(MiCalculadora.setX(entrada));
         
                break;
                
            default:
                System.out.println("La opcion no es valida"); 
        }
    }
    
}
