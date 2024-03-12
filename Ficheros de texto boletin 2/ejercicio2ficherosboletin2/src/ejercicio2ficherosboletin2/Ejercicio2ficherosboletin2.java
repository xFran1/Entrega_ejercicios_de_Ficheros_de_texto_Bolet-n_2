/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2ficherosboletin2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
Escribir un método que reciba por parámetro el número correspondiente a un mes del año y la
letra correspondiente al día de la semana en que cae el día 1 de ese mes (‘L’ para Lunes, ‘M’
para Martes, ‘X’ para Miércoles…).
El método escribirá en un archivo un calendario para ese mes que estará formado por todos los
días del mes seguidos de la letra correspondiente al día de la semana en que caen. El método
comprobará que los parámetros recibidos son correctos y obtendrá el nombre concatenando a la
palabra “mes” el número de mes recibido más la extensión “.txt”.
Ejemplo: Si el método recibe el valor 3 (Marzo) y la letra ‘M’ indicando que el 1 de Marzo es
Martes, obtendrá el nombre de archivo “mes3.txt” y lo escribirá con un calendario que tendrá
un aspecto como éste: 1M2X3J5V6S7D8L…31J
 */
public class Ejercicio2ficherosboletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //String num = args[0];
        //String dia = args[1];
        
         String num = "3";
        String dia = "J";
        
        
        int diaNum = 0 ;
        switch (dia) {
            case "L":
                diaNum=0;
                break;
            case "M":
                                diaNum=1;

                break;
            case "X":
                                diaNum=2;

                break;
            case "J":
                                diaNum=3;

                break;
            case "V":
                                diaNum=4;

                break;
            case "S":
                                diaNum=5;

                break;
            case "D":
                                diaNum=6;

                break;
            default:
                throw new AssertionError();
        }
        
        
        String arrayDias[] = {"L","M","X","J","V","S","D"};
        String arrayFinal[] = new String[31];
        int i = 0;
        int j = 0;
        
        do{           
         
        
            for(j = 0+diaNum ;j<arrayDias.length;j++){
                if(i<31){
                arrayFinal[i]=(i+1)+arrayDias[j];
                i++;
                    
                }
                            
            }
            diaNum=0;
            j=0;
            
        }while(i<31);    
        
                    BufferedWriter b1 = new BufferedWriter(new FileWriter("C:\\Users\\Fran\\Desktop\\Calendario.txt"));

        String fraseFinal = "";
        for(i = 0 ;i<arrayFinal.length;i++){
            System.out.println(arrayFinal[i]);
            fraseFinal=fraseFinal+arrayFinal[i];
        }
            b1.write(fraseFinal);
        
        b1.close();
    }
    
}
