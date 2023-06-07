package basicClass;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// [Dog]クラスを呼び出し、変数[sub]に代入する。
		Dog sub = new Dog();
		
	    // [Dog]クラスの変数[name]をコンソールに出力する。
		System.out.println(sub.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// [Dog]クラスの変数[num]をコンソールに出力する
		System.out.println(sub.num);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在時刻を変数[date]に代入する。
		Date date = new Date();
		
		// 日時を「yyyy-MM-dd H:m:s」形式に変換する変数[fmt]を作成する
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		// 変数[nowDate]に[fmt]フォーマットを適用する。
		String nowDate = fmt.format(date);
		
		// 現在時刻を出力する。
		System.out.println(nowDate);
	}
}
