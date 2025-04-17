package modul2;
import java.util.ArrayList;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    ArrayList<MataKuliah> mataKuliah = new ArrayList<>();
    static int jumlahMahasiswa = 0;
    boolean dataValid = true;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (!isValidNIM(nim)) {
            System.out.println("NIM tidak valid untuk mahasiswa bernama: "+ nama +". Harus diawali dengan '23' dan berjumlah 10 digit angka yaa...");
            dataValid = false;
            return;
        }
        this.nama = nama;  
        this.nim = nim;
        this.prodi = prodi;
        jumlahMahasiswa++;
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (mk != null && mk.dataValid) {
            mataKuliah.add(mk);
        }
    }

    public void tampilkanBiodata() {
        if(!dataValid) return;
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah:");
        
        int nomor = 1;
        for (MataKuliah mk : mataKuliah) {
            System.out.println(nomor + ". " + mk.toString());
            nomor++;
        }
        System.out.println();
    }

    public static boolean isValidNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }
}