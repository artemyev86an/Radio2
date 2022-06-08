package ru.netology.statistic;

public class Radio {

    private int radioStation;
    private int currentVolume;

    public void setRadioStation(int radioStation) {

        if (radioStation < 0) {
            radioStation = 9;

        }
        if (radioStation > 9) {
            radioStation = 0;

        }

        this.radioStation = radioStation;

    }
    public int getRadioStation() {
        return radioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return;

        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
