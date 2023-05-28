package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		System.out.println("課題6");
		// 変数を宣言し、値を設定する
		String text = "の残りの台数は";
		String text2 = "台です\n";

		Random rand = new Random();

		System.out.print("商品を入力してください＞");
		// 入力された文字をscaに代入する
		Scanner sca = new Scanner(System.in);
		// 入力された文字をString型に変更する
		String str = sca.nextLine();
		// 、を区切りと指定する。
		String[] menu = str.split("、");
		// 拡張for文で入力された値すべてを実行する処理
		for(String ele : menu) {
			switch (ele){

			case "パソコン":
				// 入力がパソコンときに実行される処理
				// 変数にランダムに0~11の数値が入るようにする
				int pc = rand.nextInt(12);
				System.out.println(ele + text + pc + text2);
				break;

			case "冷蔵庫":
				// 入力が冷蔵庫のときに実行される処理
				// 変数にランダムに0~11の数値が入るようにする
				int re = rand.nextInt(12);
				System.out.println(ele + text + re + text2);
				break;
			
			case "扇風機":
				// 入力が冷蔵庫のときに実行される処理
				// 変数にランダムに0~11の数値が入るようにする
				int ok = rand.nextInt(12);
				System.out.println(ele + text + ok + text2);
				break;
			
			case "洗濯機":
				// 入力が洗濯機のときに実行される処理
				// 変数にランダムに0~11の数値が入るようにする
				int se = rand.nextInt(12);
				System.out.println(ele + text + se + text2);
				break;
			
			case "加湿器":
				// 入力が加湿器のときに実行される処理
				// 変数にランダムに0~11の数値が入るようにする
				int ka = rand.nextInt(12);
				System.out.println(ele + text + ka + text2);
				break;

			
			case  "テレビ","ディスプレイ" :
				// 入力がテレビまたはディスプレイのときに実行される処理
				// 変数にランダムに0~11の数値が入るようにする
				int tv = rand.nextInt(12);
				// 変数にランダムに0~11の数値が入るようにする
				int dp = rand.nextInt(12);
				// 条件演算子を使い入力がテレビ、ディスプレイの切り分けを行う処理
				String result= ele == "テレビ" ? ele + text + tv + text2 : ele + text + dp + text2;
				System.out.println(result);
				break;

			// 入力が条件に当てはまらなかったのときに実行される処理
			default :
				System.out.println("『 " + ele + " 』は指定の商品ではありません" + "\n");
				break;
			}
		}
	}
}


