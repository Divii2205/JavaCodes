package PlayTicTacToe;

public class Board {
    char[][] board;
    int size;

    public Board(int size){
        this.size = size;
        board = new char[size][size];

        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                board[i][j] = '_';
            }
        }
    }

    public char get(int i, int j){
        return this.board[i][j];
    }

    public void set(int i, int j, char symbol){
        this.board[i][j] = symbol;
    }

    public boolean isWinner(char sym){
        return checkRows(sym) || checkCols(sym) || checkDia(sym);
    }

    boolean checkRows(char sym){
        for (int i = 0; i<this.size; i++){
            if (checkRow(i, sym)) return true;
        }
        return false;
    }

    boolean checkRow(int row, char sym){
        for (int i = 0; i<size; i++){
            if (this.board[row][i] != sym) return false;
        }
        return true;
    }

    boolean checkCols(char sym){
        for (int i = 0; i<this.size; i++){
            if (checkCol(i, sym)) return true;
        }
        return false;
    }

    boolean checkCol(int col, char sym){
        for (int i = 0; i<size; i++){
            if (this.board[i][col] != sym) return false;
        }
        return true;
    }

    boolean checkDia(char sym){
        return checkDia1(sym) || checkDia2(sym);
    }

    boolean checkDia1(char sym){
        int n = this.size;
        int i = 0, j = 0;

        while (i<n && j<n){
            if (this.board[i][j] != sym) return false;
            i++;
            j++;
        }
        return true;
    }

    boolean checkDia2(char sym){
        int n = this.size;
        int i = 0, j = n-1;

        while (i<n && j>0){
            if (this.board[i][j] != sym) return false;
            i++;
            j--;
        }
        return true;
    }

    void print(){
        int n = size;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
