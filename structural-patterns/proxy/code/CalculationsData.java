public class CalculationsData implements Calculations {
    private final float[] arr1;
    private final float[] arr2;

    public CalculationsData(float[] arr1, float[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    @Override
    public float[] calculate(Calculation calculation) {
        switch (calculation) {
            case MULTIPLY:
                return multiply();
            case MULTIPLY_TWO_TIMES: {
                float[] result = multiply();
                for (int i = 0; i < result.length; i++) {
                    result[i] *= result[i];
                }
                return result;
            }
            case MULTIPLY_THREE_TIMES: {
                float[] result = multiply();
                for (int i = 0; i < result.length; i++) {
                    result[i] *= result[i] * result[i];
                }
                return result;
            }
            default:
                throw new IllegalArgumentException("Unknown calculation type: " + calculation);
        }
    }

    public float[] multiply() {
        int newLength = Math.min(arr1.length, arr2.length);
        float[] result = new float[newLength];

        for (int i = 0; i < newLength; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        return result;
    }
}