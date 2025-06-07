public class MaleBuilder implements Builder {
    private MaleCharacter male;

    public MaleBuilder() {
        reset();
    }

    @Override
    public void reset() {
        male = new MaleCharacter();
    }

    @Override
    public void setHair(String hair) {
        male.hair = hair;
    }

    @Override
    public void setFace(String face) {
        male.face = face;
    }

    @Override
    public void setArms(String arms) {
        male.arms = arms;
    }

    @Override
    public void setLegs(String legs) {
        male.legs = legs;
    }

    @Override
    public void setTorso(String torso) {
        male.torso = torso;
    }

    @Override
    public MaleCharacter getResult() {
        return male;
    }
}
