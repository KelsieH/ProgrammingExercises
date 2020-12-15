public class Monkey {
    public static void main(String[] args) {
        String n = "";

        for (int i = 0; i <= 4; i++) {
            if (i == 0) {
                n = "Five";
            } else if (i == 1){
                n = "Four";
            } else if (i == 2) {
                n == "Three";
            } else if (i == 3) {
                n == "Two";
            } else if (i == 4) {
                n = "One";
            }
            System.out.println(n + " little monkeys swinging in a tree \nTeasing Mr Crocodile 'you can't catch me' \n Along came the crocodile as quiet as can be \nAnd SNAP!" )
        }
        System.out.println("No little monkeys swinging in a tree");
    }
}