/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturas;

/**
 *
 * @author niza
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   
        int[] temperatures = {-20, 0, 1, 2, 3, 4, 5, 10, 50, 100}; 

        System.out.println("Temperaturas para 24 horas:");
        System.out.println("     -30                0                 30      60      90     120");

        for (int temperature : temperatures) {
            System.out.printf("%4d ", temperature);

            int asterisknumber = Math.round((float)(temperature + 30) / 3);

            for (int i = 0; i < asterisknumber; i++) {
                System.out.print("*");
            }

            System.out.println("|");
        }
    }
}

    

