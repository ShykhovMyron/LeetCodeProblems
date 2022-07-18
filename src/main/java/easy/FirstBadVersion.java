package easy;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        int mid;

        while (last > first) {
            mid = first + (last - first) / 2;
            if (isBadVersion(mid)) {
                last = mid;
            } else {
                first = mid + 1;
            }
        }
        return first;
    }

    boolean isBadVersion(int version) {
        return false;
    }

}
