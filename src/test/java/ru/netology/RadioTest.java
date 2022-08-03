package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.switchNext();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.switchPrev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerThenZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.switchPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThenNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.switchNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTurnUpVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.turnUpVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTurnDownVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.turnDownVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTurnVolumeLowerZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTurnVolumeHigherTen() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.turnUpVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
