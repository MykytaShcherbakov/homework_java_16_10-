import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив:");
        printArray(array);

        boolean isStrictlyIncreasing = isStrictlyIncreasing(array);

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }

        // Пример 1
        int[] array1 = {1, 2, 3, 5};
        int N1 = 5;
        System.out.println("Пропущенный элемент: " + findMissingElement(array1, N1));

        // Пример 2
        int[] array2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int N2 = 10;
        System.out.println("Пропущенный элемент: " + findMissingElement(array2, N2));
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean isStrictlyIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int findMissingElement(int[] array, int N) {
        int totalSum = N * (N + 1) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}
