package Recursion;

public class TowerOfHanoi {

    static void toh(int n, char start, char end, char mid) {
        if(n == 0){
            return;
        }
        toh(n - 1, start, mid, end);
        System.out.println("Move Disk " + n + " from rod " + start + " to rod " + end);
        toh(n - 1, mid, end, start);
    }

    public static void main(String[] args) {
        toh(3, 'A', 'C', 'B');
    }
}
