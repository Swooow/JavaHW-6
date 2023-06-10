package ru.netology.javaqa.JavaHW6.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SalesServiceTest {

    @Test
    public void shouldFindTotalSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getSumSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.getAverageSales(sales);
        double expected = (double) 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthMaxSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getMonthMaxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthMinSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getMonthMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMonthsBelowAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAmountMonthsBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMonthsAboveAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAmountMonthsAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}