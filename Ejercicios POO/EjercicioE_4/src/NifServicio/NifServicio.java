/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NifServicio;

import java.util.Scanner;
import utilidades.Nif;

/**
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
public class NifServicio {
    
    public Nif craeNif() {
        
        Scanner leer = new Scanner(System.in);
        
        Nif nn = new Nif();
        
        System.out.print("Ingrese el número del DNI: ");
        nn.setDni(leer.nextLong());
        
       int resto = (int) nn.getDni()%23;
        
        switch  (resto) {
            
            case 0:
                nn.setNif("T");
                break;
            case 1:
                nn.setNif("R");
                break;
            case 2:
                nn.setNif("W");
                break;
            case 3:
                nn.setNif("A");
                break;
            case 4:
                nn.setNif("G");
                break;
            case 5:
                nn.setNif("M");
                break;
            case 6:
                nn.setNif("Y");
                break;
            case 7:
                nn.setNif("F");
                break;
            case 8:
                nn.setNif("P");
                break;
            case 9:
                nn.setNif("D");
                break;
            case 10:
                nn.setNif("X");
                break;
            case 11:
                nn.setNif("B");
                break;
            case 12:
                nn.setNif("N");
                break;
            case 13:
                nn.setNif("J");
                break;
            case 14:
                nn.setNif("Z");
                break;
            case 15:
                nn.setNif("S");
                break;
            case 16:
                nn.setNif("O");
                break;
            case 17:
                nn.setNif("V");
                break;
            case 18:
                nn.setNif("H");
                break;
            case 19:
                nn.setNif("L");
                break;
            case 20:
                nn.setNif("C");
                break;
            case 21:
                nn.setNif("K");
                break;
            case 22:
                nn.setNif("E");
                break;
                                
        }
                      
        return nn;
    }
    
    public void mostrarNif(Nif nn) {
        
        System.out.println("El NIF del DNI ingresado es " + nn.getDni() + "-" + nn.getNif());
        
    }
    
}
