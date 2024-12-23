import java.util.Arrays;

public class Main {
    static int[] reverseArr(int[] intArr) {
        int[] reversed = new int[intArr.length];
        for (int k = 0; k < intArr.length; k++) {
            reversed[k] = intArr[intArr.length - 1 - k];
        }
        return reversed;
    }

    static double[] reverseArr(double[] doubleArr) {
        double[] reversed = new double[doubleArr.length];
        for (int k = 0; k < doubleArr.length; k++) {
            reversed[k] = doubleArr[doubleArr.length - k - 1];
        }
        return reversed;
    }

    static String[] reverseArr(String[] stringArr) {
        String[] reversed = new String[stringArr.length];
        for (int k = 0; k < stringArr.length; k++) {
            reversed[k] = stringArr[stringArr.length - k - 1];
        }
        return reversed;
    }

    public static void main(String[] args) {
        //Task 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] doubleArr = {1.57, 7.654, 9.986};
        String[] stringArr = {"One", "Two", "Three", "Four"};
        //Task 2
        System.out.print("Первый массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(((i != arr.length - 1) ? "%d, " : "%d\n"), arr[i]);
        }
        System.out.printf("Второй массив: " + Arrays.toString(doubleArr) + "\n");
        System.out.printf("Третий массив: " + Arrays.toString(stringArr) + "\n");
        //Task 3
        System.out.printf("Первый массив: " + Arrays.toString(reverseArr(arr)) + "\n");
        System.out.printf("Второй массив: " + Arrays.toString(reverseArr(doubleArr)) + "\n");
        System.out.printf("Третий массив: " + Arrays.toString(reverseArr(stringArr)) + "\n");
        //Task 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
            System.out.printf(i != arr.length - 1 ? "%d " : "%d\n", arr[i]);
        }

    }
}