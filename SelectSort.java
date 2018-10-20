// 选择排序算法测试
public class SelectSort {
    public static void main(String[] args) {
        // 静态初始化一个乱序数组
        int[] arr = new int[] { 12, 4, 67, 2, 6, 2, 9, 5, 3, 23, 54 };
        // 选择排序算法处理乱序数组
        select(arr);
        // for循环遍历数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) { // 从后n-i个数组元素中依次选择比第i个元素小的元素相互更换，
                    int temp = arr[j]; // 最终第i个元素必然是后n-i个元素中最小的数值。（n=arr.length）
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}