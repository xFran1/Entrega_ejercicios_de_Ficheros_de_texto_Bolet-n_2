/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran
 */
public class Ejercicio3Ficheros {

    /**
     * @param args the command line arguments
     */
    //texto1 texto2
    public static void main(String[] args) throws IOException {
        //  
        //int texto2Longitud 
        String line1 = "";
        String line2 = "";
        String frase1 = "";
        String frase2 = "";

        String fraseFinal = "";

        try {

            
            
            BufferedReader t1 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\" + args[0]));
            //BufferedReader t1 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\texto1.txt"));

            BufferedReader t2 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\" + args[1]));
            //BufferedReader t2 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\texto2.txt"));

            while (line1 != null || line2 != null) {
                line1 = t1.readLine();
                frase1 = frase1 + " " + line1;

                line2 = t2.readLine();
                frase2 = frase2 + " " + line2;

            }

            frase1 = frase1.replaceAll("null", "");
            frase2 = frase2.replaceAll("null", "");

            String frase1dividida[] = frase1.split(" +");
            String frase2dividida[] = frase2.split(" +");

            int longitud = 0;
            if (frase1dividida.length > frase2dividida.length) {
                longitud = frase1dividida.length;

            } else {
                longitud = frase2dividida.length;

            }
            int i = 0;
            do {
                if (i < frase1dividida.length) {
                    fraseFinal = fraseFinal + " " + frase1dividida[i];
                }

                if (i < frase2dividida.length) {
                    fraseFinal = fraseFinal + " " + frase2dividida[i];
                }

                i++;

            } while (longitud > i);

            System.out.println(fraseFinal);
            BufferedWriter b1 = new BufferedWriter(new FileWriter("C:\\Users\\franr\\Desktop\\Reorganizado.txt"));
            b1.write(fraseFinal);
            b1.close();
            System.out.println(fraseFinal);
            t1.close();
            t2.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio3Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
