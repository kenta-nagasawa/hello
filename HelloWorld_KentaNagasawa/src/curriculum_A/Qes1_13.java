package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
//		それぞれの役割をわかりやすくするため変数名は2文字以上に修正
//		初期値の設定
		System.out.println("問1,2,3");
//		課題1～3
//			バイト型を宣言し、初期値設定
			byte by;
		    by =0;
//		    byに10を代入
			by = 10;
//			短整数型を宣言し、初期値設定
			short sh;
			sh =0;
//		    shに1000を代入
			sh = 100;
//			整数型を宣言し、初期値設定
			int in;
			in =0;
//		    inに1000を代入
			in = 1000;
//			長整数型を宣言し、初期値設定
//			初期値を０Lに修正
			long lo;
			lo =0L;
//		    loに10000を代入
			lo = 10000;
//			単精度浮動小数点型を宣言し、初期値設定
//			初期値を0.0fに修正
			float fl;
			fl =0.0f;
//		    bflに9.5fを代入
			fl = 9.5f;
//			倍精度浮動小数点型を宣言し、初期値設定
			double dou;
			dou =0.0d;
//		    douに10.5を代入
			dou = 10.5;
//			文字型を宣言し、初期値設定
//			初期値を\u0000に修正
			char ch;
			ch = '\u0000';
//		    chにaを代入
			ch = 'a';
//			文字列型を宣言し、初期値設定
//			初期値をnullに修正
			String St;
			St=null;
//		    Stにハローを代入
			St = " ハロー ";
//			ブーリアン型を宣言し、初期値設定
			boolean bo;
			bo =false;
//		    boにtrueを代入
			bo = true;
			System.out.println("");
			
			
			System.out.println("問4");
//		課題4
//			11110を出力する
			System.out.println(by + sh + in + lo );
//			20を出力する
			System.out.println(fl + dou);
//			a ハロー trueを出力する
			System.out.println( ch + St + bo );
//			11130を出力する
			System.out.println(by + sh + in + lo + fl + dou);
//			10000000000を出力する
			System.out.println(by * sh * in * lo);
//			0.105を出力する
			System.out.println(dou / sh);
//			-90を出力する
			System.out.println(by - sh );
			
			System.out.println("");
			
			System.out.println("問5");
//      課題5
		    int num = 20;
		    int num1 = 23 ;
			System.out.println("ハローJAVA" + (num + num1));

			System.out.println("");
			System.out.println("問6");
//		課題6
//			Stringを宣言し、値を山田太郎18歳170.5cm62.2kg寿司とします。
			String st1 = "山田太郎";
			int in1 = 18;
			double dou2= 170.5;
			double dou3= 62.2;
			String st2 = "寿司";
//			初めまして山田太郎ですト出力する
			System.out.println("初めまして"+st1 +"です");
//			年齢は18歳ですと出力する
			System.out.println("年齢は" + in1 + "歳です");
//			身長は170.5cmですと出力する
			System.out.println("身長は"+ dou2 +"cmです");
//			体重は62.2㎏と出力する
			System.out.println("体重は"+ dou3 +"kgです");
//			好きな食べ物は寿司ですと出力する
			System.out.println("好きな食べ物は"+st2+"です");
			
			System.out.println("");
			System.out.println("問7");
//		課題7
//			身長をメートルに直す
			double height = dou2/100;
//			体重を変数に設定する
			double weight = dou3;
//			BMIを計算する
			double bmi = weight/(height * height);
			String bmi2=String.format("%.1f",bmi);
//			BMIを出力する
			System.out.println("BMIは"+bmi2 +"です");
			
			System.out.println("");
			System.out.println("問8");
//		課題8
//			変数に鈴木一郎24歳168.5cm64.2kgオムライスを再代入
			 st1 = "鈴木一郎";
			 in1 = 24;
			 dou2= 168.5;
			 dou3= 64.2;
			 st2 = "オムライス";
//			初めまして山田太郎ですト出力する
			System.out.println("初めまして"+st1 +"です");
//			年齢は18歳ですと出力する
			System.out.println("年齢は" + in1 + "歳です");
//			身長は170.5cmですと出力する
			System.out.println("身長は"+ dou2 +"cmです");
//			体重は62.2㎏と出力する
			System.out.println("体重は"+ dou3 +"kgです");
//			好きな食べ物は寿司ですと出力する
			System.out.println("好きな食べ物は"+st2+"です");
			
//			身長をメートルに直す
			height = dou2/100;
//			体重を変数に設定する
			weight = dou3;
//			BMIを計算する
			bmi = weight/(height * height);
			bmi2=String.format("%.1f",bmi);
//			BMIを出力する
			System.out.println("BMIは"+bmi2 +"です");;
	
			System.out.println("");
			System.out.println("問9");
//		 課題9
//			初めまして鈴木一郎ですと出力する
			System.out.println("初めまして"+st1 +"です");
			in1 = in1 + in1;
			System.out.println("年齢は"+in1+"歳です");
//			身長は337.0cmですと出力する
		    dou2 = dou2+ dou2;
			System.out.println("身長は"+dou2+"cmです");
//			体重は128.4kgですと出力する
			dou3 += dou3;
			System.out.println("体重は"+dou3+"kgです");
//			好きな食べ物はオムライスですと出力する
			System.out.println("好きな食べ物は"+st2+"です");
			
//			身長をメートルに直す
			height = dou2/100;
//			体重を変数に設定する
			weight = dou3;
//			BMIを計算する
			bmi = weight/(height * height);
			bmi2=String.format("%.1f",bmi);
//			BMIを出力する
			System.out.println("BMIは"+bmi2 +"です");;
			
			System.out.println("");
			System.out.println("問10");
//		課題10
//			8で使用した年齢が25歳以上ならtrueが出力される
//			in1を8で使用した数値に戻す
			in1 -=in1/2;
//			in1が25以上なら出力される
			System.out.println(in1 >=25 );
			 
			System.out.println("");
			System.out.println("問11");
//		課題11
//			8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
//			それぞれの値がint、double型のため、String型へ変換する
			String in2 =String.valueOf(in1);
//			dou2,dou3は8で使用した値に戻す
			String dou4 =String.valueOf(dou2-=dou2/2);
			String dou5 =String.valueOf(dou3-=dou3/2);
//　　　　　変換した値を文字列として出力する
			System.out.println(in2 + dou4 + dou5);
			 
			System.out.println("");
			System.out.println("問12");
//		課題12
//			 11で変換した【年齢・身長】を整数型に変換して出力
//			年齢を整数型へ変換
		    int age = Integer.parseInt(in2);
//		    年齢を出力
			System.out.println(age);
//		    String型からdouble型へ戻す
			double hei = Double.parseDouble(dou4);
//			体重を整数型で出力する
			System.out.println((int)hei);
			 
			System.out.println("");
			System.out.println("問13");
//			課題13
//			 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であれば実行される
			
			 System.out.println(age == 25 | hei >=160);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
	}

}
