/*

 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
	サイトURL
	https://www.javadrive.jp/start/extends/index1.html 
 */
package sub1_25;
import java.util.Objects;
// RandomとScannerを使えるようにする
import java.util.Random;
import java.util.Scanner;

// パッケージ[curriculum1_25]のクラス[status]を呼び出す
import curriculum1_25.status;

public class sub extends status{
	sub(){
		// プレイヤー名とコンソールに出力する
		System.out.print("プレイヤー名＞");

		// 名前を入力する
		Scanner scn = new Scanner(System.in);

		// 名前を読み取る
		String name = scn.nextLine();
		scn.close();
		
		// 入力がなかった場合
		if(Objects.isNull(name) || name.isEmpty()) {
			System.out.println("NULL");
			return;

		// 入力があった場合
		} else {

			// [setUser]に"こんにちは「" + name + "」さん"を代入する
			super.setUser("こんにちは「" + name + "」さん");

			// [statusNum]配列を作る
			int[] statusNum = new int[5];

			// [rnd]変数を宣言紙、乱数を呼び出す
			Random randomNum = new Random();

			// 乱数をステータス5個分[statusNum]に繰り返し代入する
			for(int i = 0; i <= 4; i++) {

				// 1～999の数値を取得する
				int randomValue = randomNum.nextInt(998) + 1;

				// 取得した値を[statusNum]に格納する
				statusNum[i] = randomValue; 
			}

			// 格納された値をそれぞれの変数に代入する
			super.setHP(statusNum[0]);
			super.setMP(statusNum[1]);
			super.setAttack(statusNum[2]);
			super.setSpeed(statusNum[3]);
			super.setDefense(statusNum[4]);
			
			// コンソールに出力する
			System.out.println(super.getUser() + "\nステータス" + 
					"\nHP：" + super.getHP() + 
					"\nMP：" + super.getMP() +
					"\n攻撃力：" + super.getAttack() + 
					"\n素早さ：" + super.getSpeed() + 
					"\n防御力：" + super.getDefense() +
					"\n\nさあ冒険に出かけよう！" );
		}
	}
	
	public static void main(String[] args) {
		sub sub = new sub();
	}
}
