package leetcode75.second;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int l1 = num1.length(), l2 = num2.length();
        int[] ints = new int[l1 + l2];
        for (int i = l1 - 1; i >= 0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                int sum = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                sum += ints[j + i + 1];
                ints[j + i + 1] = sum % 10;
                ints[j + i] += sum / 10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int anInt : ints) {
            if (builder.isEmpty() && anInt == 0) continue;
            builder.append(anInt);
        }
        return builder.toString();
    }
}
