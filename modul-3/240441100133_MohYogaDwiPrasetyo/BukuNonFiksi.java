class BukuNonFiksi extends Buku {
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }
    
    public void infoNonFiksi() {
        System.out.println("\n--- BUKU NON-FIKSI ---");
        info();
        System.out.println("Topik: " + topik);
    }
}