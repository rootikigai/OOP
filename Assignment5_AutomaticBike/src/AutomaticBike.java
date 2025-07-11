public class AutomaticBike {
    private boolean isOn;
    private int speed;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        if (speed >= 0 && speed <= 20) return 1;
        if (speed >= 21 && speed <= 30) return 2;
        if (speed >= 31 && speed <= 40) return 3;
        return 4;
    }

    public void accelerate() {
        if (!isOn) return;

        switch (getGear()) {
            case 1 -> speed += 1;
            case 2 -> speed += 2;
            case 3 -> speed += 3;
            case 4 -> speed += 4;
        }
    }

    public void decelerate() {
        if (!isOn) return;

        switch (getGear()) {
            case 1 -> speed -= 1;
            case 2 -> speed -= 2;
            case 3 -> speed -= 3;
            case 4 -> speed -= 4;
        }

        if (speed < 0) speed = 0;
    }
}
