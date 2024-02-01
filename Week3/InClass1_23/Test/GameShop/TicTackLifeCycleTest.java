package GameShop;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder( MethodOrderer.OrderAnnotation.class)
public class TicTackLifeCycleTest {
   TicTacToe ttt;
   @BeforeAll
   static void setUp(){
       System.out.printf("\n Starting setup");
//       char[][] board = new char[3][3];
//       ttt = new TicTacToe(board);
   }
    @AfterAll
    static void tearDown(){
        System.out.printf("\n It is done");
    }
    @BeforeEach
    void beforeEach(){
        System.out.printf("\n --- before each");
        char[][] board = new char[3][3];
        ttt = new TicTacToe(board);
    }
    @AfterEach
    void afterEach() {
        System.out.printf("\n After each has run");
    }
    @Order(1)
    @DisplayName("Valid Token Should be True")
    @Test

    void testValidToken_GoodToken_WillBeOK( ){
        //Arrange
        char tok = 'X';
        System.out.printf("\n ------- T1");

        // Act
        boolean actual = ttt.validToken( tok );
        // Assert
        assertTrue( actual );
    }
    @Order(2)
    @Test
    void testNotValidToken_BadToken_WillBeFalse(  ){
        //Arrange
        System.out.printf("\n ------- T2");
        char tok = 'W';
        // Act
        boolean actual = ttt.validToken( tok );
        // Assert
        assertFalse( actual );
    }
    @Order(3)
    @Test
    void testNotValidTokenV2_BadToken_WillBeFalse(  ){
        //Arrange
        System.out.printf("\n ------- T3");
        char tok = 'W';
        // Act
        boolean actual = ttt.validToken( tok );
        // Assert
        assertFalse( actual );
    }

}
