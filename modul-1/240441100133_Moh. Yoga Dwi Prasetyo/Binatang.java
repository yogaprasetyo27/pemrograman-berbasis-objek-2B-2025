package com.mycompany.binatang;

class Hewan {
    String nama;
    int jumlah;
    String jenisKelamin;

    public Hewan(String n, int j, String jk) {  /* construktor*/
        nama = n;
        jumlah = j;
        jenisKelamin = jk;
    }

    void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Jenis kelamin: " + jenisKelamin);
    }
}

class Kucing extends Hewan { /* subclas hwn*/
    String ras;
    String warnaBulu;
    String suara;

    public Kucing(String n, int j, String jk, String r, String wb, String s) {  /* construktor*/
        super(n, j, jk); /* panggil dgn super */
        ras = r;
        warnaBulu = wb;
        suara = s;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras: " + ras);
        System.out.println("Warna bulu: " + warnaBulu);
        System.out.println("Suara: " + suara);
    }
}

class Kelinci extends Hewan {
    String jenis;
    String warnaBulu;
    String makanan;

    public Kelinci(String n, int j, String jk, String jns, String wb, String m) { /* construktor*/
        super(n, j, jk);
        jenis = jns;
        warnaBulu = wb;
        makanan = m;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna bulu: " + warnaBulu);
        System.out.println("Makanan: " + makanan);
    }
}

class Ikan extends Hewan {
    String warna;
    String jenisIkan;
    String habitat;

    public Ikan(String n, int j, String jk, String w, String ji, String h) { /* konstruktor*/
        super(n, j, jk);
        warna = w;
        jenisIkan = ji;
        habitat = h;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna: " + warna);
        System.out.println("Jenis ikan: " + jenisIkan);
        System.out.println("Habitat: " + habitat);
    }
}

public class Binatang {
    public static void main(String[] args) {
        Hewan[] hewanArray = new Hewan [3];

        hewanArray[0] = new Kucing("Simon", 10, "Laki-laki", "Persia", "Silver", "Meong");
        hewanArray[1] = new Kelinci("Suneo", 15, "Laki-laki", "Anggora", "bu-abu", "Wortel");
        hewanArray[2] = new Ikan("Ikan mujaer", 50, "Perempuan", "Coklat", "Nila", "Air tawar");

        System.out.println("Daftar hewan: ");
        for (int i = 0; i < hewanArray.length; i++) {
            System.out.println("Hewan ke-" + (i + 1) + ":");
            hewanArray[i].tampilkanInfo(); 
            System.out.println("----------------------------------");
        }
    }
}