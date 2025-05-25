public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    
    public Pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public String getKeluhan() {
        return keluhan;
    }
    
    public void updateKeluhan(String keluhanBaru) {
        this.keluhan = keluhanBaru;
        System.out.println("Keluhan pasien atas nama " + nama + " telah diperbarui");
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama +
                ", Umur: " + umur +
                ", Keluhan: " + keluhan;
    }
}
