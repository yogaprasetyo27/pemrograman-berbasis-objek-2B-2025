public class Sepeda implements Booking, Asuransi {
    @Override
    public double calculateTotal(int durasi) {
        return durasi * 10000;
    }

    @Override
    public void book(String nama, int usia, int durasi) {
        if (usia < 12) {
            System.out.println("Usia minimal untuk booking sepeda adalah 12 tahun.");
            return;
        }
        System.out.println(nama + " berhasil booking sepeda selama " + durasi + " hari dengan biaya Rp " + calculateTotal(durasi));
        tambahAsuransi();
    }
    
    @Override
    public void tambahAsuransi() {
        System.out.println("Asuransi sepeda ditambahkan.");
    }
}