package ru.netology;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation){
    if (newCurrentStation < 0) {
        newCurrentStation = 9;
    }
    if (newCurrentStation > 9) {
        newCurrentStation = 0;
    }
        currentStation = newCurrentStation;
    }

    public void switchNext() {
        int next = currentStation + 1;
        setCurrentStation(next);
    }

    public void switchPrev() {
        int prev = currentStation - 1;
        setCurrentStation(prev);
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void turnUpVolume() {
        int turnUp = currentVolume + 1;
        setCurrentVolume(turnUp);
    }

    public void turnDownVolume() {
        int turnDown = currentVolume - 1;
        setCurrentVolume(turnDown);
    }
}
