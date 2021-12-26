package Week1Questions;

public class MoveNegative{

    public static void main(String[] args) {
        int [] array = {1, 2, -3, 4, -5, -7, -8, 9, 7};
        printArray(array);
        
        array = moveNegative(array);

        printArray(array);
    }

    private static int[] moveNegative(int[] array) {
        int [] b = new int[array.length];

        int index = 0;

        //only negative filled
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                b[index++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0) {
                b[index++] = array[i];
            }
        }

        return b;

        //find space efficient solution for this
    }

    private static void printArray(int[] array) {
        System.out.println("-----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");

    }
}