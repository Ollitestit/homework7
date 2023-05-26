package ru.netology.stats;

public class StatsService {
    public int amountSales(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }

        return amount;
    }

    public int averageSale(int[] sales) {
        int amount = amountSales(sales);
        int averageSale = amount / 12;

        return averageSale;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int salesLessAverage(int[] sales) {
        int countMonths = 0;
        int average = averageSale(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonths = countMonths + 1;
            }
        }

        return countMonths;
    }

    public int salesMoreAverage(int[] sales) {
        int countMonths = 0;
        int average = averageSale(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonths = countMonths + 1;
            }
        }

        return countMonths;
    }

}