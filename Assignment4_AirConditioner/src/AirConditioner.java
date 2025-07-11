public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        isOn = false;
        temperature = 24;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        return !isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (isOn && temperature < 30) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) {
            temperature--;
        }
    }
}
