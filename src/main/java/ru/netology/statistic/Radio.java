package ru.netology.statistic;

public class Radio {
    private int lastRadioStation = 9;
    private int radioStation;
    private int currentVolume;

    public Radio() {
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public Radio(int amountRadioStation) {
        this.lastRadioStation = amountRadioStation - 1;
        if (this.lastRadioStation < 0) {
            this.lastRadioStation = 0;

            System.out.println("К сожалению минимальное значение количества радиостанций равно 1");


        }
    }

    public void setRadioStation(int radioStation) {

        if (radioStation < 0) {
            radioStation = this.lastRadioStation;
        }
        if (radioStation > this.lastRadioStation) {
            radioStation = 0;
        }
        this.radioStation = radioStation;
    }

    public void nextRadioStation() {
        radioStation = radioStation + 1;
        if (radioStation > this.lastRadioStation) {
            radioStation = 0;
        }
    }

    public void prevRadioStation() {
        radioStation = radioStation - 1;
        if (radioStation < 0) {
            radioStation = this.lastRadioStation;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
