package heap;

public class Heap {
    int[] data;

    Heap() {
        data = new int[0]; //[0]
    }

    public void insert(int input) {
        int[] newData = new int[data.length + 1];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        newData[data.length] = input;

        data = newData; //we inserted [8,2,8,5,3,1]

        heapUpwardCorrection();
    }

    private void heapUpwardCorrection() {
        print();
        int childIndex = data.length - 1; //reference of insert method data childIndex = 5

        while (childIndex != 0) {
            int parentIndex = (childIndex - 1) / 2; // pI = 0
            if (data[parentIndex] < data[childIndex]) {
                int temp = data[parentIndex];
                data[parentIndex] = data[childIndex];
                data[childIndex] = temp;
                childIndex = parentIndex; //cI = 0
            } else {
                return; //data still same
            }
        }
    }

    public int remove() {
        if (this.data.length <= 0) {
            System.out.println("Empty data");
            return -404;
        }

        int lastIndex = this.data.length - 1; //which data will it refer to?

        int elementToDelete = this.data[0]; //

        int temp = this.data[0];
        this.data[0] = this.data[lastIndex];
        this.data[lastIndex] = temp;

        int[] newData = new int[lastIndex]; //newData elements = 4
        for (int i = 0; i < newData.length; i++) { //newData.length = 4
            newData[i] = this.data[i];
        }
        this.data = newData;

        heapDownwardCorrection();
        return elementToDelete;
    }

    private void heapDownwardCorrection() {
        int parentIndex = 0;
        int leftChildIndex = (2 * parentIndex) + 1;
        int rightChildIndex = (2 * parentIndex) + 2;

        while (leftChildIndex < this.data.length && rightChildIndex <this.data.length) {

            int currentLargerChildIndex = (this.data[leftChildIndex] > this.data[rightChildIndex]) ?
                    leftChildIndex : rightChildIndex;

            if (this.data[currentLargerChildIndex] > this.data[parentIndex]) {
                int temp = this.data[parentIndex];
                this.data[parentIndex] = this.data[currentLargerChildIndex];
                this.data[currentLargerChildIndex] = temp;

                parentIndex = currentLargerChildIndex;
                leftChildIndex = (2 * parentIndex) + 1;
                rightChildIndex = (2 * parentIndex) + 2;
            } else {
                return;
            }
        }
    }

    void print() {
        System.out.println("---------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + ", ");
        }
        System.out.println("");
        System.out.println("---------------");
    }
}
