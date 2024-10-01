public class Pz2 {

    public static int sumOfMinMaxIndexes(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім.");
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return minIndex + maxIndex;
    }

    public static void main(String[] args) {

        int[] array = {12, -4, 6, 50, 3, -1, 99, -100};

        int sum = sumOfMinMaxIndexes(array);
        System.out.println("Сума індексів мінімального та максимального елементів: " + sum);
    }
}
