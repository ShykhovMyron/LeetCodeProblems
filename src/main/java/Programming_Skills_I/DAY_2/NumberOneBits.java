package Programming_Skills_I.DAY_2;

public class NumberOneBits {
    public int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            c += (n & 1);
            n >>>= 1;
        }
        return c;
    }
}
