import java.util.Scanner;

public class ChessKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        boolean knight = (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2 || Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1);
        System.out.println(knight);
    }
}