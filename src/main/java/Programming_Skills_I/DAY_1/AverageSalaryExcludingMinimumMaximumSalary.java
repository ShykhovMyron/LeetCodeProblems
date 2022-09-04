package Programming_Skills_I.DAY_1;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumMaximumSalary {
    public double average(int[] salary) {
        double avg = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) avg += salary[i];
        return avg / (salary.length - 2);
    }
}
