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

// フォーマット変換をできるようにする。
import java.text.SimpleDateFormat;
// 現在時刻を入手できるようにする。
import java.util.Date;

public class processClass {
	// 変数[text1・text2]を宣言する。
	String text1;
	String text2;
	
	// 変数[date]を宣言し、現在時刻を代入する。
	Date date = new Date();
	
	// 日時のフォーマットを"yyyy/MM/dd HH:mm:ss"に指定する変数[fmt]を宣言する。
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	// 変数[date]に[fmt]のフォーマットを適用する。
	String now = fmt.format(date);
	
	// メソッドを宣言する
	public processClass() {
		
		/*変数[text1・text2]に
		  こんにちは！ここは日本です！
		  この寿司はうまい
		  寿司は和食です
		  今の現在日時はです
		  と入力する*/
		text1 = "こんにちは！ここは日本です！\n"+
			    "この寿司はうまい\n"+
			    "寿司は和食です\n"+
			    "今の現在時刻は";
		text2 = "です。";
	}
}

