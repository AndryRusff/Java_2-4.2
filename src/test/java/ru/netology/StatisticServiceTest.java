package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    public void shouldSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        long actual = statisticService.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAvg() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        long actual = statisticService.avg(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        long actual = statisticService.maxMonth(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        long actual = statisticService.minMonth(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsWithMore() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        long actual = statisticService.monthsWithMoreThanAvg(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsWithLess() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService statisticService = new StatisticService();

        long actual = statisticService.monthsWithLessThanAvg(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}