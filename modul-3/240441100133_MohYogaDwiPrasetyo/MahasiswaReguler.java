public class MahasiswaReguler extends Mahasiswa {
    String kelas;
    
    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }
    
    public void infoReguler() {
        infoMahasiswa();
        System.out.println("Kelas: " + kelas);
        System.out.println("--------------------");
    }
}