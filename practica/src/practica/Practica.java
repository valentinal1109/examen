/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author valentina
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int matri [][]=new int[3][3];
 int matri2 [][]=new int[3][3];
 int matri3 [][]=new int[3][3];
 
 Scanner leer= new Scanner(System.in);
 
 for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la fila de la matriz de izquierda a derecha");
    matri [0][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri [0][0]);                   
        System.out.println (matri [0][1]); 
        System.out.println (matri [0][2]); 
       
 for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la segunda fila de la matriz de izquierda a derecha");
    matri [1][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri [1][0]);                  
        System.out.println (matri [1][1]);
        System.out.println (matri [1][2]);
        
for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la tercera y ultima fila de la matriz de izquierda a derecha");
    matri [2][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri [2][0]);                  
        System.out.println (matri [2][1]);
        System.out.println (matri [2][2]);
        
    System.out.println("Su primera matriz es:");
    System.out.println("|"+(matri [0][0])+"|"+(matri [0][1])+"|"+(matri [0][2])+"|");
    System.out.println("|"+(matri [1][0])+"|"+(matri [1][1])+"|"+(matri [1][2])+"|");
    System.out.println("|"+(matri [2][0])+"|"+(matri [2][1])+"|"+(matri [2][2])+"|");  
 
  
 System.out.println("---------------------"); 
 
  for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la fila de la segunda matriz de izquierda a derecha");
    matri2 [0][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri2 [0][0]);                   
        System.out.println (matri2 [0][1]); 
        System.out.println (matri2 [0][2]); 
 
  for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la segunda fila de la segunda matriz de izquierda a derecha");
    matri2 [1][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri2 [1][0]);                  
        System.out.println (matri2 [1][1]);
        System.out.println (matri2 [1][2]);
 
 for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la tercera y ultima fila de la segunda matriz de izquierda a derecha");
    matri2 [2][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri2 [2][0]);                  
        System.out.println (matri2 [2][1]);
        System.out.println (matri2 [2][2]);
 
    System.out.println("Su segunda matriz es:");
    System.out.println("|"+(matri2 [0][0])+"|"+(matri2 [0][1])+"|"+(matri2 [0][2])+"|");
    System.out.println("|"+(matri2 [1][0])+"|"+(matri2 [1][1])+"|"+(matri2 [1][2])+"|");
    System.out.println("|"+(matri2 [2][0])+"|"+(matri2 [2][1])+"|"+(matri2 [2][2])+"|"); 
 
  System.out.println("---------------------"); 
  
  for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la fila de la tercera matriz de izquierda a derecha");
    matri3 [0][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri3 [0][0]);                   
        System.out.println (matri3 [0][1]); 
        System.out.println (matri3 [0][2]); 
 
   for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la segunda fila de la tercera matriz de izquierda a derecha");
    matri3 [1][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri3 [1][0]);                  
        System.out.println (matri3 [1][1]);
        System.out.println (matri3 [1][2]);
 
  for(int i=0;i<=2;i++)
{
    System.out.println("Introduzca la tercera y ultima fila de la tercera matriz de izquierda a derecha");
    matri3 [2][i]=leer.nextInt();
}
     System.out.println("los numeros introducidos son");
        System.out.println (matri3 [2][0]);                  
        System.out.println (matri3 [2][1]);
        System.out.println (matri3 [2][2]);
 
    System.out.println("Su tercera matriz es:");
    System.out.println("|"+(matri3 [0][0])+"|"+(matri3 [0][1])+"|"+(matri3 [0][2])+"|");
    System.out.println("|"+(matri3 [1][0])+"|"+(matri3 [1][1])+"|"+(matri3 [1][2])+"|");
    System.out.println("|"+(matri3 [2][0])+"|"+(matri3 [2][1])+"|"+(matri3 [2][2])+"|"); 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  } 
}   
        // TODO code application logic here
    
    
