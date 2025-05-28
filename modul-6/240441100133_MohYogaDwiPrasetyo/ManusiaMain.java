public class ManusiaMain {
    public static void main(String[] args) {
        
        Joko joko = new Joko();
        Beni beni = new Beni();
        Feni feni = new Feni();
        Jani jani = new Jani();
        
        System.out.println("--- JOKO ---");
        joko.berbicara();
        joko.bekerja();
        joko.makan();
        
        System.out.println("\n--- BENI ---");
        beni.berbicara();
        beni.bekerja();
        beni.makan();
        
        System.out.println("\n--- FENI ---");
        feni.berbicara();
        feni.bekerja();
        feni.makan();
        
        System.out.println("\n--- JANI ---");
        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}