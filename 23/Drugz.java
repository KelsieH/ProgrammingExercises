public class Drugz {
    public static void main(String[] args) {
        double percent = 100.0;
        int months = 0;
        System.out.println("month: " + months + "\teffectiveness: " + percent);

        while (percent >= 50.0) {
            percent = percent * 0.96;
            months ++;
            System.out.println("month: " + months + "\teffectiveness: " + percent);
        }
        System.out.println("Discarded");
    }
}