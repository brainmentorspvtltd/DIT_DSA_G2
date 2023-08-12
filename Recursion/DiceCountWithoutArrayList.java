package Recursion;

public class DiceCountWithoutArrayList {

    static void diceGame(int current, int end, String output) {
        if(current == end) {
            System.out.println(output);
            return;
        }
        if(current > end) {
            return;
        }
        for(int dice = 1; dice <= 6; dice++) {
            diceGame(current + dice, end, output + dice);
        }
    }

    public static void main(String[] args) {
        diceGame(0, 10, "");
    }
}
