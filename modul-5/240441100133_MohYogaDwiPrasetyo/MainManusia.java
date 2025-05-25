public class MainManusia {
    public static void main(String[] args) {
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();
        
        System.out.println("----- Joko   -----");
        joko.berbicara();
        joko.bekerja();
        joko.makan();

        System.out.println("----- Beni -----");
        beni.berbicara();
        beni.bekerja();
        beni.makan();

        System.out.println("----- Fani -----");
        fani.berbicara();
        fani.bekerja();
        fani.makan();

        System.out.println("----- Jani -----");
        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}
