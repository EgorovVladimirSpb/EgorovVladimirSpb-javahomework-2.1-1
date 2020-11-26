public class Main {

    public static void main(String[] args) {

        int ticketPrice = 555_32;
        // Напишите стоимость билета с точностью до копеек после знака "=" //

        int BonusMiles = ticketPrice / 20 / 100;

        System.out.println("Ваши бонусные мили:");
        System.out.println(BonusMiles);
    }
}