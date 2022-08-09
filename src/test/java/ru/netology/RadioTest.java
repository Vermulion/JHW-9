package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RadioTest {

    Radio radio = new Radio();
    @Test //default station params
    public void defaultStations() {

        Assertions.assertEquals(10, radio.getStationsRange());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @ParameterizedTest //Switch next station test
    @CsvFileSource(files = "src/test/resources/nextStation.csv")

    public void switchNextTest(int station, int expected) {

        radio.setCurrentStation(station);
        radio.switchNext();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest //Switch previous station test
    @CsvFileSource(files = "src/test/resources/prevStation.csv")

    public void switchPrevTest(int station, int expected) {

        radio.setCurrentStation(station);
        radio.switchPrev();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest //Set current station test
    @CsvFileSource(files = "src/test/resources/currentStation.csv")

    public void setCurrentStationTest(int station, int expected) {

        radio.setCurrentStation(1);
        radio.setCurrentStation(station);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Radio volume tests

    @ParameterizedTest //set volume params
    @CsvFileSource (files = "src/test/resources/defaultVolume.csv")
    public void setVolume(int volume, int expected) {
    radio.setCurrentVolume(1);
    radio.setCurrentVolume(volume);

    int actual = radio.getCurrentVolume();

    Assertions.assertEquals(expected, actual);

    }


    @ParameterizedTest //Min volume test
    @CsvFileSource(files = "src/test/resources/minVolume.csv")

    public void MinVolumeTest(int volume, int expected) {

        radio.setCurrentVolume(volume);
        radio.turnDownVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest //Max volume test
    @CsvFileSource(files = "src/test/resources/maxVolume.csv")

    public void MaxVolumeTest(int volume, int expected) {

        radio.setCurrentVolume(volume);
        radio.turnUpVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }



//    public void shouldSetStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(6);
//
//        int expected = 6;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchNextStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(1);
//
//        radio.switchNext();
//
//        int expected = 2;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchPrevStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(1);
//
//        radio.switchPrev();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void lowerThenZero() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(0);
//
//        radio.switchPrev();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void moreThenNine() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//
//        radio.switchNext();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(5);
//
//        int expected = 5;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldTurnUpVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(0);
//
//        radio.turnUpVolume();
//
//        int expected = 1;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldTurnDownVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(6);
//
//        radio.turnDownVolume();
//
//        int expected = 5;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldTurnVolumeLowerZero() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(0);
//
//        radio.turnDownVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldTurnVolumeHigherTen() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(10);
//
//        radio.turnUpVolume();
//
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
}
