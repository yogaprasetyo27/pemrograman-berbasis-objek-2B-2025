public class MainMobil {
    public static void main(String[] args) {
        System.out.println("=== Program Manajemen Mobil ===\n");
        
        ManajemenMobil manajemen = new ManajemenMobil();
        
        MobilSport mobilSport = new MobilSport();
        MobilSedan mobilSedan = new MobilSedan();
        
        // nambahkan ke manajemen
        System.out.println("--- Menambah Mobil ---");
        manajemen.tambah_mobil(mobilSport);
        manajemen.tambah_mobil(mobilSedan);
        
        // operasikan semua mobil
        manajemen.operasikan_semua_mobil();
    }
}