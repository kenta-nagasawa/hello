package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		課題1～3
//			バイト型を宣言し、初期値設定
			byte b ;
			b = 10;
//			短整数型を宣言し、初期値設定
			short s ;
			s = 100;
//			整数型を宣言し、初期値設定
			int i ;
			i = 1000;
//			長整数型を宣言し、初期値設定
			long l ;
			l = 10000;
//			単精度浮動小数点型を宣言し、初期値設定
			float f ;
			f = 9.5F;
//			倍精度浮動小数点型を宣言し、初期値設定
			double d ;
			d = 10.5;
//			文字型を宣言し、初期値設定
			char c;
			c = 'a';
//			文字列型を宣言し、初期値設定
			String t;
			t = "ハロー";
//			ブーリアン型を宣言し、初期値設定
			boolean n;
			n = true;
			
			
			
			
//		課題4
//			11110を出力する
			System.out.println(b + s + i + l );
//			20を出力する
			System.out.println(f + d);
//			a ハロー trueを出力する
			System.out.println( c + t + n );
//			11130を出力する
			System.out.println(b + s + i + l + f + d);
//			10000000000を出力する
			System.out.println(b * s * i * l);
//			0.105を出力する
			System.out.println(d / s);
//			-90を出力する
			System.out.println(b - s );
			
			
			
//      課題5
		    int num = 20;
		    int num1 = 23 ;
			System.out.println("ハローJAVA" + (num + num1));

			
			
//		課題6
//			Stringを宣言し、値を山田太郎18歳170.5cm62.2kg寿司とします。
			String st;
			st = "山田太郎18歳170.5cm62.2kg寿司";
//			初めまして山田太郎ですト出力する
			System.out.println("初めまして"+ st.substring(0,4) +"です");
//			年齢は18歳ですと出力する
			System.out.println("年齢は" + st.substring(4,7) + "です");
//			身長は170.5cmですと出力する
			System.out.println("身長は"+ st.substring(7,14) +"です");
//			体重は62.2㎏と出力する
			System.out.println("体重は"+ st.substring(14,20) +"です");
//			好きな食べ物は寿司ですと出力する
			System.out.println("好きな食べ物は"+st.substring(20,22)+"です");
			
			
			
//		課題7
//			身長をメートルに直す
			String hei =st.substring(7,12);
			double hei1 = Double.parseDouble(hei);
			double height = hei1/100;
//			体重を変数に設定する
			String wei =st.substring(14,18);
			double wei1 = Double.parseDouble(wei);
			double weight = wei1;
//			BMIを計算する
			double bmi = weight/(height * height);
			String bmi2=String.format("%.1f",bmi);
//			BMIを出力する
			System.out.println("BMIは"+bmi2 +"です");
			
			
			
//		課題8
//			変数stに鈴木一郎24歳168.5cm64.2kgオムライスを再代入
			st = "鈴木一郎24歳168.5cm64.2kgオムライス";
//			初めまして鈴木一郎ですと出力する
			System.out.println("初めまして"+ st.substring(0,4) +"です");
//			年齢は24歳ですと出力する
			System.out.println("年齢は" + st.substring(4,7) + "です");
//			身長は168.5cmですと出力する
			System.out.println("身長は"+ st.substring(7,14) +"です");
//			体重は64.2㎏と出力する
			System.out.println("体重は"+ st.substring(14,20) +"です");
//			好きな食べ物はオムライスですと出力する
			System.out.println("好きな食べ物は"+st.substring(20,25)+"です");
			
//			身長をメートルに直す
			String hei2 =st.substring(7,12);
			double hei3 = Double.parseDouble(hei2);
			double height1 = hei3/100;
//			体重を変数に設定する
			String wei2 =st.substring(14,18);
			double wei3 = Double.parseDouble(wei2);
			double weight1 = wei3;
//			BMIを計算する
			double bmi1 = weight1/(height1 * height1);
			String bmi3=String.format("%.1f",bmi1);
//			BMIを出力する
			System.out.println("BMIは"+bmi3 +"です");
	
			
			
//		 課題9
//			初めまして鈴木一郎ですと出力する
			System.out.println("初めまして"+ st.substring(0,4) +"です");
			String age = st.substring(4,6);
			int age1 = Integer.parseInt(age);
			age1 = age1 + age1;
			System.out.println("年齢は"+age1+"歳です");
//			身長は337.0cmですと出力する
			hei3 += hei3;
			System.out.println("身長は"+hei3+"cmです");
//			体重は128.4kgですと出力する
			wei3 += wei3;
			System.out.println("体重は"+wei3+"kgです");
//			好きな食べ物はオムライスですと出力する
			System.out.println("好きな食べ物は"+st.substring(20,25)+"です");
			
//			身長をメートルに直す
			 height1 = hei3/100;
//			体重を変数に設定する
			 weight1 = wei3;
//			BMIを計算する
			 bmi1 = weight1/(height1 * height1);
			 bmi3=String.format("%.2f",bmi1);
//			BMIを出力する
			System.out.println("BMIは"+bmi3 +"です");
			
			
			
//		課題10
//			8で使用した年齢が25歳以上ならtrueが出力される
			 System.out.println(age1 >=25 );
			 
			 
			 
//		課題11
//			8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
//			もとから文字型のため、そのまま記載
//			Int,Double型からString型へ変更するのは承知済み
//			構文String ○○=String.valueOf(××);

			 System.out.println(age + hei2 + wei2);
			 
			 
			 
//		課題12
//			 11で変換した【年齢・身長】を整数型に変換して出力
			int age2 = Integer.parseInt(age);
			System.out.println(age2);
			double hei4 = Double.parseDouble(hei2);
			System.out.println((int)hei4);
			int hei5 = (int)hei4;
			 
			
			
//			課題13
//			 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
//			 System.out.println(age2=25 || hei4 >=160);
			 System.out.println(age2 == 25 | hei5 >=160);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
	}

}
