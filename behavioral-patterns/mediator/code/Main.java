public class Main {
    public static void main(String[] args) {
        SmartHomeMediator mediator = new SmartHomeMediator();
        MotionSensor sensor = new MotionSensor(mediator);
        Light light = new Light();
        mediator.setLight(light);

        sensor.detectedMotion();
        sensor.noMotion();
    }
}
