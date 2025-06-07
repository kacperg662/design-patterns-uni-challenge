public abstract class Character {
    protected String hair;
    protected String face;
    protected String arms;
    protected String legs;
    protected String torso;

    @Override
    public String toString() {
        return String.format(
                "%s [Hair: %s, Face: %s, Arms: %s, Legs: %s, Torso: %s]",
                this.getClass().getSimpleName(), hair, face, arms, legs, torso
        );
    }
}
