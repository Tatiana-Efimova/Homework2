public class Main {

    public static void main(String[] args) {

        int purchaseAmount = 10550; // рублей
        int amount = 20; // рублей для одной бонусной мили

        int bonusMiles = purchaseAmount / amount; // бонусных миль

        System.out.println(bonusMiles);
    }
}
