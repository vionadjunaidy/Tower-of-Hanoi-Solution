//Tower of Hanoi solved through recursion
import java.util.Scanner;
public class towerOfHanoi {
    static int move = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of disks: ");
        int numberOfDisks = scanner.nextInt();
        getTowerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }
    public static void getTowerOfHanoi(int n, char start, char auxiliary, char end) {
        if (n >= 1) {
            getTowerOfHanoi(n - 1, start, end, auxiliary);
            move(n, start, end);
            getTowerOfHanoi(n - 1, auxiliary, start, end);
        }
    }
    public static void move (int step, char start, char end){
        System.out.println("Step " + move + ": ");
        move++;
        System.out.println("Move disk " + step + " from " + start + " to " + end);
    }
}