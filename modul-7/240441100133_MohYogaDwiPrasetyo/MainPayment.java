public class MainPayment {
    public static void main(String[] args) {
        double totalBelanja = 200000;

        Payment pembayaranTunai = new Tunai();
        Payment pembayaranKartu = new KartuKredit();
        Payment pembayaranEWallet = new EWallet();

        pembayaranTunai.bayar(totalBelanja);
        System.out.println();

        pembayaranKartu.bayar(totalBelanja);
        System.out.println();

        pembayaranEWallet.bayar(totalBelanja);
    }
}