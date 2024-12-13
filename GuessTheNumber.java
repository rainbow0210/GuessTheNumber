import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ランダム数生成用
        Random rand = new Random();
        int seikai = rand.nextInt(10) + 1; // 1から10の範囲のランダムな整数を生成

        Scanner scanner = new Scanner(System.in);
        int kaitou = 0;

        while (seikai != kaitou) {
            System.out.print("答えを入力してください：");
            kaitou = scanner.nextInt();

            if (kaitou > 10 || kaitou <= 0) {
                System.out.println("1から10の間の数を入力してください。");
            } else if (kaitou == seikai) {
                System.out.println("正解です！");
            } else if (kaitou < seikai) {
                System.out.println("もう少し大きい数です！");
            } else {
                System.out.println("もう少し小さい数です！");
            }
        }

        scanner.close();
    }
}
