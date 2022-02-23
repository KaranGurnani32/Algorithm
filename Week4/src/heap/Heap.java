package heap;

public class Heap {
    int[] data;

    Heap() {
        data = new int[0];
    }

    public void insert(int input) {
        //increase size of data array
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        newData[data.length] = input;

        data = newData; //reference

        heapCorrectionUpward();
    }

    private void heapCorrectionUpward() {
        print();
        int childIndex = data.length - 1;

        while (childIndex != 0) {
            int parentIndex = (childIndex - 1) / 2;
            if (data[parentIndex] < data[childIndex]) {
                int temp = data[parentIndex];
                data[parentIndex] = data[childIndex];
                data[childIndex] = temp;
                childIndex = parentIndex;
            } else {
                return;
            }
        }
    }

    public int remove() {
        if (this.data.length <= 0) {
            System.out.println("Empty ");
        }
    }

    private void print() {

        System.out.println("--------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
        System.out.println("--------------------");
    }
}
