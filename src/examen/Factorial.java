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
public class Factorial {

    public static void main(String[] args) {

        int variable1;
        int variable2;

        variable1 = 8;

        int i;
        if (variable1 == 0) {
            variable2 = 1;
        } else {
            variable2 = 1;
            for (i = variable1; i >= 1; i--) {
                variable2 = variable2 * i;
            }
        }

        System.out.println(variable2);

    }

}
