package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void amountSalesTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAmount = 180;
        int actualAmount = service.amountSales(arr);

        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void averageSaleTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAverage = 15;
        int actualAverage = service.averageSale(arr);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMonth = 9;
        int actualMonth = service.minSales(arr);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMonth = 8;
        int actualMonth = service.maxSales(arr);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesLessAverageTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedCountMonth = 5;
        int actualCountMonth = service.salesLessAverage(arr);

        Assertions.assertEquals(expectedCountMonth, actualCountMonth);
    }

    @Test
    public void salesMoreAverageTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedCountMonth = 5;
        int actualCountMonth = service.salesMoreAverage(arr);

        Assertions.assertEquals(expectedCountMonth, actualCountMonth);
    }
}
