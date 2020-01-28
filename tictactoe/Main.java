ppackage tictactoe;
import java.util.Scanner;

//This code allow user enter final game field Tic Tac Toe
public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = scan.next().toCharArray();
        System.out.println("---------");
        System.out.println("| "+cells[0] + " " + cells[1] + " " + cells[2] + " |");
        System.out.println("| "+cells[3] + " " + cells[4] + " " + cells[5] + " |");
        System.out.println("| "+cells[6] + " " + cells[7] + " " + cells[8] + " |");
        System.out.println("---------");
    }
}
