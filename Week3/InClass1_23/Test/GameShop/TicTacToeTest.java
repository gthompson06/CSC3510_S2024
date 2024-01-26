package GameShop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    // New method ... validToken
    @DisplayName("Valid Token Should be True")
    @ParameterizedTest
    @CsvSource( {
            "O",
            "o",
            "X",
            "x"
    })
    void testValidToken_GoodToken_WillBeOK( char tok ){
        //Arrange
        char[][] board = new char[3][3];
        TicTacToe ttt = new TicTacToe(board);
//        char tok = 'X';
        // Act
        boolean actual = ttt.validToken( tok );
        // Assert
        assertTrue( actual );
    }
   //
   @DisplayName("Valid Token Should be True")

   @ParameterizedTest
   @CsvSource( {
            "10, 10, 10",
            "5, 10, 10",
            "10, 5, 10",
           "-1, -5, -1"
   })
   void testGetLargest_ValidInput_ShouldWork( int x, int y, int expected ){
       //Arrange
       char[][] board = new char[3][3];
       TicTacToe ttt = new TicTacToe(board);
      int actual = ttt.getLargest(x, y );
       assertEquals( expected, actual  );
   }

   @DisplayName("Valid Token Should be True")

   @ParameterizedTest
   @MethodSource( "getLargestIntParms")
   void testGetLargest_ValidInputWithStreams_ShouldWork( int x, int y, int expected ){
       //Arrange
       char[][] board = new char[3][3];
       TicTacToe ttt = new TicTacToe(board);
       int actual = ttt.getLargest(x, y );
       assertEquals( expected, actual  );
   }
   private static Stream<Arguments> getLargestIntParms(){
//        TicTacToe ttt = new TicTacToe();
        return Stream.of(
                Arguments.of( 4, 3, 4),
                Arguments.of( 2, -3, 2),
                Arguments.of( 0, -1, 0)
        );
   }

    @ParameterizedTest
    @CsvSource( {
            "Apple, Baker, Apple",
            "Jack, Sparrow, Sparrow",
            "Jack, '', Jack",
            "'', '', ''"
    })

    void testGetLargestString_ValidInput_ShouldWork( String x, String y, String expected ){
        //Arrange
        char[][] board = new char[3][3];
        TicTacToe ttt = new TicTacToe(board);

        String actual = ttt.getLargestString(x, y );
        // Assert
        assertEquals( expected, actual  );
//         assertTrue( expected == actual  );
    }
   //
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
    @DisplayName("Second Col Winner")
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
    @DisplayName("Third Col Winner")
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