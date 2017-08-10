
package tarea.pkg3;

import java.util.Scanner;

public class Menu {
    // Atributos
    Scanner leer;
    int op;
    
    // Constructor
    Menu(){
        leer= new Scanner(System.in);
        op = 0;
        imprimir();
    }
    // Metodos
    public void imprimir(){
        do {
            System.out.println("Tarea #3");
            System.out.println("");
            System.out.println("201700001");
            System.out.println("");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palindromas");
            System.out.println("3. Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("caso1");
                break; 
                
                case 2:
                    System.out.println("caso2");
                break;
               
                      
            }
            
        } while (op!=3);
        
    } 
}
