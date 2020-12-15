public class Sheep {
    public static void main(String [] args) {
        double n = 0;
        double t = 1;
        for (int i = 0; i < 25; i++) {
            n = (1 + (10*t));
            n = 220/n;
            System.out.println("There are " + n + " sheep at " + i + "years.");
            t = t * 0.85;

            if (n > 80) {
                System.out.println("No supervision needed");
            } else {
                System.out.println("Supervision is needed");
            }
        }
    }
}