public class KartuKredit implements Payment, DiskonTambahan {
    @Override
    public double hitungDiskonTambahan(double total) {
        return total * -0.03; // biaya tambahan 3%
    }

    @Override
    public void bayar(double total) {
        double biayaTambahan = hitungDiskonTambahan(total);
        System.out.println("Metode Pembayaran: Kartu Kredit");
        System.out.println("Total sebelum biaya tambahan: Rp " + total);
        System.out.println("Biaya tambahan: Rp " + (-biayaTambahan));
        System.out.println("Total yang harus dibayar: Rp " + (total - biayaTambahan));
    }
}