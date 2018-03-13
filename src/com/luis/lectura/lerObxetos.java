
package com.luis.lectura;

import com.luis.persoas.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class lerObxetos {
File fich;
Scanner sc;

    public void leerObxetos(){
        String linea;
        String[]lista=new String[2];
        Alumno alu;
         try{
        sc= new Scanner(new File("Alumno.txt"));
        while(sc.hasNextLine()){
            linea=sc.nextLine();
                   lista=linea.split(",");
                   alu=new Alumno(lista[0],Integer.parseInt(lista[1]));
                   System.out.println(alu);
        }
    }catch(FileNotFoundException ex){
            System.out.println("erro lectura obxetos "+ex.getMessage());
        }
    }
    public void listaSuspensos(){
              String linea;
        String[]lista=new String[2];
        Alumno alu;
        ArrayList<Alumno>lsuspensos;
         try{
        sc= new Scanner(new File("Alumno.txt"));
        while(sc.hasNextLine()){
            linea=sc.nextLine();
                   lista=linea.split(",");
                   alu=new Alumno(lista[0],Integer.parseInt(lista[1]));
                   if(Integer.parseInt(lista[1])<5){
                       
                   }
                   
        }
    }catch(FileNotFoundException ex){
            System.out.println("erro lectura obxetos "+ex.getMessage());
        }
    }
}
