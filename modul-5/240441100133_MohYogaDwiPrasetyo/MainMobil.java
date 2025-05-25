public class MainMobil {
    public static void main(String[] args) {
        MobilSport sport = new MobilSport();
        MobilSedan sedan = new MobilSedan();

        System.out.println("----- Mobil SPort -----");
        sport.nyalakanMesin();
        sport.matikanMesin();

        System.out.println("----- Mobil Sedan -----");
        sedan.nyalakanMesin();
        sedan.matikanMesin();
    }
}
