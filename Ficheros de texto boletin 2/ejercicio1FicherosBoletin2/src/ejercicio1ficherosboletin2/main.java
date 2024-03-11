/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1ficherosboletin2;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
Crea una aplicación donde pidamos la ruta de un fichero por teclado y un texto que queramos a
escribir en el fichero.
Deberás mostrar por pantalla el mismo texto pero variando entre mayúsculas y minúsculas, es
decir, si escribo “Bienvenido” deberá devolver “bIENVENIDO”. Si se escribe cualquier otro
carácter, se quedara tal y como se escribió.
Deberás crear un método para escribir en el fichero el texto introducido y otro para mostrar el
contenido en mayúsculas.

 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedWriter b1 = new BufferedWriter(new FileWriter("C:\\Users\\franr\\Desktop\\rutafichero.txt"));
        BufferedWriter b2 = new BufferedWriter(new FileWriter("C:El\\Users\\franr\\Desktop\\mayusculas.txt"));

        
        System.out.println("Escriba el texto que quieras escribir en el fichero");
        String texto = s.nextLine();
        
        b1.write(texto);
        b1.close();
        
        String textoSeparado[] = texto.split(" +");
        
        
        char[] palabra1 = textoSeparado[0].toCharArray();
        
        String palabraPrimera = "";
        
        for(int i = 0;i<palabra1.length;i++){
            if(Character.isUpperCase(palabra1[i])){
                String letra="";
                letra=letra+palabra1[i];
                letra=letra.toLowerCase();
                palabraPrimera=palabraPrimera+letra;
            }else{
                String letra="";
                letra=letra+palabra1[i];
                letra=letra.toUpperCase();
                palabraPrimera=palabraPrimera+letra;

            }
            
        }
        
        for(int i = 1;i<textoSeparado.length;i++){
            palabraPrimera=palabraPrimera+" "+textoSeparado[i];
        }
        
        System.out.println(palabraPrimera);
        
        b2.write(palabraPrimera);
        b2.close();
        
        
        
    }
    
}
