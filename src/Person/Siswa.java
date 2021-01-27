/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Interface.Statistical;
/**
 *
 * @author JackNight
 */

import java.util.Scanner;

public class Siswa extends Person implements Statistical {

    Scanner s = new Scanner(System.in);

    private int nis;
    private int nilUTS;
    private int nilUAS;
    private double nilAkhir;
    private String nilHuruf;
    private double bbtUTS;
    private double bbtUAS;

    public void setDataSiswa(int nis, String nama, int nilUTS, int nilUAS) {
        this.nis = nis;
        this.nama = nama;
        this.nilUTS = nilUTS;
        this.nilUAS = nilUAS;
    }

    public void setDataSiswa() {
        System.out.println("=========================");
        System.out.println("Masukkan NIS = ");
        this.nis = s.nextInt();
        System.out.println("Masukkan Nama = ");
        this.nama = s.next();
        do {
            System.out.println("Masukkan Nilai UTS = ");
            this.nilUTS = s.nextInt();
        } while (this.nilUTS > 100 || this.nilUTS < 0);
        do {
            System.out.println("Masukkan Nilai UAS = ");
            this.nilUAS = s.nextInt();
        } while (this.nilUAS > 100 || this.nilUAS < 0);
    }

    public void hitungNilAkhir() {
        this.nilAkhir = (this.nilUAS + this.nilUTS) / 2;
    }

    public double getNilAkhir() {
        return this.nilAkhir;
    }

    public void infoPerson() {
        System.out.println("======================");
        System.out.println("info person siswa");
        System.out.println("nama siswa : " + this.nama);
        System.out.println("nis siswa : " + this.nis);
        System.out.println("nilai UTS siswa : " + this.nilUTS);
        System.out.println("nilai UAS siswa : " + this.nilUAS);
//        System.out.println("Predikat siswa : " + this.nilHuruf);
//        System.out.println("bbtUTS siswa : " + this.bbtUTS);
//        System.out.println("bbtUAS siswa : " + this.bbtUAS);
    }

    @Override
    public double hitungRerata(Siswa data[]) {
        return 0;

    }

    public String hitungNilHuruf() {
        if (this.nilAkhir >= 90) {
            this.nilHuruf = "A";
        } else if (this.nilAkhir >= 80) {
            this.nilHuruf = "B";
        } else if (this.nilAkhir >= 70) {
            this.nilHuruf = "C";
        } else if (this.nilAkhir >= 60) {
            this.nilHuruf = "D";
        } else {
            this.nilHuruf = "E";
        }
        return this.nilHuruf;
    }

    @Override
    public void sorting(Siswa data1[]) {

    }

    @Override
    public void searching(Siswa data2[]) {

    }
    
    public void array(){
        Scanner j = new Scanner(System.in);
        int jangkau = j.nextInt();
        int ke = 1;
        Siswa [] siswa = new Siswa[jangkau];
        for(int i = 0; i < siswa.length; i++){
            System.out.println("data ke: "+ke);
            ke++;
            siswa[i] = new Siswa();
            siswa[i].setDataSiswa();
        }
        for(int i = 0; i < siswa.length; i++){
            siswa[i].infoPerson();
            siswa[i].hitungNilAkhir();
            System.out.println("nilai akhir: "+siswa[i].getNilAkhir());
            System.out.println("predikat: "+siswa[i].hitungNilHuruf());
        }
    }
}
