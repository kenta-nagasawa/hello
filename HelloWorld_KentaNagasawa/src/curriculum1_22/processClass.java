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

// 現在時刻を入手できるようにする。
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class processClass {
	// ロケーションのフィールド
	private String location;
	// 食べ物のフィールド
	private String food;
	// 料理の種類のフィールド
	private String foodType;
	// 時刻のフィールド
	private LocalDateTime currentDateTime;
	
	// ロケーションを追加するメソッド
	public void setLocation(String location) {
		this.location = location;
	}
	
	// 食べ物を追加するメソッド
	public void setFood(String food) {
		this.food = food;
	}
	
	// 料理の種類を追加するメソッド
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	// 時刻を追加するメソッド
	public void setDate( LocalDateTime now) {
		this.currentDateTime = now;
	}
	
	// 日時のフォーマットを"yyyy/MM/dd HH:mm:ss"に指定する変数[date]を宣言する。
	DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	// コンソールに出力するメソッド
	public void print() {
		System.out.println("こんにちは！ここは" + this.location + "です！");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.foodType + "です" );
		System.out.println("今の現在時刻は" + date.format(this.currentDateTime) + "です。");
	}
}

