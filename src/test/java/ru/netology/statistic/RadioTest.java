package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();
    Radio radio1 = new Radio(-1);

    @Test
    void radioSet() {
        radio1.setRadioStation(15);
        assertEquals(0, radio1.getRadioStation());
        assertEquals(0, radio1.getLastRadioStation());

    }

    @Test
    void radioSetMin() {
        radio.setRadioStation(-1);
        assertEquals(9, radio.getRadioStation());
        assertEquals(9, radio.getLastRadioStation());

    }

    @Test
    void radioPrev() {
        radio.prevRadioStation();

        assertEquals(9, radio.getRadioStation());

    }

    @Test
    void radioNext() {

        radio1.setRadioStation(13);
        radio1.nextRadioStation();

        assertEquals(0, radio1.getRadioStation());
    }

    @Test
    void radioVolUp() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        radio.increaseVolume();


        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void radioVolDown() {
        radio1.setCurrentVolume(1);

        radio1.decreaseVolume();
        radio1.decreaseVolume();


        assertEquals(0, radio1.getCurrentVolume());
    }
}
