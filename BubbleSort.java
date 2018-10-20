// 冒泡排序算法测试
public class BubbleSort {
    public static void main(String[] args) {
        // 静态初始化一个乱序数组
        int[] arr = new int[] { 12, 4, 67, 2, 6, 2, 9, 5, 3, 23, 54 };
        // 冒泡算法处理乱序数组
        bubble(arr);
        // for循环遍历数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // 冒泡排序方法
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {  // 从数组尾部开始往顶部冒泡，内部for循环一遍则冒出一个最小值，
                if (arr[j] < arr[j - 1]) {              // 所以前i个数据已经有序，只需满足j>i即可。
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}