public class MainBuku {
    public static void main(String[] args) {
        SistemPerpustakaan sistem = new SistemPerpustakaan();

        BukuFiksi novel = new BukuFiksi("Laskar Pelangi", "Andrea Hirata");
        BukuReferensi ensiklopedia = new BukuReferensi("Ensiklopedia Sains", "Tim Elex Media");

        sistem.tambahBuku(novel);
        sistem.tambahBuku(ensiklopedia);

        sistem.tampilkanBuku();

        // simulasi peminjaman
        novel.pinjam();
        novel.reservasi();
        novel.kembalikan();
        novel.pinjam();

        System.out.println();

        // simulasi reservasi buku referensi
        ensiklopedia.reservasi();
        ensiklopedia.batalkanReservasi();

        sistem.tampilkanBuku();
    }
}
