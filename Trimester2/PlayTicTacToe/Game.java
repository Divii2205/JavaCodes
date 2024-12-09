package PlayTicTacToe;

public class Game {
    Board board;
    Player player1;
    Player player2;

    public Game(int size){
        this.board = new Board(size);
        player1 = new Player('X');
        player2 = new Player('Y');
    }
    public void begin(){
        int turns = this.board.size * this.board.size;

        while (turns>0){
            board.print();

            player1.makeMove(board);
            turns--;
            board.print();

            if(board.isWinner(player1.symbol)){
                System.out.println("Player" + player1.symbol + "wins the game!");
                break;
            }

            if (turns <= 0){
                System.out.println("It is a DRAW");
                break;
            }
            
            player2.makeMove(board);
            turns--;
            board.print();

            if(board.isWinner(player2.symbol)){
                System.out.println("Player" + player2.symbol + "wins the game!");
                break;
            }
        }
    }
}
