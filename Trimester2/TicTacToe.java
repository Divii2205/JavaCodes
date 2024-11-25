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
        int turn = 0;
        while(turn<9){


            b.print();
            System.out.println(p1.name + " 's move");
            p1.makeMove(b.board);
            turn++;
           
            b.print();
            System.out.println(p2.name + " 's move");
            p2.makeMove(b.board);
            turn++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1_name = sc.next();
        char p1_symbol = sc.next().charAt(0);
       
        String p2_name = sc.next();
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


        board[n][m] = symbol;
    }
}
