/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author valentina
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here

int matri [][]=new int[3][3];
int diagop;

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
                for(int i=0;i<=matri.length;i++){

            for(int j=0;j<=matri[i].length;j++)
            {
                if(i==j){
                    
                 System.out.println("La diagonal prinicpal es");
                 System.out.println (diagop = matri[i][j]);
                }
                for (int diagop=1;c[i][j]=0;i<=matri.length){
                System.out.println("La diagonal prinicpal es 1");
                }
                }
                }
            }}
          

                


    

        
        
       
    

