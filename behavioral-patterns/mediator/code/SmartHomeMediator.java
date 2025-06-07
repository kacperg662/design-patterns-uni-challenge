public class SmartHomeMediator implements Mediator{
    private Light light;

    public void notify(String event) {
        if (event.equals("motion_detected")) {
            light.turnOn();
        } else if (event.equals("no_motion")) {
            light.turnOff();
        }
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
