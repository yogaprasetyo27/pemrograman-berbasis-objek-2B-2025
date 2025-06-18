public class Mobil implements Booking, Asuransi {
    @Override
    public double calculateTotal(int durasi) {
        return durasi * 50000;
    }

    @Override
    public void book(String nama, int usia, int durasi) {
        if (usia < 18) {
            System.out.println("Usia minimal untuk booking mobil adalah 18 tahun.");
            return;
        }
        System.out.println(nama + " berhasil memesan mobil selama " + durasi + " hari dengan biaya Rp " + calculateTotal(durasi));
        tambahAsuransi();
    }

    @Override
    public void tambahAsuransi() {
        System.out.println("Asuransi mobil ditambahkan.");
    }
}