package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetToLastStation() { //Выставилась ли последняя радиостанция
        Radio radio = new Radio();
        radio.getCurrentStationNumber();

        int expected = 9;
        int actual = radio.setToLastStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStation() { //Выставилась ли первая радиостанция
        Radio radio = new Radio();
        radio.getCurrentStationNumber();

        int expected = 0;
        int actual = radio.setToFirstStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputLast() {//Задать номер станции
        Radio radio = new Radio();
        int stationNumber = 9;

        radio.setStationNumber(stationNumber);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputOne() { //Задать номер станции
        Radio radio = new Radio();
        int stationNumber = 1;

        radio.setStationNumber(stationNumber);

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputEight() { //Задать номер станции
        Radio radio = new Radio();
        int stationNumber = 8;

        radio.setStationNumber(stationNumber);

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputZero() { //Задать номер станции
        Radio radio = new Radio();
        int stationNumber = 10;

        radio.setStationNumber(stationNumber);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void stationInputBelowZero() { //Задать номер станции
        Radio radio = new Radio();
        int stationNumber = -1;

        radio.setStationNumber(stationNumber);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputAboveNine() { //Задать номер станции
        Radio radio = new Radio();
        int stationNumber = 10;

        radio.setStationNumber(stationNumber);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationAfterLast() { // переключить станцию на +1
        Radio radio = new Radio();
        int stationNumber = 9;

        radio.setStationNumber(stationNumber);

        int expected = 0;
        int actual = radio.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStation() { // переключить станцию на +1
        Radio radio = new Radio();
        int stationNumber = 8;

        radio.setStationNumber(stationNumber);

        int expected = 9;
        int actual = radio.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationAfterFirst() { // переключить станцию на -1
        Radio radio = new Radio();
        int stationNumber = 0;

        radio.setStationNumber(stationNumber);

        int expected = 9;
        int actual = radio.prevStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStation() { // переключить станцию на -1
        Radio radio = new Radio();
        int stationNumber = 7;

        radio.setStationNumber(stationNumber);

        int expected = 6;
        int actual = radio.prevStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void radioStation() { // Заданное количество радиостанций
        Radio radio = new Radio(20);
        int stationNumber = 19;

        radio.setRadioStation(stationNumber);

        int expected = 19;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void radioStationMin() { // Заданное количество радиостанций
        Radio radio = new Radio(20);
        int stationNumber = -1;

        radio.setRadioStation(stationNumber);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void radioStationMax() { // Заданное количество радиостанций
        Radio radio = new Radio(20);
        int stationNumber = 21;

        radio.setRadioStation(stationNumber);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToMinVolume() { //Выставилась ли минимальная громкость
        Radio radio = new Radio();
        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.setToMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() { //Выставилась ли максимальная громкость
        Radio radio = new Radio();
        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.setToMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setToCurrentVolume() {// Получить уровень громкости
        Radio radio = new Radio();
        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() { // увеличить громкость на +1
        Radio radio = new Radio();
        int currentVolume = 90;

        radio.setCurrentVolume(currentVolume);

        int expected = 91;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseToMaxVolume() { // увеличить громкость на +1
        Radio radio = new Radio();
        int currentVolume = 99;

        radio.setCurrentVolume(currentVolume);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseAboveMaxVolume() { // увеличить громкость на +1
        Radio radio = new Radio();
        int currentVolume = 100;

        radio.setCurrentVolume(currentVolume);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseToMinVolume() { // уменьшить громкость на -1
        Radio radio = new Radio();
        int currentVolume = 1;

        radio.setCurrentVolume(currentVolume);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseBelowMinVolume() { // уменьшить громкость на -1
        Radio radio = new Radio();
        int currentVolume = 0;

        radio.setCurrentVolume(currentVolume);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}