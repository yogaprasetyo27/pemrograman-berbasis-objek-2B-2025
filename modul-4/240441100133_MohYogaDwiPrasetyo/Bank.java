public class Bank {
    private RekeningBank[] rekening;
    private int jumlahRekening;
    private final int KAPASITAS_MAX = 100;
    
    public Bank() {
        this.rekening = new RekeningBank[KAPASITAS_MAX];
        this.jumlahRekening = 0;
    }
    
    public boolean tambahRekening(String noRek, String namaPemilik, double saldo) {
        if (jumlahRekening < KAPASITAS_MAX) {
            // cek apakah norek sdh ada
            for (int i = 0; i < jumlahRekening; i++) {
                if (rekening[i].getNoRek().equals(noRek)) {
                    System.out.println("Gagal menambahkan rekening. No rekening " + noRek + " sudah ada");
                    return false;
                }
            }
            
            //tambah rek baru
            rekening[jumlahRekening] = new RekeningBank(noRek, namaPemilik, saldo);
            jumlahRekening++;
            System.out.println("Berhasil menambahkan rekening atas nama " + namaPemilik);
            return true;
        }else {
            System.out.println("Kpasitas bank penuh! Tidak dapat menambahkan rekening baru");
            return false;
        }
    }
    
    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) { //cari rek berdasarkan norek
            if (rekening[i].getNoRek().equals(noRek)) {
                return rekening[i];
            }
        }
        return null;
    }
    
    public boolean setorDana(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek); 
        if (rek != null) { // lakukan setoran ke rekening yg sesuai 
            rek.setor(jumlah);
            return true;
        }else {
            System.out.println("Rekening dengan no " + noRek + " tidak ditemukan");
            return false;
        }
    }
    
    public boolean tarikDana(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) { //penarikan jika rek ditemukan
            return rek.tarik(jumlah);
        }else {
            System.out.println("Rekening dengan no " + noRek + " tidak ditemukan");
            return false;
        }
    }
    
    public void tampilkanSemuaRekening() {
        if (jumlahRekening == 0) {
            System.out.println("Belum ada rekening terdaftar");
            return;
        }
        
        System.out.println("\n=== Daftar Rekening ===");
        for (int i = 0; i < jumlahRekening; i++) {
            System.out.println((i+1) + ". " + rekening[i]);
        } 
        System.out.println("=======================");
    }
}
