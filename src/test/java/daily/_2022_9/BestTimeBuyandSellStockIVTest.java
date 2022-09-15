package daily._2022_9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BestTimeBuyandSellStockIVTest {

    final BestTimeBuyandSellStockIV bestTimeBuyandSellStockIV = new BestTimeBuyandSellStockIV();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(2, new int[]{3, 2, 6, 5, 0, 3}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void maxProfitTest(int k, int[] prices, int expected) {
        int actual = bestTimeBuyandSellStockIV.maxProfit(k, prices);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}