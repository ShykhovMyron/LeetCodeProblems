package daily._2022_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PushDominoesTest {

    /**
     * Method under test: {@link PushDominoes#pushDominoes(String)}
     */
    @Test
    void testPushDominoes() {
        // Arrange
        PushDominoes pushDominoes = new PushDominoes();
        String dominoes = ".L.R...LR..L..";

        // Act
        String actualPushDominoesResult = pushDominoes.pushDominoes(dominoes);

        // Assert
        assertEquals("LL.RR.LLRRLL..", actualPushDominoesResult);
    }

}