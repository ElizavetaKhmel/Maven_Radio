package ru.netology.radio;

public class Radio {
    private int stationNumber;
    private int maxStationNumber;
    private int minStationNumber;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio (int radiostation){
        this.maxStationNumber = radiostation - 1;

    }

    public Radio (){
        this.maxStationNumber = 9;
    }

    public int getCurrentStationNumber() { // актуальный номер станции

        return stationNumber;
    }

    public int getCurrentVolume() {  // текущий уровень громкости

        return volume;
    }

    public void setCurrentVolume(int currentVolume) {// Установить уровень звука

        this.volume = currentVolume;
    }

    public int setToLastStation() { // переключиться на последнюю станцию
        this.maxStationNumber = maxStationNumber--;
        return maxStationNumber;
    }

    public int setToFirstStation() { // переключиться на первую станцию
        this.minStationNumber = minStationNumber;
        return minStationNumber;
    }
    public void setRadioStation(int selectStationNumber) { // подходит ли выбранный номер станции,если задали количество сами

        if (selectStationNumber < minStationNumber) {
            return;
        }
        if (selectStationNumber > maxStationNumber) {
            return;
        }
        this.stationNumber = selectStationNumber;
    }
    public int prevStationNumber() {  // предыдущая радиостанция
        this.stationNumber--;
        if (stationNumber < 0) {
            stationNumber = 9;
        }
        return stationNumber;
    }

    public int nextStationNumber() { // следующая радиостанция
        this.stationNumber++;
        if (stationNumber > 9) {
            stationNumber = 0;
        }
        return stationNumber;
    }

    public void setStationNumber(int selectStationNumber) { // подходит ли выбранный номер станции
        if (selectStationNumber < 0) {
            return;
        }
        if (selectStationNumber > 9) {
            return;
        }
        this.stationNumber = selectStationNumber;
    }


    public int setToMaxVolume() { // установить максимальную громкость
        this.maxVolume = maxVolume;
        return maxVolume;
    }

    public int setToMinVolume() { // установить минимальную громкость
        this.minVolume = minVolume;
        return minVolume;
    }

    public int decreaseVolume() { // уменьшить громкость на 1
        if (volume > 0) {
            volume--;
        } else {
            return 0;
        }
        return volume;
    }

    public int increaseVolume() { // увеличить громкость на 1
        if (volume < 100) {
            volume++;
        } else {
            return 100;
        }
        return volume;
    }
}




