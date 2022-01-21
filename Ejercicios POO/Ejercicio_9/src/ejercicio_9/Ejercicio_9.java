/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import ejercicio_9.servicios.ServiciosMatematica;
import ejercicio_9.utilidades.Matematica;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set. En el main
 * se creará el objeto y se usará el Math.random para generar los dos números y
 * se guardaran en el objeto con su respectivos set. Deberá además implementar
 * los siguientes métodos: • Método devolverMayor() para retornar cuál de los
 * dos atributos tiene el mayor valor • Método calcularPotencia() para calcular
 * la potencia del mayor valor de la clase elevado al menor número. Previamente
 * se deben redondear ambos valores. • Método calculaRaiz(), para calcular la
 * raíz cuadrada del menor de los dos valores. Antes de calcular la raíz
 * cuadrada se debe obtener el valor absoluto del número.
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServiciosMatematica nm = new ServiciosMatematica();
                        
        Double numAleat1 = (Double) Math.random() * 10;
        Double numAleat2 = (Double) Math.random() * 10;
        
        Matematica mat = new Matematica(numAleat1, numAleat2);
        
        nm.mostrarNumeros(mat);
        
        nm.devolverMayor(mat);
        
        nm.calcularPotencia(mat);
        
        nm.calcularRaiz(mat);

    }

}
