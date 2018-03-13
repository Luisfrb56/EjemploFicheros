package com.luis.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lerficheiro {
   
File fich;
Scanner sc;
    public void leerLiñas(){
      fich=new File("Primeiro.txt");
      //Comprueba que el fichero exista
       System.out.println(fich.exists());
       //try para que lea linea a linea el fichero y salte un error si se produce la excepcion
try{
    sc= new Scanner(fich);
        while(sc.hasNextLine()){
         // resposta= sc.nextLine();
            //System.out.println(resposta);
            System.out.println(sc.nextLine());
            
        }
        sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("erro1"+ex.getMessage());
        }
        
  }
}

