public class Motor implements Booking, Asuransi {
    @Override
    public double calculateTotal(int durasi) {
        return durasi * 25000;
    }

    @Override
    public void book(String nama, int usia, int durasi) {
        if (usia < 17) {
            System.out.println("Usia minimal untuk booking motor adalah 17 tahun.");
            return;
        }
        System.out.println(nama + " berhasil booking motor selama " + durasi + " hari dengan biaya Rp " + calculateTotal(durasi));
        tambahAsuransi();
    }
    
    @Override
    public void tambahAsuransi() {
        System.out.println("Asuransi motor ditambahkan.");
    }
}