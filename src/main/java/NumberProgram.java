public class NumberProgram {

    public static int findResult(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}