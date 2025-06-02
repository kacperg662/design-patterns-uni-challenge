public class CalculationsProxy implements Calculations{
    private final CalculationsData calculationsData;
    private float[] lastResult;

    public CalculationsProxy(CalculationsData calculationsData) {
        this.calculationsData = calculationsData;
        lastResult = new float[]{0.0f};
    }

    @Override
    public float[] calculate(Calculation calculation) {
        float[] result = calculationsData.calculate(calculation);
        this.lastResult = result;
        return result;
    }

    public void displayResult(float[] result) {
        for (float number : result) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public float[] getLastResult() { return this.lastResult; }
}
