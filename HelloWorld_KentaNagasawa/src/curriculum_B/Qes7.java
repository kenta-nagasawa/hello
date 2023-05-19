package curriculum_B;

import java.util.Scanner;
public class Qes7 extends Qes6 {

	public static void main(String[] args) {

		System.out.println("課題7");

		// 生徒の人数を入力してください(2人以上):と出力する
		System.out.print("生徒の人数を入力してください(2人以上) ：");
		// 入力された値を読み込む
		Scanner sca = new Scanner(System.in);
		// nuのを変数として宣言する
		int num = sca.nextInt();
		// 一人あたりの合計を格納する配列を宣言する
		double[] all = new double[num];
		// 全員の英語の合計を代入する
		double enav = 0.0d;
		// 全員の数学の合計を代入する
		double maav = 0.0d;
		// 全員の理科の合計を代入する
		double syav = 0.0d;
		// 全員の社会の合計を代入する
		double soav = 0.0d;


		// for文を用いて、入力され人数分試行回数を適用する
		for(int n = 1; n <= num;n ++) {
			// 変数を宣言する
			String t1 ="人目の『";
			String t2 ="』の点数を入力してください ：";
			// 英語の点数を小数点表記にする
			System.out.print(n + t1 + "英語" + t2);
			// 入力された文字を変数に代入する
			sca = new Scanner(System.in);
			double en2 = sca.nextDouble();
			// 数学の点数を小数点表記にする
			System.out.print(n + t1 + "数学" + t2);
			// 入力された文字を変数に代入する
			sca = new Scanner(System.in);
			double ma2 = sca.nextDouble();
			// 理科の点数を小数点表記にする
			System.out.print(n + t1 + "理科" + t2);
			// 入力された文字を変数に代入する;
			sca = new Scanner(System.in);
			double sy2 = sca.nextDouble();
			// 社会の点数を小数点表記にする
			System.out.print(+ n + t1 + "社会" + t2);
			// 入力された文字を変数に代入する
			sca = new Scanner(System.in);
			double so2 = sca.nextDouble();
			System.out.print("\n");
			// 一人ずつの強化の点数を合計し、allに格納する
			all[n-1] = (en2 + ma2 + sy2 + so2) / 4;
			// 英語、数学、理科、社会の一人ずつ教科の点数をそれぞれの教科に足して合計する
			enav += en2;
			maav += ma2;
			syav += sy2;
			soav += so2;
		}
		// 人数分の試行を実行する
		for(int n = 1;n <= num ; n ++) {
			// 一人の全教科の平均点を出す。
			System.out.print("\n" + n + "人目の平均点は" + String.format("%.2f", all[n-1]) + "点です。");
		}
		// 教科ごとの合計を人数で割り、平均点を出す。
		double ema = enav / num;
		double maa = maav / num;
		double sya = syav / num;
		double soa = soav / num;
		// 全教科の全体を合計し、人数×教科数で割り平均点を変数で宣言する
		double emss = (enav + maav + syav + soav) / (num * 4);
		// それぞれの平均点をコンソールに出力する
		System.out.println("\n\n英語の平均点は" + String.format("%.2f",ema) + "点です。" +
		                    "\n数学の平均点は" + String.format("%.2f",maa) + "点です。" +
		                    "\n理科の平均点は" + String.format("%.2f",sya) + "点です。" +
		                    "\n社会の平均点は" + String.format("%.2f",soa) + "点です。" +
		                    "\n全体の平均点は" + String.format("%.2f",emss) + "点です。");

	}

}



