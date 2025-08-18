enum TrafficLight {
    RED("Stop"),
    YELLOW("Get Ready"),
    GREEN("Go");

    private String action;

    // Constructor
    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}

public class TrafficEnumExample {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " -> " + light.getAction());
        }
    }
}
