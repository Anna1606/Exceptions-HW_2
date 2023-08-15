// Если необходимо, исправьте данный код

public class Task2 {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 10);
        }

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            System.err.println("Catching exception: " + e);
        }
    }
}
