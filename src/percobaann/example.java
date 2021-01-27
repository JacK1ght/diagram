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
import java.util.Scanner;
public class example {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String temp;
        int jangkau;
        
        jangkau = Integer.parseInt(s.nextLine()); //menggunakan perseInt jika inputan pertama terskip
        System.out.println("========================");
        car [] cars = new car[jangkau];
        
        
        for(int i = 0; i < cars.length; i++){
            System.out.println("masukkan model mobil: ");
            temp = s.nextLine();
            cars[i] = new car();
            cars[i].setCar(temp);
        }
        System.out.println("==================================");
        for(int i = 0; i < cars.length; i++){
            System.out.println("cars model: "+cars[i].getCar());
        }
    }
}
