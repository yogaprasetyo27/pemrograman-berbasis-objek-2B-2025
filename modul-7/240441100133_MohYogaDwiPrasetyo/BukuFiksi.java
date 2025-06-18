public class BukuFiksi extends Buku implements Peminjaman, Reservasi {

    public BukuFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void pinjam() {
        if (tersedia) {
            tersedia = false;
            System.out.println(judul + " berhasil dipinjam.");
        } else {
            System.out.println(judul + " tidak tersedia.");
        }
    }

    @Override
    public void kembalikan() {
        tersedia = true;
        System.out.println(judul + " telah dikembalikan.");
    }

    @Override
    public void reservasi() {
        if (tersedia) {
            System.out.println(judul + " tersedia, silakan pinjam langsung.");
        } else {
            System.out.println(judul + " telah berhasil direservasi.");
        }
    }

    @Override
    public void batalkanReservasi() {
        System.out.println("Reservasi untuk " + judul + " dibatalkan.");
    }

    @Override
    public void info() {
        System.out.println("[Fiksi] " + judul + " oleh " + penulis);
    }
}
