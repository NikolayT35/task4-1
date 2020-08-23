public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
public class Main {
    public static void main(String[] args) {
        int ticketcCost = 100;
        int eachSpentMoney = 20;
        int bonus = 1;
        int mile = ticketcCost / eachSpentMoney * bonus;

        System.out.println(mile);
    }
}