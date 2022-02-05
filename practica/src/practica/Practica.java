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
       
                
 //System.out.println("Introduzca un numero");
 //num=leer.nextInt();
 //System.out.println("El numeroes:"+num);//
 
 
  

  } 
}   
        // TODO code application logic here
    
    
