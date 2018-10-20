// 插入排序算法测试
public class InsertSort {
    public static void main(String[] args) {
        // 静态初始化一个乱序数组arr
        int[] arr = new int[] { 12, 4, 67, 2, 6, 2, 9, 5, 3, 23, 54 };
        insert(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // 插入排序算法
    public static void insert(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}