package PlayTicTacToe;

import java.util.Scanner;

public class Player {
    char symbol;

    public Player(char symbol){
        this.symbol = symbol;
    }

    public void makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int n = board.size;
        if ((i >=0 && j>=0 )&& (i<n && j<n) && (board.get(i,j) == '_')){
            board.set(i, j, this.symbol);
        } else {
            System.out.println("Invalid input! Try again");
            this.makeMove(board);
        }
    }
}
