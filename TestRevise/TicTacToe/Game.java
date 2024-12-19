package TestRevise.TicTacToe;

public class Game {

    Board board;
    Player player1;
    Player player2;

    public Game(int size){
        board = new Board(size);
        player1 = new Player('X');
        player2 = new Player('O');
    }

    public void start(){
        int turns = this.board.size * this.board.size;
        board.print();

        while(turns>0){
            player1.move(board);
            turns--;
            board.print();

            if(board.win(player1.symbol)){
                System.out.println("Player " + player1.symbol + "won the game");
                break;
            }

            if(turns<=0){
                System.out.println("It is a draw!");
                break;
            }

            player2.move(board);
            turns--;
            board.print();

            if(board.win(player2.symbol)){
                System.out.println("Player " + player2.symbol + " won the game");
                break;
            }
        }
    }
}