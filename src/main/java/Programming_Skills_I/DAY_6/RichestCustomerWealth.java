package Programming_Skills_I.DAY_6;

import java.util.Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(s -> Arrays.stream(s).sum())
                .max()
                .getAsInt();
    }
}
