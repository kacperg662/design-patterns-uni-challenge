public class MotionSensor {
    private final SmartHomeMediator mediator;

    public MotionSensor(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    public void detectedMotion() {
        System.out.println("Motion detected.");
        mediator.notify("motion_detected");
    }

    public void noMotion() {
        mediator.notify("no_motion");
    }
}
