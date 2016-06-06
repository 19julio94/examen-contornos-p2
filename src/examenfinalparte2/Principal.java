package examenfinalparte2;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static boolean esPrimo = false;
    /**
     * En este metodo hemos introducido un objeto de tipo Scanner para que nos pida por pantalla los digitos,ademas hemos renombrado las variables para que sean mas comprensibles
     * @param arg
     * @throws IOException 
     */
    public static void main(String arg[]) throws IOException {

        int numDigitos = 0;

        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        int dig = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            numDigitos = 0;

            while (aux != 0) {
                aux = aux / 10;
                numDigitos++;
            }
            /**
             * La funcion del if es comparar que si tu introduces un numero ,no sea mayor que el que pide que en este caso es 4,si nos mayor que mostrara 
             * todos los numeros primos que hay desde el  hasta el 9999
             */
            //quitamos la variable contador y en el if ponemos la variable ndig ya que el funcionamiento será el mismo
            if (numDigitos == dig) {
                if (i < 4) {
                    esPrimo = true;
                } else if (i % 2 == 0) {
                    esPrimo = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (i - 1) / 2;
                    if (k % 2 == 0) {
                        k--;
                    }

                    while (i1 <= k) {
                        if (i % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = k + 1;
                        }
                    }

                    if (contador1 == 1) {
                        esPrimo = true;
                    }
                }
                /**
                 * en este if si la condicion se cumple pues nos mostrara por pantalla los numeros primos
                 */
                if (esPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
