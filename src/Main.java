public class Main {

    public static void main(String[] args) {

        int Ticket_Price = 555_32;
        // Напишите стоимость билета с точностью до копеек после знака "=" //

        int BonusMiles = Ticket_Price / 20 / 100;

        System.out.println("Ваши бонусные мили:");
        System.out.println(BonusMiles);
    }
}