public class Main {
    public static void main(String[] args) {
        float[] arr1 = {5.0f, 1.2f, 3.8f, 4.9f, 5.2f};
        float[] arr2 = {1.3f, 4.3f, 2.9f, 7.4f, 5.1f};

        CalculationsData calculationsData = new CalculationsData(arr1, arr2);
        CalculationsProxy calculationsProxy = new CalculationsProxy(calculationsData);

        float[] result = calculationsProxy.calculate(Calculation.MULTIPLY);
        calculationsProxy.displayResult(result);
        float[] multiplyResult = calculationsProxy.getLastResult();

        result = calculationsProxy.calculate(Calculation.MULTIPLY_TWO_TIMES);
        calculationsProxy.displayResult(result);
        float[] multiplyTwiceResult = result;
    }
}
