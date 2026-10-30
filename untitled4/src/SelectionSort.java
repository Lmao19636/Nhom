import java.util.Arrays;

public  class SelectionSort {

    // Hàm triển khai thuật toán Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Di chuyển ranh giới của mảng con chưa được sắp xếp
        for (int i = 0; i < n - 1; i++) {
            // Giả định phần tử đầu tiên của chuỗi chưa sắp xếp là nhỏ nhất
            int minIdx = i;

            // Tìm phần tử nhỏ nhất trong đoạn chưa sắp xếp còn lại
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // Cập nhật chỉ số của phần tử nhỏ nhất
                }
            }

            // Hoán đổi phần tử nhỏ nhất tìm được với phần tử đầu tiên của đoạn chưa sắp xếp
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(data));

        selectionSort(data);

        System.out.println("Mảng sau khi sắp xếp:  " + Arrays.toString(data));
    }
}
