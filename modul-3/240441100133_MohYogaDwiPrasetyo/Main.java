public class Main {
    public static void main(String[] args) {
        MahasiswaReguler m1 = new MahasiswaReguler("Rivan Nurmulki", "M439", "Sistem Informasi A");
        MahasiswaReguler m2 = new MahasiswaReguler("Budiono Siregar", "S753", "Sistem Informasi B");
        MahasiswaReguler m3 = new MahasiswaReguler("Pak Vinsen", "R2014", "Sistem Informasi C");
        
        // tampil info MahasiswaReguler
        System.out.println("INFO MAHASISWA REGULER :");
        m1.infoReguler();
        m2.infoReguler();
        m3.infoReguler();
        
        MahasiswaBeasiswa m4 = new MahasiswaBeasiswa("Alpha", "2407b21", "Beasiswa LPDP");
        MahasiswaBeasiswa m5 = new MahasiswaBeasiswa("Zilong", "24853d8", "Beasiswa non-akademik");
        MahasiswaBeasiswa m6 = new MahasiswaBeasiswa("Alucard", "2496h78", "Beasiswa prestasi akademik");
        
        // tampilkan info MahasiswaBeasiswa
        System.out.println("INFO MAHASISWA BEASISWA :");
        m4.infoBeasiswa();
        m5.infoBeasiswa();
        m6.infoBeasiswa();
    }
    
}
