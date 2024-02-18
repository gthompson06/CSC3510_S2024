package GameShop;

import java.util.Random;

public class TicTacToe {
    private char[][] board;

    public TicTacToe(char[][] board) {
        this.board = board;
    }
    public int getRandomNumber( int max ){
        final int MIN = 0;
        Random rn = new Random();
        return rn.nextInt( max - MIN + 1 ) + MIN;
    }
    public double getAverage( int[] grades ){
        double aver = 0.0;
        double sum = 0;
        for( double item: grades ){
            sum += item;
        }
        if ( grades.length != 0 )
            aver = sum/grades.length;
        return aver;
    }
    public boolean validToken( char tok ){
        if ( Character.toUpperCase('X') == Character.toUpperCase(tok) ||
             Character.toUpperCase('O') == Character.toUpperCase(tok) ){
            return true;
        }
        return false;
    }
    public int getLargest( int x, int y ){
        int largest = x;
        if ( y > x ) largest = y;
        return largest;
    }
    public String getLargestString( String x, String y ){
        String largest = x;
        if ( y.length() > x.length()  ) largest = y;
        return largest;
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
