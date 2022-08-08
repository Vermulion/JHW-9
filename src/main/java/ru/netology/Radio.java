package ru.netology;

public class Radio {

    //Radio Stations Set
    private int stationsRange = 10; // Range of available stations
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;

    public Radio() {

    }

    public Radio(int stationsRange) {
        this.stationsRange = stationsRange;
        this.maxStation = minStation + stationsRange - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getStationsRange() {
        return stationsRange;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        currentStation = newCurrentStation;
    }

    public void switchNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void switchPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    // Radio volume set

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void turnUpVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume += 1;
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume -= 1;
    }
}
