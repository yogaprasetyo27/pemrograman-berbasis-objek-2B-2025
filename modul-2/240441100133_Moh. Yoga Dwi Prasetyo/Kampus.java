package modul2;

public class Kampus {
    String nama;
    String alamat;
    boolean dataValid = true;
    
    public static int totalMahasiswa;

    public Kampus(String nama, String alamat) {
        if (!isValidNama(nama)) {
            System.out.println("Nama kampus tidak valid. Tidak boleh mengandung angka yaa...");
            dataValid = false;
            return;
        }
        this.nama = nama;
        this.alamat = alamat;
        totalMahasiswa = Mahasiswa.getJumlahMahasiswa();
    }

    public static boolean isValidNama(String nama) {
        return !nama.matches(".*\\d.*"); // ga blh ngandung angka
    }

    public static void tampilkanInfoKampus(String nama, int totalMahasiswa) {
        System.out.println("Kampus: " + nama);
        System.out.println("Jumlah Mahasiswa: " + totalMahasiswa);
        System.out.println("Validasi Nama Kampus: " + (isValidNama(nama) ? "Valid" : "Tidak Valid"));
    }
}

