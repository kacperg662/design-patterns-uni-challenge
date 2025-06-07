public class Director {
    public void makeYoung(Builder builder) {
        builder.reset();
        builder.setHair("Short");
        builder.setFace("Smooth");
        builder.setArms("Slim");
        builder.setLegs("Fast");
        builder.setTorso("Athletic");
    }

    public void makeOld(Builder builder) {
        builder.reset();
        builder.setHair("Grey");
        builder.setFace("Wrinkled");
        builder.setArms("Weak");
        builder.setLegs("Slow");
        builder.setTorso("Thin");
    }
}
