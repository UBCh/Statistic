package ru.netotlogy.stats;

public class StatsService {
    public int CalculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
        sum += sale;
        }
        return sum;
    }
    public int findAverage(int[] sales) {
                return CalculateSum(sales)/ sales.length;
    }

    public int findMax(int[] sales) {
        int max = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[max]) {
                max = month;
            }
            month = month + 1;
        }
        return max + 1;
    }
    public int findMin(int[] sales) {
        int min = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[min]) {
                min = month;
            }
            month = month + 1;
        }
        return min + 1;
    }
    public int numberBelowAverage(int[] sales) {
        int average =  CalculateSum(sales)/ sales.length;
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month = month + 1;
            }
        }
        return month;
    }

    public int numbersAboveAverage(int[] sales) {
        int average =  CalculateSum(sales)/ sales.length;
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
        }
        return month;
    }
}
