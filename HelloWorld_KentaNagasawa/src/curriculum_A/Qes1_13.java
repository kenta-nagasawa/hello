package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//それぞれの役割をわかりやすくするため変数名は2文字以上に修正
		//初期値の設定
		System.out.println("問1,2,3");
		//		課題1～3
		// バイト型を宣言し、初期値設定
		byte by;
		by =0;
		// byに10を代入
		by = 10;
		// 短整数型を宣言し、初期値設定
		short sh;
		sh =0;
		// shに1000を代入
		sh = 100;
		// 整数型を宣言し、初期値設定
		int in;
		in =0;
		// inに1000を代入
		in = 1000;
		// 長整数型を宣言し、初期値設定
		// 初期値を０Lに修正
		long lo;
		lo =0L;
		// loに10000を代入
		lo = 10000L;
		// 単精度浮動小数点型を宣言し、初期値設定
		// 初期値を0.0fに修正
		float fl;
		fl =0.0f;
		// bflに9.5fを代入
		fl = 9.5f;
		// 倍精度浮動小数点型を宣言し、初期値設定
		double dou;
		dou =0.0d;
		// douに10.5を代入
		dou = 10.5d;
		// 文字型を宣言し、初期値設定
		// 初期値を\u0000に修正
		char ch;
		ch = '\u0000';
		// chにaを代入
		ch = 'a';
		// 文字列型を宣言し、初期値設定
		// 初期値をnullに修正
		String St;
		St=null;
		// Stにハローを代入
		St = " ハロー ";
		// ブーリアン型を宣言し、初期値設定
		boolean bo;
		bo =false;
		// boにtrueを代入
		bo = true;
		System.out.println("");


		System.out.println("問4");
		// 課題4
		// 11110を出力する
		System.out.println(by + sh + in + lo );
		// 20を出力する
		System.out.println(fl + dou);
		// a ハロー trueを出力する
		System.out.println( ch + St + bo );
		// 11130を出力する
		System.out.println(by + sh + in + lo + fl + dou);
		// 10000000000を出力する
		System.out.println(by * sh * in * lo);
		// 0.105を出力する
		System.out.println(dou / sh);
        // -90を出力する
		System.out.println(by - sh );

		System.out.println("");

		System.out.println("問5");
		// 課題5
        // 文字列型だと、計算が行われないため、整数型に変換
		int num = 20;
		int num1 = 23 ;
		// コンソールにハローJAVA43と出力する
		System.out.println("ハローJAVA" + (num + num1));

		System.out.println("");
		System.out.println("問6");
		// 課題6
		// Stringを宣言し、値を山田太郎18歳170.5cm62.2kg寿司とします。
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String eat = "寿司";
		// 初めまして山田太郎ですト出力する
		System.out.println("初めまして" + name + "です");
		// 年齢は18歳ですと出力する
		System.out.println("年齢は" + age + "歳です");
		// 身長は170.5cmですと出力する
		System.out.println("身長は"+ height +"cmです");
		// 体重は62.2㎏と出力する
		System.out.println("体重は"+ weight +"kgです");
		// 好きな食べ物は寿司ですと出力する
		System.out.println("好きな食べ物は"+ eat +"です");

		System.out.println("");
		System.out.println("問7");
		// 課題7
		// 身長をメートルに直す
		double height1 = height/100;
		// 体重を変数に設定する
		double weight1 = weight;
		// BMIを計算する
		double bmi = weight1/(height1 * height1);
		String bmi2=String.format("%.1f",bmi);
		// BMIを出力する
		System.out.println("BMIは"+bmi2 +"です");

		System.out.println("");
		System.out.println("問8");
		// 課題8
		// 変数に鈴木一郎24歳168.5cm64.2kgオムライスを再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		eat = "オムライス";
		// 初めまして山田太郎ですト出力する
		System.out.println("初めまして" + name + "です");
		// 年齢は18歳ですと出力する
		System.out.println("年齢は" + age + "歳です");
		// 身長は170.5cmですと出力する
		System.out.println("身長は"+ weight +"cmです");
		// 体重は62.2㎏と出力する
		System.out.println("体重は"+ weight +"kgです");
		// 好きな食べ物は寿司ですと出力する
		System.out.println("好きな食べ物は"+ eat +"です");

		// 身長をメートルに直す
		height = height/100;
		// 体重を変数に設定する
		weight1 = weight;
		// BMIを計算する
		bmi = weight1/(height1 * height1);
		bmi2=String.format("%.1f",bmi);
		// BMIを出力する
		System.out.println("BMIは"+bmi2 +"です");;

		System.out.println("");
		System.out.println("問9");
		// 課題9
		// 初めまして鈴木一郎ですと出力する
		System.out.println("初めまして"+ name +"です");
		age = age+ age;
		System.out.println("年齢は"+ age +"歳です");
		// 身長は337.0cmですと出力する
		height = height + height ;
		System.out.println("身長は"+ height +"cmです");
		// 体重は128.4kgですと出力する
		weight += weight ;
		System.out.println("体重は"+ weight +"kgです");
		// 好きな食べ物はオムライスですと出力する
		System.out.println("好きな食べ物は"+ eat +"です");

		// 身長をメートルに直す
		height1 = height/100;
		// 体重を変数に設定する
		weight1 = weight;
		// BMIを計算する
		bmi = weight1/(height1 * height1);
		bmi2=String.format("%.1f",bmi);
		// BMIを出力する
		System.out.println("BMIは"+bmi2 +"です");;

		System.out.println("");
		System.out.println("問10");
		// 課題10
		// 年齢を8で使用した数値に戻す
		age -= age / 2 ;
		// 年齢が25以上なら出力される
		System.out.println(age >= 25 );

		System.out.println("");
		System.out.println("問11");
		// 課題11
		// 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		// それぞれの値がint、double型のため、String型へ変換する
		String age2 =String.valueOf(age);
		//身長,体重を8で使用した値に戻す
		String height2 =String.valueOf(height -= height/2);
		String weight2 =String.valueOf(weight -= weight/2);
		// 変換した値を文字列として出力する
		System.out.println(age2 + height2 + weight2);

		System.out.println("");
		System.out.println("問12");
		// 課題12
		// 11で変換した【年齢・身長】を整数型に変換して出力
		// 年齢を整数型へ変換
		int age3 = Integer.parseInt(age2);
		// 年齢を出力
		System.out.println(age3);
		// String型からdouble型へ戻す
		double height3 = Double.parseDouble(height2);
		// 体重を整数型で出力する
		System.out.println((int)height3);

		System.out.println("");
		System.out.println("問13");
		// 課題13
		// 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であれば実行される

		System.out.println(age3 == 25 | height3 >=160);











	}

}
