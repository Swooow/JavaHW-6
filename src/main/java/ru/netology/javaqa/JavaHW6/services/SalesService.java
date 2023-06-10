package ru.netology.javaqa.JavaHW6.services;

public class SalesService {
    public int getSumSales(int[] sales) {             // метод с нахождением суммы всех продаж
        int sumSales = 0;                             // сумма всех продаж
        for (int i = 0; i < 12; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public double getAverageSales(int[] sales) {        // метод нахождения средних продаж в месяц
        int sumSales = getSumSales(sales);              // сумма всех продаж
        return (double) sumSales / 12;                  // возвращаем значение средних продаж за 12 месяцев
    }

    public int getMonthMaxSales(int[] sales) {          // метод нахождения месяца, в котором был пик продаж (последний)
        int peakMonth = 0;                              // месяц, в котором был пик продаж (последний)
        int maxSales = 0;                               // максимальные продажи в пиковый месяц (последний)
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                peakMonth = i + 1;
            }
        }
        return peakMonth;
    }

    public int getMonthMinSales(int[] sales) {          // метод нахождения месяца, в котором был минимум продаж (последний)
        int minMonth = 0;                               // месяц, в котором был минимум продаж (последний)
        int minSale = sales[0];                         // минимальные продажи в минимальный месяц (последний)
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int getAmountMonthsBelowAverage(int[] sales) {   // метод нахождения кол-ва месяцев, в которых продажи были ниже среднего
        double average = getAverageSales(sales);            // средние продажи в месяц
        int amountMonthBelow = 0;                           // кол-во месяцев с продажами ниже среднего
        for (int sale : sales) {
            if (sale < average) {
                amountMonthBelow++;
            }
        }
        return amountMonthBelow;
    }

    public int getAmountMonthsAboveAverage(int[] sales) {   // метод нахождения кол-ва месяцев, в которых продажи были выше среднего
        double average = getAverageSales(sales);            // средние продажи в месяц
        int amountMonthAbove = 0;                           // кол-во месяцев с продажами выше среднего
        for (int sale : sales) {
            if (sale > average) {
                amountMonthAbove++;
            }
        }
        return amountMonthAbove;
    }
}
