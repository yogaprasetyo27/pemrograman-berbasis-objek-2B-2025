public class MainBank {
    public static void main(String[] args) {
        Bank bankJava = new Bank(); //buat objek bank
        
        bankJava.tambahRekening("001", "Rivan Nurmulki", 200000000);
        bankJava.tambahRekening("002", "Farhan Halim", 478000000);
        bankJava.tambahRekening("003", "Nizar Zulfikar", 50000000);
        
        bankJava.tampilkanSemuaRekening(); //tampil smua rek
        
        // melakukan transaksi
        System.out.println("Melakukan setoran pada rekening 001");
        bankJava.setorDana("001", 500000);
        
        System.out.println("Melakukan penarikan pada rekening 002");
        bankJava.tarikDana("002", 750000);
        
        System.out.println("Melakukan percobaan penarikan melebihi saldo pada rekening 003");
        bankJava.tarikDana("003", 70000000);
        
        // tampil rek setelah transaksi
        System.out.println("\nDaftar rekening setelah transaksi:");
        bankJava.tampilkanSemuaRekening();
    }
}
