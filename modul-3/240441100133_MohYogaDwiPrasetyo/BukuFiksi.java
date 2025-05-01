class BukuFiksi extends Buku {
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    
    public void infoFiksi() {
        System.out.println("\n--- BUKU FIKSI ---");
        info();
        System.out.println("Genre: " + genre);
    }
}