package com.mycompany.manusia;

public class Manusia {
    String nama;
    int umur;
    String alamat;
    
    void setManusia(String n, int u, String a){
        nama = n;
        umur = u;
        alamat = a;
    }
    
    void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
    
    void berjalan(){
        System.out.println(nama + " sedang berjalan");
    }
    
    void berlari(){
        System.out.println(nama + " sedang berlari");
    }
    
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        orang1.setManusia("Agus", 25, "Surabaya");
        orang1.tampilkanInfo();
        orang1.berjalan();
        orang1.berlari();
        System.out.println();
        
        Manusia orang2  = new Manusia();
        orang2.setManusia("Agung", 59, "Mojokerto");
        orang2.tampilkanInfo();
        orang2.berjalan();
        orang2.berlari();
        System.out.println();
        
        Manusia orang3 = new Manusia();
        orang3.setManusia("Budiono", 20, "Sidoarjo");
        orang3.tampilkanInfo();
        orang3.berjalan();
        orang3.berlari();
        System.out.println();
        
        Manusia orang4 = new Manusia();
        orang4.setManusia("Slamet", 15, "Ngawi");
        orang4.tampilkanInfo();
        orang4.berjalan();
        orang4.berlari();
        System.out.println();
        
        Manusia orang5 = new Manusia();
        orang5.setManusia("Cahyo", 30, "Palembang");
        orang5.tampilkanInfo();
        orang5.berjalan();
        orang5.berlari();
        System.out.println();
    }
}
