package ru.netology;

public class StatisticService {
    public long sum(int[] items) {
        long result = 0;
        for (long item : items) {
            result += item;
        }
        return result;
    }

    public long avg(int[] items) {
        long sum = sum(items);
        return sum / items.length;
    }

    public long maxMonth(int[] items) {
        long max = getMax(items);
        int monthCount = 0;
        int MaxMonth = 0;
        for (long item : items) {
            monthCount++;
            if (item == max) {
                MaxMonth = monthCount;
            }
        }
        return MaxMonth;
    }

    private long getMax(int[] items) {
        long max = items[0];
        for (long item : items) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public long minMonth(int[] items) {
        long min = getMin(items);
        int monthCount = 0;
        int MaxMonth = 0;
        for (long item : items) {
            monthCount++;
            if (item == min) {
                MaxMonth = monthCount;
            }
        }
        return MaxMonth;
    }

    private long getMin(int[] items) {
        long min = items[0];
        for (long item : items) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    public long monthsWithMoreThanAvg(int[] items) {
        long avg = avg(items);
        int monthCount = 0;
        for (long item : items) {
            if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public long monthsWithLessThanAvg(int[] items) {
        long avg = avg(items);
        int monthCount = 0;
        for (long item : items) {
            if (item < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}