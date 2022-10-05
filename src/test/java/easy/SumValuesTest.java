package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

class SumValuesTest {

    @Test
    void testGetCountOfSums() {
        // Arrange
        SumValues sumValues = new SumValues();
        List<Integer> nums = List.of(-1, -6, 0, 3, 2, 4, 0, 1, 3, 2, 4, 4, 5);
        int target = 6;

        // Act
        int actualCountOfSums = sumValues.getCountOfSums(nums, 4, target);

        // Assert
//        assertEquals(1, actualCountOfSums);
    }
}

