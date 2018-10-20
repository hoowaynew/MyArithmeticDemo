import java.util.Scanner;

// 简易杨辉三角测试
public class YangHui {
    public static void main(String[] args) {
        // 生成Scanner对象，用于获取用户输入杨辉三角层数
        System.out.print("Please input the deep of YangHuiTriangle: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // 动态初始化二维数组，默认赋值为0
        int[][] arrIns = YangHuiTriangle(num);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arrIns[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 杨辉三角方法
    public static int[][] YangHuiTriangle(int n) {
        int[][] arr = new int[n][n];
        // 对杨辉三角对角线和第一列赋值为1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                }
            }
        }

        // 对非第一列数据和对角线数据进行处理
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }
}