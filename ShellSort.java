// 插入希尔算法测试
public class ShellSort {
    public static void main(String[] args) {
        // 静态初始化一个乱序数组arr
        int[] arr = new int[] { 12, 4, 67, 2, 6, 2, 9, 5, 3, 23, 54 };
        shell(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void shell(int[] arr) {
        int increment = arr.length;
        do {
            increment = increment / 3 + 1;
            for (int i = increment; i < arr.length; i++) { // 从间隔increment之后开始往后依次与前increment间隔的数据比较，小的则交换到前面
                for (int j = i; j >= increment; j -= increment) { // 将每个以increment间隔分割的小数组有序化
                    if (arr[j] < arr[j - increment]) {
                        int temp = arr[j];
                        arr[j] = arr[j - increment];
                        arr[j - increment] = temp;
                    }
                }
            }
        } while (increment > 1);
    }
}