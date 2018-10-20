package lianxi.day04;

public class JuXing {
    public static void main(String[] args) {
        love();
    }

    public static void zero() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 8; k++) {
                if (i > 1 && i < 5 && k > 1 && k < 8) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void five() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 2 && j > 1) {
                    System.out.print(" ");
                    continue;
                } else if (i == 4 && j < 8) {
                    System.out.print(" ");
                    continue;
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void love() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 32; j++) {   //定义个5行20列的循环
                if (i == 1 && j > 8 && j < 13 || j > 20 && j < 24) { //定义第一行输出条件
                    System.out.print(" ");  //满足条件的输出空格
                    continue;
                } else if (i == 2 && j > 1 && j < 20 || i == 2 && j > 20 && j < 24 || i == 2 && j > 24 && j < 32) { //定义第二行
                    System.out.print(" "); //输出空格
                    continue;
                } else if (i == 3 && j > 8 && j < 13 || i == 3 && j > 20 && j < 24 || i == 3 && j > 24 && j < 32) { //定义第三行
                    System.out.print(" ");
                    continue;
                } else if (i == 4 && j < 8 || i == 4 && j > 8 & j < 13 || i == 4 & j > 13 & j < 24 || i == 4 && j > 24 & j < 32) {
                    System.out.print(" ");
                    continue;
                } else if (i == 5 && j > 8 && j < 13|| j > 20 && j < 24) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();

        }
    }
}





