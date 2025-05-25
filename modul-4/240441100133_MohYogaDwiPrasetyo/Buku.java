public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    
    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
    
    @Override
    public String toString() {
        return "Judul: " + judul +
                ". Penulis: " + penulis +
                ". Jumlah: " + jumlahHalaman;
    }
}
