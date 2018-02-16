package CalculadoraHerencia;

import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {
        
        
        MiCalculadora calculadora1; //Definir el objeto
        calculadora1 = new MiCalculadora(); //Construir el objeto
        
        Trigonometrica trigo;
        trigo = new Trigonometrica();
       
        Scanner miEscaner = new Scanner(System.in);
        int entrada = 0;
        
        System.out.println("Bienvenido, por favor escoja la opcion: ");
        System.out.println("1. Sumar");  
        System.out.println("2. Restar");    
        System.out.println("3. Coseno");
        System.out.println("4. Multiplicar"); 
        
        try
         {
         entrada=miEscaner.nextInt();
         }
         catch( ArithmeticException e )
         {
	 System.out.println("La opcion no es valida");
         }
        
        switch (entrada){
            
            case 1:
                
                System.out.println("Por favor digite el primer numero ");
               
                entrada = miEscaner.nextInt();
                calculadora1.setx(entrada);
                
                System.out.println("Por favor digite el segundo numero ");
                entrada = miEscaner.nextInt();
                calculadora1.sety(entrada);
                
                calculadora1.sumar();
                
                break;
                
            case 2:
                
                System.out.println("Por favor digite el primer numero ");
                entrada = miEscaner.nextInt();
                calculadora1.setx(entrada);
                
                System.out.println("Por favor digite el segundo numero ");
                entrada = miEscaner.nextInt();
                calculadora1.sety(entrada);  
                
                calculadora1.restar();
                
                break;
                
            case 3:
                System.out.println("Por favor digite el numero ");

                entrada = miEscaner.nextInt();
                trigo.setx(entrada);
                
                trigo.coseno();   
                
                break;
                
            case 4:
                
                System.out.println("Por favor digite el primer numero ");
                entrada = miEscaner.nextInt();
                calculadora1.setx(entrada);
                
                System.out.println("Por favor digite el segundo numero ");
                entrada = miEscaner.nextInt();
                calculadora1.sety(entrada);  
                
                calculadora1.multi();
                break;

            default:
                System.out.println("La opcion no es valida"); 
        }
    } 
}