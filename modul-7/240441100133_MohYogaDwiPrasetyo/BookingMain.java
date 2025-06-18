public class BookingMain {
    public static void main(String[] args) {
        Booking mobil = new Mobil();
        Booking motor = new Motor();
        Booking sepeda = new Sepeda();

        mobil.book("Doni", 10, 2);
        motor.book("Ani", 20, 3);
        sepeda.book("Budi", 12, 1);
    }
}