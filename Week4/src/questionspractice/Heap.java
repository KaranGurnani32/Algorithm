package questionspractice;

public class Heap {
    int[] data;

    Heap() {
        data = new int[0];
    }

    public void insert(int input) {
        //increase size of array
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        newData[data.length] = input;

        data = newData;

        heapCorrectionUpward();
    }

    private void heapCorrectionUpward() {
        print();
        int childIndex = data.length - 1;

        while (childIndex != 0) {
            //if p = i, lchild = 2i+1, rchild = 2i+2;
            //p = lchild-1/2 or rchild-2/2
            //lchild = 9, rchild = 10, p = 4 in both
            int parentIndex = (childIndex - 1) / 2;
            if (data[parentIndex] < data[childIndex]) {
                int temp = data[parentIndex];
                data[parentIndex] = data[childIndex];
                childIndex = parentIndex;
            } else {
                return;
            }
        }
    }

    private void print() {
        System.out.println("-----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + ", ");
        }
        System.out.println("");
        System.out.println("-----------------");
    }

    public int remove() {
        if (this.data.length <= 0) {
            System.out.println("it is empty");
            return -404;
        }

        // remove the root node and this will give you either the max or min of a particular heap
        int lastIndex = data.length - 1;

        //swap the last element with the root(first) element of the heap
        int elementToDelete = this.data[0];

        int temp = this.data[0];
        this.data[0] = this.data[lastIndex];
        this.data[lastIndex] = temp;

        //elementToDelete = this.data[lastIndex]

        int[] newData = new int[lastIndex];
        for (int i = 0; i < newData.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;

        heapCorrectionDownward();
        return elementToDelete;
    }

    private void heapCorrectionDownward() {
        int parentIndex = 0;
        int leftChildIndex = (2 * parentIndex) + 1;
        int rightChildIndex = (2 * parentIndex) + 2;

        while (leftChildIndex < this.data.length && rightChildIndex < this.data.length) {

            int currentLargerChildIndex;
            if (this.data[leftChildIndex] > this.data[rightChildIndex]) {
                currentLargerChildIndex = leftChildIndex;
            } else {
                currentLargerChildIndex = rightChildIndex;
            }

            if (this.data[currentLargerChildIndex] > this.data[parentIndex]) {
                int temp = this.data[parentIndex];
                this.data[parentIndex] = this.data[currentLargerChildIndex];
                this.data[currentLargerChildIndex] = temp;

                parentIndex = currentLargerChildIndex;
                leftChildIndex = (2*parentIndex) + 1;
                rightChildIndex = (2*parentIndex) + 2;

            } else {
                return;
            }
        }
    }
    public int remove(int index) {
        return 0;
    }

}
