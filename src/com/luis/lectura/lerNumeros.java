
package com.luis.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lerNumeros {
    File fich;
Scanner sc;
    public void leerNumeros(){
      fich=new File("Numeros.txt");
     
     try{
         
    sc= new Scanner(fich).useDelimiter("\\s*,\\s*");
    while(sc.hasNextInt()){
         System.out.println(sc.nextInt());
            
        }
        sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("erro1"+ex.getMessage());
        }
        
}
    public void sumaPares(){
         fich=new File("Numeros.txt");
        int suma=0;
             try{
         
    sc= new Scanner(fich).useDelimiter("\\s*,\\s*");
    while(sc.hasNextInt()){
        int numero=sc.nextInt();
            if(numero%2==0){
               suma+=numero;
                
            }
            
        }  
        System.out.println(suma);   
        sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("erro1"+ex.getMessage());
        }
            
    }
}