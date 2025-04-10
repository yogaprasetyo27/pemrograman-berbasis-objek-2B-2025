package com.mycompany.inputan;
import java.util.Scanner;

public class Inputan {

    static class Mahasiswa {
        String nama;
        int nim;
        String prodi;
        String alamat;
        
        void tampilkanInfo() {
            System.out.println("----------------------------------------");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Prodi: " + prodi);
            System.out.println("Alamat: " + alamat);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("==========================================");
        System.out.print("Nama: ");
        m1.nama = input.nextLine();
        System.out.print("NIM: ");
        m1.nim = input.nextInt();
        input.nextLine();
        System.out.print("Prodi: ");
        m1.prodi = input.nextLine();
        System.out.print("Alamat: ");
        m1.alamat = input.nextLine();
        
        Mahasiswa m2 = new Mahasiswa();
        System.out.println("==========================================");
        System.out.print("Nama: ");
        m2.nama = input.nextLine();
        System.out.print("NIM: ");
        m2.nim = input.nextInt();
        input.nextLine();
        System.out.print("Prodi: ");
        m2.prodi = input.nextLine();
        System.out.print("Alamat: ");
        m2.alamat = input.nextLine();
       
        Mahasiswa m3 = new Mahasiswa();
        System.out.println("==========================================");
        System.out.println("");
        System.out.print("Nama: ");
        m3.nama = input.nextLine(); 
        System.out.print("NIM: ");
        m3.nim = input.nextInt();
        input.nextLine();
        System.out.print("Prodi: ");
        m3.prodi = input.nextLine();
        System.out.print("Alamat: ");
        m3.alamat = input.nextLine();
        
        System.out.println("==========================================");
        System.out.println("Data Mahasiswa:");
        m1.tampilkanInfo();
        m2.tampilkanInfo();
        m3.tampilkanInfo();    
    }
}