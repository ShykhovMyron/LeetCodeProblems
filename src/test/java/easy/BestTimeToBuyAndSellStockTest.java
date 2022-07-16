package easy;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock buyAndSellStock = new BestTimeToBuyAndSellStock();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void maxProfitTest(int[] prices, int expected) {
        int actual = buyAndSellStock.maxProfit(prices);
        assertEquals(expected, actual);
    }
}