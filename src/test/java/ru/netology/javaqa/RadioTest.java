package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 7;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotIncreaseAboveMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPutPreviousStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 8;
        int actual = radio.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReductionBelowMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();

        radio.setVolume(100);

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        int expected = 51;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        Radio radio = new Radio();

        radio.setVolume(43);

        int expected = 42;
        int actual = radio.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeMax() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.reductionVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMinimum() {
        Radio radio = new Radio();

        radio.setVolume(-11);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMaximum() {
        Radio radio = new Radio();

        radio.setVolume(112);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stationQuantityTest() {
        Radio radio = new Radio(5);

        Assertions.assertEquals(5, radio.getStationQuantity());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(4, radio.getMaxStation());


    }
}

