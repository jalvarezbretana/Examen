/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author jalvarezbretana
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;

    public static void main(String arg[]) {
        int numDigitos1 = 0;
        int numDigitos2 = 0;
        numDigitos1 = Integer.parseInt(arg[0]);
        if (numDigitos1 <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int inicio1 = 1; inicio1 <= 99999; inicio1++) {
            int divisor = inicio1;
            int contador1 = 0;

            while (divisor != 0) {
                divisor = divisor / 10;
                contador1++;
            }
            numDigitos2 = contador1;

            if (numDigitos2 == numDigitos1) {
                if (inicio1 < 4) {
                    p = true;
                } else {
                    if (inicio1 % 2 == 0) {
                        p = false;
                    } else {
                        int contador2 = 0;
                        int inicio2 = 1;
                        int lugar = (inicio1 - 1) / 2;
                        if (lugar % 2 == 0) {
                            lugar--;
                        }
                        while (inicio2 <= lugar) {
                            if (inicio1 % inicio2 == 0) {
                                contador2++;
                            }
                            inicio2 += 2;
                            if (contador2 == 2) {
                                inicio2 = lugar + 1;
                            }
                        }

                        if (contador2 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(inicio1);
                }
            }
        }
    }
}
