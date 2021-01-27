/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author JackNight
 */
import java.util.*;

public class Utama {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Siswa sis = new Siswa();
        sis.array();
        
        
//        String pilih;
//        boolean benar = true;
//
//        System.out.println("Person :");
//        System.out.println("1. Guru");
//        System.out.println("2. Siswa");
//        do {
//            benar = true;
//            System.out.println("pilih data!");
//            pilih = s.nextLine();
//
//            if (pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("guru")) {
//                Guru gur = new Guru();
//                gur.setDataGuru("Joko", 1234, "XII", "Bindo");
//                gur.infoPerson();
//                System.out.println("Kelas : " + gur.getNamaKelas());
//                System.out.println("Mapel : " + gur.getNamaMapel());
//
//            } else if (pilih.equalsIgnoreCase("2") || pilih.equalsIgnoreCase("siswa")) {
//                Siswa sis = new Siswa();
//                sis.setDataSiswa();
//                sis.infoPerson();
//                System.out.println("ingin mencetak nilai akhir?");
//
//                do {
//                    benar = true;
//                    System.out.println("1. ya || 2. tidak");
//                    pilih = s.nextLine();
//                    if (pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("ya")) {
//                        System.out.println("=========================");
//                        sis.hitungNilAkhir();
//                        System.out.println("Nilai Akhir : " + sis.getNilAkhir());
//                        System.out.println("=========================");
//                    } else if (pilih.equalsIgnoreCase("2") || pilih.equalsIgnoreCase("tidak")) {
//                        System.out.println("Okelah... :')s");
//                    } else {
//                        System.out.println("Pilihan tidak tersedia!");
//                        benar = false;
//                    }
//                    System.out.println("ingin mencetak predikat?");
//                    do {
//                        benar = true;
//                        System.out.println("1. ya || 2.tidak");
//                        pilih = s.nextLine();
//                        if (pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("ya")) {
//                            System.out.println("=========================");
//                            System.out.println("Predikat siswa : " + sis.hitungNilHuruf());
//                        } else if (pilih.equalsIgnoreCase("2") || pilih.equalsIgnoreCase("tidak")) {
//                            System.out.println("Okelah... :')");
//                        } else {
//                            benar = false;
//                        }
//                    } while (benar != true);
//                } while (benar != true);
//
//            } else {
//                System.out.println("Pilihan tidak tersedia!");
//                benar = false;
//            }
//        } while (benar != true);
    }
}
