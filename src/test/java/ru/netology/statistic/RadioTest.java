package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void radioSet() {
        Radio set = new Radio();
        set.setRadioStation(15);

        int actual = set.getRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void radioSetMin() {
        Radio set = new Radio();
        set.setRadioStation(-1);

        int actual = set.getRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void radioPrev() {
        Radio prev = new Radio();

        prev.prevRadioStation();
        prev.prevRadioStation();

        int actual = prev.getRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    void radioNext() {
        Radio next = new Radio();

        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();

        int actual = next.getRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void radioVolUp() {
        Radio Up = new Radio();

        Up.increaseVolume();

        int actual = Up.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void radioVolDown() {
        Radio down = new Radio();
        down.increaseVolume();

        down.decreaseVolume();
        down.decreaseVolume();
        int actual = down.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void radioVolUpMAx() {
        Radio Up = new Radio();

        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();
        Up.increaseVolume();


        int actual = Up.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
}
