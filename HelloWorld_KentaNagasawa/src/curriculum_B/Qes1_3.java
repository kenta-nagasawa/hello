package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		
		System.out.println("課題1");
		// userName＝ログインユーザー名
		Scanner sca;
		String userName = "";
		int userNum = 0;
		sca = new Scanner(System.in); 
		System.out.print("\nユーザー名 > ");
		
		// 入力された文字を取得する
		userName = sca.nextLine();
		
		// 入力がない場合の処理
		if (Objects.isNull(userName) || userName.isEmpty()) {
		    System.out.println("「名前を入力してください」");
			return;
		}
		
		// 入力された文字数を確認する
		userNum = userName.length();
			
		// 入力が11文字以上の時
		if(userNum >= 11) {
			System.out.println("「名前を10文字以内にしてください」");
			
		// 入力があり、10文字以内の時	
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
			}
		
		
		System.out.println("\n課題2");
		// 半角英数字のみ
		String alpha ="^[0-9a-zA-Z]+$";
		
		userName = "";
		System.out.print("\nユーザー名 > ");
		
		// 入力された文字を取得する
		userName = sca.nextLine();
		
		// 未入力の場合
		if(Objects.isNull(userName) || userName.isEmpty()) {
			System.out.println("「名前を入力してください」");
			return;
		}
		
		// 半角英数字でない場合に実行される処理
		if(!userName.matches(alpha)) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		}
		
		// 入力された文字数を確認する
		userNum = userName.length();
		
		// 入力が11文字以上の時
		if(userNum >= 11) {
			System.out.println("「名前を10文字以内にしてください」");
		
		// 入力があり、10文字以内の時
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
			}
		
		
		System.out.println("\n課題3");
		
		do {
			userName = "";
			userNum = 0;
			System.out.print("ユーザー名 > ");
			
			// 入力された文字を取得する
			userName = sca.nextLine();
			// 入力された文字数を確認する
			userNum = userName.length();
			
			// 未入力の場合
			if(Objects.isNull(userName) || userName.isEmpty()) {
				System.out.println("「名前を入力してください」");
			
			// 入力が11文字以上の時
			} else if(userNum >= 11 ) {
				System.out.println("「名前を10文字以内にしてください」");
				
				// 入力があり、10文字以内の時
				} else {
				// 入力が英数字のみの時と、そうでないときで出力を変化させる
				String result = !userName.matches(alpha) ? "「半角英数字のみで名前を入力してください」\n" : "ユーザー名「"+ userName +"」を登録しました"; 
				System.out.println(result);
				}

		// 未入力、11文字以上、英数字入力でないときもう一度行う	
		} while(userName.matches(alpha) == false || userNum >= 11 || userNum == 0);
		
		String myNum;
		int my = 0;
		int cpu = 0;
		int tryNum = 0;
		
		// じゃんけんで自分が勝つまで実行される処理
		// 自分の手と相手の手ををそれぞれ格納する
		String[] myT = {"グー","チョキ", "パー"};
		String[] enemy = {"グー","チョキ", "パー"};
		// 相手の手をランダムにする
		Random rand = new Random();
		
		do {
			System.out.println("\nじゃんけん：0はグー、1：チョキ、2：パー");
			System.out.print("入力してください > ");
			
			// 整数での入力チェック
			myNum = sca.nextLine();
			
			// 値が整数でない場合,0～2の場合
			if(!myNum.matches("-?\\d+")) {
				System.out.println("エラー");
				
		    // 整数の場合
			} else {
				
			// 自分の手
			my = Integer.valueOf(myNum);
			
			// 0～2出ない場合
			if(my >= 3 || my <= -1) {
				System.out.println("エラー");
				
			} else {
			
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
			}
			tryNum++;
			}
			}
	
		// 自分が勝ったときのに実行される処理
		} while(my >= 3 || my <= -1 || my == 1 && cpu == 0 || my == 2 && cpu == 1 || my == 0 && cpu == 2 || my == cpu );
		System.out.println("\nやるやん。 \n次は俺にリベンジさせて \n\n勝つまでにかかった合計回数は"+ tryNum + "回です");
	}
}









