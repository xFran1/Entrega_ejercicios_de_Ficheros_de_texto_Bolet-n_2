
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author franr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        try {
            BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\texto.txt"));
            
            String line = "";
            String frase = "";
             while (line != null) {
                line = b1.readLine();
                if(line!=null){
                frase = frase + " " + line;

                }
           
            }
             
             String fraseSeparada[] = frase.split(" +");
             frase="";
             
             System.out.println("Escribe una palabra");
             String palabra = s.next();
             boolean palabraEncontrada = false;
             
             for(int i=0;i<fraseSeparada.length;i++){
                     
                 if(fraseSeparada[i].equals(palabra)){
                     palabraEncontrada=true;
                 }
                 frase=frase+" "+fraseSeparada[i];
                 
             }
             System.out.println(palabraEncontrada);
             b1.close();
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
}
