import java.util.Scanner;

// ����������ǲ���
public class YangHui {
    public static void main(String[] args) {
        // ����Scanner�������ڻ�ȡ�û�����������ǲ���
        System.out.print("Please input the deep of YangHuiTriangle: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // ��̬��ʼ����ά���飬Ĭ�ϸ�ֵΪ0
        int[][] arrIns = YangHuiTriangle(num);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arrIns[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // ������Ƿ���
    public static int[][] YangHuiTriangle(int n) {
        int[][] arr = new int[n][n];
        // ��������ǶԽ��ߺ͵�һ�и�ֵΪ1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                }
            }
        }

        // �Էǵ�һ�����ݺͶԽ������ݽ��д���
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }
}