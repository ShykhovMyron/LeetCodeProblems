package leetcode75.first;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int currS = getCurrIndex(S.length() - 1, S);
        int currT = getCurrIndex(T.length() - 1, T);
        if (currS < 0 && currT < 0) return true;
        while (currS >= 0 && currT >= 0) {
            if (S.charAt(currS) != T.charAt(currT)) return false;
            currS = getCurrIndex(currS - 1, S);
            currT = getCurrIndex(currT - 1, T);
        }
        return currS < 0 && currT < 0;
    }

    private int getCurrIndex(int curr, String str) {
        int skip = 0;
        while (curr >= 0 && (str.charAt(curr) == '#' || skip > 0)) {
            if (str.charAt(curr) == '#') skip++;
            else skip--;
            curr--;
        }
        return curr;
    }
}
