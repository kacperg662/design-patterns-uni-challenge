public class FemaleBuilder implements Builder {
    private FemaleCharacter female;

    public FemaleBuilder() {
        reset();
    }

    @Override
    public void reset() {
        female = new FemaleCharacter();
    }

    @Override
    public void setHair(String hair) {
        female.hair = hair;
    }

    @Override
    public void setFace(String face) {
        female.face = face;
    }

    @Override
    public void setArms(String arms) {
        female.arms = arms;
    }

    @Override
    public void setLegs(String legs) {
        female.legs = legs;
    }

    @Override
    public void setTorso(String torso) {
        female.torso = torso;
    }

    @Override
    public FemaleCharacter getResult() {
        return female;
    }
}
