ppackage tictactoe;
import java.util.Scanner;

//This code allow user enter final game field Tic Tac Toe
public class Main {{

    final static Scanner scan = new Scanner(System.in);

    private static void fields(char[][] field){
        System.out.println("---------");
        for(int i = 0; i < field.length; i++){
            System.out.println("| " + field[i][0] + " " + field[i][1] + " " + field[i][2] + " |");
        }System.out.println("---------");
    }

    private static char[][] move(char[][] field, char character){
        int[] coordinate = new int[2];
        try{
            coordinate[0] = Integer.parseInt(scan.next());
            coordinate[1] = Integer.parseInt(scan.next());
        }catch(Exception e){
            System.out.println("You should enter numbers!");
            move(field, character);
        }if(coordinate[0] > 3 || coordinate[0] < 1 || coordinate[1] > 3 || coordinate[1] < 1){
            System.out.println("Coordination should be from 1 to 3!");
            move(field, character);
        }else if(field[3-coordinate[0]][coordinate[1]-1] == ' '){
            field[3-coordinate[0]][coordinate[1]-1] = character;
        }else{
            System.out.println("This cell is occupied! Choose another one!");
            move(field, character);
        }return field;
    }

    private static char test(char[][] field){
        if((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X') || (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') || (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') || (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') || (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X') || (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X') || (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') || (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X')){
            return 'X';
        }else  if((field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O') || (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O') || (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O') || (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O') || (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O') || (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O') || (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O') || (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O')){
          return 'O';
        }else if(field[0][0] != ' ' && field[0][1] != ' ' && field[0][2] != ' ' && field[1][0] != ' ' && field[1][1] != ' ' && field[1][2] != ' ' && field[2][0] != ' ' && field[2][1] != ' ' && field[2][2] != ' '){
            return 'F';
        }else{
            return ' ';
        }
    }

    public static void main(String[] args) {
        char[][] field = new char[3][3];
        for(int i = 0; i < field.length; i++) {
            field[i] = "   ".toCharArray();
        }
        fields(field);
        boolean gameEnd = false;
        char character = 'X';
        while(!gameEnd){
            switch(character){
                case 'X':
                    move(field, character);
                    character = 'O';
                    break;
                case 'O':
                    move(field, character);
                    character = 'X';;
                    break;
            }fields(field);
            switch(test(field)){
                case 'X':
                    System.out.println("X wins");
                    gameEnd = true;
                    break;
                case 'O':
                    System.out.println("O wins");
                    gameEnd = true;
                    break;
                case 'F':
                    System.out.println("Draw");
                    gameEnd = true;
                    break;
            }
        }
    }
}
