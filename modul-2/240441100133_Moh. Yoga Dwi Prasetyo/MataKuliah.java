package modul2;

public class MataKuliah {
    String kode;
    String nama;
    int sks;
    boolean dataValid = true;

    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            System.out.println("SKS tidak valid untuk matkul: "+ nama + ". Hanya boleh 2 atau 3 SKS saja yaaa...");
            dataValid = false;
            return;
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    public String toString() {
        return kode + nama + " (" + sks + " SKS)";
    }
}

