/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran
 */
public class Ejercicio4Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        try {
                                ArrayList<String> array= new ArrayList<>();
                                String line="";
            String lineFinal="";
            //BufferedReader t1 = new BufferedReader(new FileReader("C:\\Users\\Fran\\Desktop\\"+args[0]));
                BufferedReader t1 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\palabras.txt"));
//String palabra=args[0];
            String palabra="palabras.txt";
            
            String[] parts = palabra.split("\\.");   
           parts[0]=parts[0]+"_sort.";
            
            String palabraNueva = parts[0]+parts[1];
            BufferedWriter b1 = new BufferedWriter(new FileWriter("C:\\Users\\franr\\Desktop\\"+palabraNueva));

            System.out.println(palabraNueva);
            
             while(line != null){
                 line=t1.readLine();

                 if(line!=null){
                     lineFinal=lineFinal+" "+line;
                     
                }

                                     //           lineFinal=lineFinal+" "+line;
             }
             
             
             String arrayLineas[]=lineFinal.split(" +");
             
             for(int i = 0;i<arrayLineas.length;i++){
                 array.add(arrayLineas[i]);
                 
             }
             
            Collections.sort(array);
             for(String name:array){
                if(name==null){
                                     

                }else{
                    System.out.println(name);
                    b1.write(name+"\n");
                }
                     
                 
             }
           //  System.out.println(palabraNueva);
            // lineFinal=lineFinal.replaceAll("null","");
            t1.close();
            b1.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio4Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}
