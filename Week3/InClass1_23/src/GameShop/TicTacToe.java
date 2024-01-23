package GameShop;

public class TicTacToe {
    private char[][] board;

    public TicTacToe(char[][] board) {
        this.board = board;
    }
    public boolean validToken( char tok ){
        // Menton that I changet these lines
        if ( Character.toUpperCase('X') == tok ||
             Character.toUpperCase('O') == tok ){
            return true;
        }
        return false;

    }
    public boolean isWinner(char tok) {
        boolean hasWon = false;
        hasWon = checkRowWinner( tok );
        if ( !hasWon ){
            hasWon = checkColWinner( tok );
        }
        return hasWon;
    }

    private boolean checkColWinner(char tok) {
        int row = 0;
        for( int col=0; col<board[0].length; col++){
            boolean gotWin = checkThisColForWinner( col, tok );
            if ( gotWin ){
                return true;
            }
        }
        return false;
    }

    private boolean checkThisColForWinner(int col, char tok) {
        for ( char[] row : board ){
            if ( row[col] != tok ){
                return false;
            }
        }
        return true;
    }

    private boolean checkRowWinner(char inTok) {
        for ( char[] row : board ){
            if ( checkThisRow( row, inTok )){
                return true;
            }
        }
        return false;
    }

    private boolean checkThisRow(char[] row, char inTok) {
        for( char tok : row ){
            if ( tok  != inTok){
                return false;
            }
        }
        return true;
    }
}
