import java.util.Scanner;


public class TicTacToe {
    static Board b;
    static Player p1;
    static Player p2;


    public static void Game(String p1n, char p1s, String p2n, char p2s){
        b = new Board();
        p1 = new Player(p1n, p1s);
        p2 = new Player(p2n, p2s);


        b.initialiseBoard();
        run();
    }


    static void run(){
        boolean draw = true;
        int turn = 0;
        while(turn<9){

            b.print();
            System.out.println(p1.name + " 's move");
            p1.makeMove(b.board);
            if (b.winStat(p1.symbol)) {
                System.out.println(p1.name + " won the game!");
                draw = false;
                break;
            }
            turn++;

            if (turn == 9) break;

            b.print();
            System.out.println(p2.name + " 's move");
            p2.makeMove(b.board);
            if (b.winStat(p2.symbol)) {
                System.out.println(p2.name + " won the game!");
                draw = false;
                break;
            }
            turn++;
        }
        if (draw) System.out.println("DRAW!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player1 name: ");
        String p1_name = sc.next();
        System.out.print("Choose your symbol: ");
        char p1_symbol = sc.next().charAt(0);
        
        System.out.print("Enter player2 name: ");
        String p2_name = sc.next();
        System.out.print("Choose your symbol: ");
        char p2_symbol = sc.next().charAt(0);
       
        Game(p1_name, p1_symbol, p2_name, p2_symbol);
        sc.close();
    }
}


class  Board {
    char[][] board = new char[3][3];


    void initialiseBoard(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
    }


    void print(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean winStat(char symbol){
        for (int i = 0; i<3; i++){
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol){
                return true;
            }
        }
        for (int i = 0; i<3; i++){
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol){
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
            return true;
        }
        if (board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol){
            return true;
        }
        return false;
    }
}


class Player{
    String name;
    char symbol;


    Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }


    void makeMove(char[][] board){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println();

        board[n][m] = symbol;
    }
}
