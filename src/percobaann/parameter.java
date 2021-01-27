/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaann;

/**
 *
 * @author JackNight
 */
public class parameter {
    public static void main (String args []){
        int array[] = {2,13,15,67,87,34,66,23,11,93};
        printTable (array);
    }

    static void printTable (int[] array){
        System.out.println ("Key\tValue");
        for (int key = 0; key < array.length; key++){
            System.out.println (key + "\t" + array [key]);
        }
    }
}
