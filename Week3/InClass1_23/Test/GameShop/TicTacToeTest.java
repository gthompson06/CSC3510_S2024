package GameShop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @DisplayName("First Row Winner")
    @Test
    void testisWinner_FirstRowWin_WillWin(){
        //Arrange
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', ' ', 'O'},
                {'X', 'O', ' '}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'X';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertTrue( actual );
    }
    @DisplayName("Second Row Winner")
    @Test
    void testisWinner_SecondRowWin_WillWin(){
        //Arrange
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'O', 'O'},
                {'X', 'O', ' '}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'O';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertTrue( actual );
    }
    @DisplayName("Second Row Winner")
    @Test
    void testisWinner_ThirdRowWin_WillWin(){
        //Arrange
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'X', 'X'}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'X';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertTrue( actual );
    }
    @DisplayName("Second Row Winner")
    @Test
    void testisWinner_NoWin_WillFail(){
        //Arrange
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'X';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertFalse( actual );
    }
    @DisplayName("Firt Col Winner")
    @Test
    void testisWinner_InFistCol_WillWin(){
        //Arrange
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'X', 'O', 'X'}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'X';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertTrue( actual );
    }
    @DisplayName("Firt Col Winner")
    @Test
    void testisWinner_In2ndCol_WillWin(){
        //Arrange
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', 'X', 'O'},
                {'X', 'X', 'X'}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'X';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertTrue( actual );
    }
    @DisplayName("Firt Col Winner")
    @Test
    void testisWinner_NoWinner_WillNotWin(){
        //Arrange
        char[][] board = {
                {'X', ' ', 'X'},
                {'O', ' ', 'O'},
                {'X', ' ', 'X'}
        };
        TicTacToe ttt = new TicTacToe(board);
        char tok = 'X';
        // Act
        boolean actual = ttt.isWinner( tok );
        // Assert
        assertFalse( actual );
    }
}