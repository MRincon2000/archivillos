/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.util.*;
import java.io.*;
/**
 *
 * @author mrincono
 */
public class Archivito {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
        throws FileNotFoundException {
        File liguillas=new File("liguillas.txt");
        File salida=new File("salida.txt");
  Scanner input=new Scanner(liguillas);
     int numero = input.nextInt();
     String nombreLiga=input.next();
     Liga l1=new Liga(nombreLiga);
        System.out.println(nombreLiga);
        System.out.println(numero);
          PrintStream equipillos=new PrintStream(salida);
     for(int i=0;i<numero;i++){
         String nombreEquipo=input.next();
         l1.añadirEquipo(nombreEquipo);
         System.out.println(nombreEquipo);

     }
     try{
     if(salida.exists()){
         
     }
     else{
         salida.createNewFile();
     }
         
     for(int s=0;s<l1.getTeams().size();s++){
       String n=l1.getTeams().get(s).getNombre();
       equipillos.println(n);
       equipillos.flush();
     }
     }
     catch(IOException a){
         System.out.println("no se pudo crear");
     }
    }
    }

