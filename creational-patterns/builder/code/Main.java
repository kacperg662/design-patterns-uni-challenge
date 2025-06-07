public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        MaleBuilder maleBuilder = new MaleBuilder();
        director.makeYoung(maleBuilder);
        MaleCharacter youngMale = maleBuilder.getResult();
        System.out.println(youngMale);

        FemaleBuilder femaleBuilder = new FemaleBuilder();
        director.makeOld(femaleBuilder);
        FemaleCharacter oldFemale = femaleBuilder.getResult();
        System.out.println(oldFemale);
    }
}