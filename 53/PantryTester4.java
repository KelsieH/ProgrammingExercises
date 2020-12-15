public class PantryTester4 {
    public static void main(String[] args) {
        Jam goose = new Jam("Gooseberry", "7/4/86", 4);
        Jam apple = new Jam("Crab Apple", "9/30/99", 1);
        Jam rhub = new Jam("Rhubarb", "10/31/99", 2);

        Pantry hubbarb = new Pantry(goose, apple, rhub);
        System.out.println(hubbarb);

        if (hubbarb.select(3)) {
            hubbarb.spread(2);
        }
        
        hubbarb.mixedFruit();
        System.out.println(hubbarb);
    }
}