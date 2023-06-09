/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
package curriculum1_22;

import java.time.LocalDateTime;

public class performanceClass {

	public static void main(String[] args) {
		// 時刻を取得する
		LocalDateTime now = LocalDateTime.now();
		
		// processClassを呼び出す
		processClass process = new processClass();
		
		// ロケーションを追加する
		process.setLocation("日本");
		
		// 食べ物を追加する
		process.setFood("寿司");
		
		// 料理の種類を追加する
		process.setFoodType("日本食");
		
		// 時刻を追加する
		process.setDate(now);
		
		// コンソールに出力する
		process.print();
	}
}
