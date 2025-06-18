public class BukuReferensi extends Buku implements Reservasi {

    public BukuReferensi(String judul, String penulis) {
        super(judul, penulis);
    }

    // tidak dapat dipinjam, hanya bisa direservasi
    @Override
    public void reservasi() {
        System.out.println(judul + " (Referensi) berhasil direservasi untuk dibaca di tempat.");
    }

    @Override
    public void batalkanReservasi() {
        System.out.println("Reservasi untuk " + judul + " (Referensi) dibatalkan.");
    }

    @Override
    public void info() {
        System.out.println("[Referensi] " + judul + " oleh " + penulis);
    }
}
