public class EWallet implements Payment, DiskonTambahan {
    @Override
    public double hitungDiskonTambahan(double total) {
        return total * 0.05; // 5% diskon
    }

    @Override
    public void bayar(double total) {
        double diskon = hitungDiskonTambahan(total);
        System.out.println("Metode Pembayaran: E-Wallet");
        System.out.println("Total sebelum diskon: Rp " + total);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + (total - diskon));
    }
}