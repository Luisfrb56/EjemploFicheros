package com.luis.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lerPalabras {
    File fich;
Scanner sc;
    public void leerPalabras(){
     fich=new File("Primeiro.txt");
     
     try{
         //useDelimiter, para poner donde quieres que corte y haga un \n
         //Para quitar los espacios que hay antes y despues del delimitador usamos \\s* delimitador \\s*
    sc= new Scanner(fich).useDelimiter("\\s*,\\s*");
    while(sc.hasNextLine()){
         System.out.println(sc.next());
            
        }
        sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("erro1"+ex.getMessage());
        }
        
}
}