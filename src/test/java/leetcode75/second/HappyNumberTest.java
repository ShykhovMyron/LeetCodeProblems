package leetcode75.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

    HappyNumber happyNumber = new HappyNumber();

    @Test
    void testIsHappy() {
        boolean result = happyNumber.isHappy(10);
        Assertions.assertEquals(true, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme