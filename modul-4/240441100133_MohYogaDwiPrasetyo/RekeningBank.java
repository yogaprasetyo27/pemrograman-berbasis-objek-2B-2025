public class RekeningBank {
    private String noRek;
    private String namaPemilik;
    private double saldo;
    
    public RekeningBank(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public String getNoRek() {
        return noRek; //getter masing' atribut
    }
    
    public String getNamaPemilik() {
        return namaPemilik;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil melakukan setoran sebesar Rp." + jumlah);
        }else {
            System.out.println("Jumlah uang setoran harus lebih dari 0");
        }
    }
    
    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Berhasil melakukan penarikan sebesar Rp." + jumlah);
            return true;
        }else {
            System.out.println("Penarikan gagal. Sldo tidak cukup atau jumlah penarikan tidak valid");
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "No. Rekening: " + noRek + 
                ", Nama: " + namaPemilik +
                ", Saldo: Rp." + saldo;
    }
}
