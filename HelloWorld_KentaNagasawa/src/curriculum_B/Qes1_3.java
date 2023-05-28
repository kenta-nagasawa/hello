package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		
		System.out.println("課題1");
		// userName＝ログインユーザー名
		Scanner sca = null;
		sca = new Scanner(System.in); 
		System.out.print("\nユーザー名 > ");
		// 入力された文字を取得する
		String userName ="";
		userName = sca.nextLine();
		System.out.println(userName);

		// 入力された文字数を確認する
		int num = 0;
		num = userName.length();

		// 条件式を作る
		// 条件式num == 0がtrueの時に実行される処理
		if(num == 0||userName.isEmpty()) {
			System.out.println("「名前を入力してください」");
		} else if(num >= 11) {
			// 条件式がnum >= 11がtrueの時に実行される処理
			System.out.println("「名前を10文字以内にしてください」");
		} else {
			System.out.println("ユーザー名「"+ userName +"」を登録しました");
		}

		System.out.println("\n課題2");
		// 半角英数字のみ
		String alpha ="^[0-9a-zA-Z]+$";
		
		// 未入力の場合
		if(num <= 0 ||"".equals(userName)) {
			System.out.println("「名前を入力してください」");

			// 上記の条件式に当てはまらないときに実行される処理
			// 半角英数字でない場合に実行される処理
		} else if(userName.matches(alpha) == false) {
			System.out.println("「半角英数字のみで名前を入力してください」");

			// 半角英数字の場合の時に実行される処理	
		} else if(userName.matches(alpha) == true) {

			// 条件式がnum >= 11がtrueの時に実行される処理
			if(num >= 11 ) {
				System.out.println("「名前を10文字以内にしてください」");

			} else {
				System.out.println("ユーザー名「" + userName + "」を登録しました");
			}
		}

		System.out.println("\n課題3");
		
		do {
			System.out.print("ユーザー名 > ");
			userName = sca.nextLine();
			num = userName.length();
			
			// 入力が11文字以上の時
			if(num >= 11) {
				System.out.println("「名前を10文字以内にしてください」\n");

			// 入力がないとき	
			} else if(num <= 0 ||Objects.isNull(userName)) {
				System.out.println("「名前を入力してください」\n");
				
			// 入力があり、10文字以内の時
			} else if(num >= 1 && num <= 10) {
				// 入力が英数字のみの時と、そうでないときで出力を変化させる
				String result = userName.matches(alpha) == false ? "「半角英数字のみで名前を入力してください」\n" : "ユーザー名「"+ userName +"」を登録しました"; 
				System.out.println(result);
			} 
		// 未入力、11文字以上、英数字入力でないときもう一度行う	
		} while(userName.matches(alpha) == false || num >= 11 || num == 0);
		
		num = 0;
		int my = 0;
		int cpu = 0;

		// じゃんけんで自分が勝つまで実行される処理
		// 自分の手と相手の手ををそれぞれ格納する
		String[] myT = new String[3];
		myT[0] = "グー";
		myT[1] = "チョキ";
		myT[2] = "パー";
		String[] enemy = new String[3];
		enemy[0] = "グー";
		enemy[1] = "チョキ";
		enemy[2] = "パー";
		Random rand = new Random();		
		
		do {
			System.out.println("\nじゃんけん：0はグー、1：チョキ、2：パー");
			System.out.print("入力してください > ");
			
			// 自分の手
			my = sca.nextInt();
			// 相手の手
			cpu = rand.nextInt(3);
			
			// お互いの手を出力
			System.out.println(userName + "の手は" + myT[my]);
			System.out.println("相手の手は" + enemy[cpu]);

			// 自分がグーで負けた場合
			if(my == 1 && cpu == 0) {
				System.out.println("\n俺の勝ち！ \n負けは次につながるチャンスです！ \nネバーギブアップ！");

				// 自分がチョキで負けた場合
			} else if(my == 2 && cpu == 1) {
				System.out.println("\n俺の勝ち！ \nたかがじゃんけん、そう思ってないですか？ \nそれやったら次も、俺が勝ちますよ");

				// 自分がパーで負けた場合
			} else if(my == 0 && cpu == 2) {
				System.out.println("\n俺の勝ち！ \nなんで負けたか、明日まで考えといてください。 \nそしたら何かが見えてくるはずです");

				// あいこの場合
			} else if(my == cpu) {
				System.out.println("\nDRAW あいこ もう一回しましょう！");
				
			} else if(my >= 3 || my <= -1 || Objects.isNull(my)) {
				System.out.print("\n入力しなおしてください＞");
			}
			num++;

			// 自分が勝ったときのに実行される処理
		} while(my >= 3 || my <= -1 || my == 1 && cpu == 0 || my == 2 && cpu == 1 || my == 0 && cpu == 2 || my == cpu );
		System.out.println("\nやるやん。 \n次は俺にリベンジさせて \n\n勝つまでにかかった合計回数は"+ num + "回です");
	}
}









