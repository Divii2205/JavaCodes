package TestRevise.TicTacToe;

public class Board {
    char[][] board;
    int size;

    public Board(int size){
        this.size = size;
        board = new char[size][size];

        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                board[i][j] = '_';
            }
        }
    }

    public void print(){
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char get(int i , int j){
        return board[i][j];
    }

    public void set(int i, int j, char symbol){
        board[i][j] = symbol;
    }

    public boolean win(char sym){
        if(checkRows(sym) || checkColumns(sym) || checkDiagonals(sym)) return true;
        return false;
    }

    private boolean checkRows(char sym){
        for(int i = 0; i<this.size; i++){
            if(checkRow(i, sym)) return true;
        }
        return false;
    }

    private boolean checkRow(int index, char sym){
        for(int i = 0; i<this.size; i++){
            if(board[index][i] != sym) return false;
        }
        return true;
    }

    private boolean checkColumns(char sym){
        for(int i = 0; i<this.size; i++){
            if(checkCol(i, sym)) return true;
        }
        return false;
    }

    private boolean checkCol(int index, char sym){
        for(int i = 0; i<this.size; i++){
            if(board[i][index] != sym) return false;
        }
        return true;
    }

    private boolean checkDiagonals(char sym){
        if (diag1(sym) || diag2(sym)) return true;
        return false;
    }

    private boolean diag1(char sym){
        int n = this.size;
        int i = 0, j = 0;

        while(i<n && j<n){
            if(board[i][j] != sym) return false;
            i++;
            j++;
        }
        return true;
    }

    private boolean diag2(char sym){
        int n = this.size;
        int i = 0, j = n-1;

        while(i<n && j>=0){
            if(board[i][j] != sym) return false;
            i++;
            j--;
        }
        return true;
    }
}