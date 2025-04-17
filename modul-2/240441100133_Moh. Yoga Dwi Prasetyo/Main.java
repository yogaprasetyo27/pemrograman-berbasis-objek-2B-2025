package modul2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Agus", "2304411003", "Sistem Informasi");
        Mahasiswa m2 = new Mahasiswa("Pak Vinsen", "2304411008", "Teknik Informatika");
        Mahasiswa m3 = new Mahasiswa("Budiono Siregar", "2304411002", "Teknik Mesin");
        Mahasiswa m4 = new Mahasiswa("Slamet", "2304411009", "Teknik Elektro");
        Mahasiswa m5 = new Mahasiswa("Robi", "2304411007", "Mekatronika");
        Mahasiswa m6 = new Mahasiswa("Petrik Kluivert", "2304411027", "Teknik Industri");
        
        MataKuliah mk1 = new MataKuliah("Matkul1", "Alpro", 3);
        MataKuliah mk2 = new MataKuliah("Matkul2", "PBW", 2);
        MataKuliah mk3 = new MataKuliah("Matkul3", "PBD", 2);
        MataKuliah mk4 = new MataKuliah("Matkul4", "PBO", 3);
        MataKuliah mk5 = new MataKuliah("Matkul5", "Statistika", 2);
        MataKuliah mk6 = new MataKuliah("Matkul6", "PTIK", 2);
        MataKuliah mk7 = new MataKuliah("Matkul7", "DMJ", 3);
        MataKuliah mk8 = new MataKuliah("Matkul8", "PAI", 3);

        Mahasiswa[] mahasiswaList = {m1, m2, m3, m4, m5, m6};
        MataKuliah[] semuaMK = {mk1, mk2, mk3, mk4, mk5, mk6, mk7, mk8};

        for (Mahasiswa m : mahasiswaList) {
            if (m != null && m.dataValid) {
                m.tambahMataKuliah(mk1);
                m.tambahMataKuliah(mk2);
                m.tambahMataKuliah(mk4);
                m.tambahMataKuliah(mk6);
                m.tambahMataKuliah(mk7);
                m.tambahMataKuliah(mk8);
            }
        }

        // buat kampus
        Kampus kampus = new Kampus("Universitas Trunojoyo Madura", "Jl. Telang");

        // tampil data
        for (Mahasiswa m : mahasiswaList) {
            m.tampilkanBiodata();
        }

        // info kampus
        Kampus.tampilkanInfoKampus("Universitas Trunojoyo Madura, Jl. Telang", Mahasiswa.getJumlahMahasiswa());
    }
}
