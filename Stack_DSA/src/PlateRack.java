import java.util.Stack;

public class PlateRack {
    private Stack<String> plates = new Stack<>();

    public PlateRack() {
        plates = new Stack<>();
    }
    public void addPlate(String plate) {
        plates.push(plate);
    }
    public String removePlate() {
        if (!plates.isEmpty()) {
            return plates.pop();
        }
        return null;
    }

    public String peekPlate() {
        if (!plates.isEmpty()) {
            return plates.peek();
        }
        return null;
    }

    public boolean isRackEmpty() {
        return plates.isEmpty();
    }

    public int plateCount() {
        return plates.size();
    }
}
