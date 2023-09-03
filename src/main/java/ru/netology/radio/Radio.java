package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStationNumber;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentStationNumber() { // актуальный номер станции

        return currentStationNumber;
    }

    public int getCurrentVolume() {  // текущий уровень громкости

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {// Установить уровень звука

        this.currentVolume = currentVolume;
    }

    public Radio (int RadioStation){
        this.maxStationNumber = RadioStation;

    }

    public Radio (){
    }

    public int setToLastStation() { // переключиться на последнюю станцию
        this.maxStationNumber = maxStationNumber;
        return maxStationNumber;
    }

    public int setToFirstStation() { // переключиться на первую станцию
        this.minStationNumber = minStationNumber;
        return minStationNumber;
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
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            return 0;
        }
        return currentVolume;
    }

    public int increaseVolume() { // увеличить громкость на 1
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            return 100;
        }
        return currentVolume;
    }

    public int prevStationNumber() {  // предыдущая радиостанция
        this.currentStationNumber--;
        if (currentStationNumber < 0) {
            currentStationNumber = 9;
        }
        return currentStationNumber;
    }

    public int nextStationNumber() { // следующая радиостанция
        this.currentStationNumber++;
        if (currentStationNumber > 9) {
            currentStationNumber = 0;
        }
        return currentStationNumber;
    }

    public void setStationNumber(int StationNumber) { // подходит ли выбранный номер станции
        if (StationNumber < 0) {
            return;
        }
        if (StationNumber > 9) {
            return;
        }
        this.currentStationNumber = StationNumber;
    }
    public void setRadioStation(int StationNumber) { // подходит ли выбранный номер станции,если задали количество сами

        if (StationNumber < minStationNumber) {
            return;
        }
        if (StationNumber > maxStationNumber) {
            return;
        }
        this.currentStationNumber = StationNumber;
    }
}



