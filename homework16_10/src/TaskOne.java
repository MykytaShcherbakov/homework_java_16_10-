import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {
       int[] array = new int[8];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50) + 1;
        }

        System.out.println("Исходный массив: ");
        printArray(array);

        for (int i = 0; i < array.length; i +=2) {
            array[i] = 0;
        }

        System.out.println("Массив после замены: ");
        printArray(array);
    }
public static void printArray(int[] array){
        for (int num : array ) {
            System.out.print(num + " ");
        }
    System.out.println();
}
}