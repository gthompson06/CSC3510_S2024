package GameShop;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    // New method ... validToken
    @DisplayName( "Test Randmon NUmber")
    @RepeatedTest( 10 )
    void testGetRandom_ShouldwWork(RepetitionInfo rino, TestInfo tinfo ){
        int max = 10;
        char[][] board = new char[3][3];
        TicTacToe ttt = new TicTacToe(board);
        int actual = ttt.getRandomNumber( max );
        System.out.printf("\n actual=%s", actual );
        boolean result = ( actual >= 0 && actual <= max );
        assertTrue( result );
    }
    @ParameterizedTest
    @CsvSource( {
            "'1,2,3' , 2.0",
            "'5,6,7' , 6.0",
            "'99,99,100', 99.333"
    })
    void testGetAver_WithVaidInput_ShouldWork( String inListStr, double expected){
        System.out.printf("\nInStr:%s expected:%s", inListStr, expected);
        int[] inList = convertStringToArray( inListStr);
        char[][] board = new char[3][3];
        TicTacToe ttt = new TicTacToe(board);
        double actual = ttt.getAverage( inList );
        assertEquals( expected, actual,.01 );
    }

    private int[] convertStringToArray(String inListStr) {
        String[] values = inListStr.split(";");
        String[] strVals = values[0].split(",");
        int[] intList = new int[strVals.length];
        for( int i=0; i<strVals.length; i++ ){
            intList[i] = Integer.parseInt( strVals[i].trim());
        }
        return intList;
    }

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
    @DisplayName("Valid Token Should be TrueV using file")

    @ParameterizedTest
    @CsvFileSource( resources = "/input.csv")
    @Disabled(" This test is under construction")
    void testGetLargest_ValidInputFromFile_ShouldWork( int x, int y, int expected ){
        //Arrange
        char[][] board = new char[3][3];
        TicTacToe ttt = new TicTacToe(board);
        int actual = ttt.getLargest(x, y );
        assertEquals( expected, actual  );
    }
   @DisplayName("Valid Token Should be True!")
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