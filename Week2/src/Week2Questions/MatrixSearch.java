package Week2Questions;

public class MatrixSearch {
    public static void main(String[] args) {
        int num = 121;

        int squareRoot = squareRootOfNum(num);

        System.out.println("Square root is " + squareRoot);
    }

    private static int squareRootOfNum(int num) {
        int low = 1;
        int high = num;

        int mid = 0;

        while (low<=high){
            int midSquare = mid * mid;
            if (midSquare == num){
                return mid;
            } else if (midSquare>num){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }
}
