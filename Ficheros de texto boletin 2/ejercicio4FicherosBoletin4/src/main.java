
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author franr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        try {
            BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\franr\\Desktop\\texto.txt"));
            
            String line = "";
            String frase = "";
            int contador=0;
            
            while(line!=null){
                line=b1.readLine();

                if(line!=null){
                    if(contador==0){
                        frase=line;
                    }else{
                            frase=frase+"\n"+line;
                    }
                    
                }
            }
            
            b1.close();
            
            String matricula ="";
            String marca ="";
            double tamanioDeposito = 0;
            String modelo = "";
            
            System.out.print("Matricula:");
             matricula =s.next();
            System.out.print("Marca:");
             marca =s.next();
            System.out.print("Tamaño deposito:");
             tamanioDeposito= s.nextDouble();
            System.out.print("Modelo:");
             modelo =s.next();
             
             String datos="Matricula:"+matricula+";Marca:"+marca+";Tamaño deposito:"+tamanioDeposito+";Modelo:"+modelo;
             
             BufferedWriter w1 = new BufferedWriter(new FileWriter("C:\\Users\\franr\\Desktop\\texto.txt"));
             if(frase.equals(" ")){
                 frase=datos;
             }else{
                 frase=frase+"\n"+datos;
             }
             w1.write(frase);
            w1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
