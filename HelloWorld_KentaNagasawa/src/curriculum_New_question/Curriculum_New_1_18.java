package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	// 文字列型と整数型のメソッドを作成する。
	public static void Hello(String text , int num) {
		
		// コンソールに出力する。
		System.out.println(text + " " + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください。
	// 整数型のメソッドを作成し、呼び出されたときに戻り値jou1,jou2を乗算させる。
	public static void jouNum(int jou1 , int jou2) {
		System.out.println(jou1 * jou2);
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください。
	// 整数メソッド[hai]を作成するし、引数を配列にする。
	public static void hairetsu(int[] date) {
		
        // [date]の値を一つずつ[date1]に代入する。
		for(int date1 : date) {
			
			// [date1]に代入された値を出力する。
			System.out.println(date1);
		}
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// メソッド[jou]をオーバーロードして、引数を小数型にする。
	public static void jouNum(float jou1 , float jou2) {
		
		// 引数同士を和算する
		float jou3 = jou1 + jou2 ;
		
		// 小数点を2つまで表示し、コンソールに和算を出力する。
		System.out.println(String.format("%.2f", jou3));
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    // 配列メソッド[ran]を作成する。
	public static int[] Rand(int rand) {
		
		// 配列[all]を宣言し、[rand]の数だけ格納する。
		int[] all = new int[rand];
		
		// [rand]の回数分繰り返し処理する。
		for(int num = 1; num <= rand; num++) {
			
			// 1～100をランダムに[all]に格納する。
			all[num - 1] =new Random().nextInt(100) + 1;
			
			// [all]に格納された値を一つずつ出力する。
			System.out.println(all[num - 1]);
		}
		
		// [all]の格納した値を返り値にする 。
	    return all;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// double型メソッド[ave]を作成する。
	public static double averageNum(int aveg) {
		
		// 配列[all]を宣言する。
	    int all[];
	    
	    // メソッド[ran]を呼び出し、返り値を配列[all]に与える。
	    all = Rand(aveg);
	    
	    // double型[subAll]を宣言し、初期値を設定する。
	    // また[subAll]に返り値の合計を出すようにする。
	    double subAll = 0.0d;
	    
        // 拡張for文を使い、[all]に格納された値をひとつずつ[all1]に代入する、
	    for(int all1 : all) {
	    	
	    	// double型[subAll]に[all1]の値を足していく。
	        subAll += all1;
	    }
	    
	    // [aveAll]に返り値の平均値を代入する。
	    double aveAll = subAll / aveg;
	    
	    // コンソールに[aveAll]の値を出力する。
	    System.out.println("平均値：" + aveAll);
	    
	    // [aveAll]の値を返り値にする。
	    return aveAll;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください。
	// メソッド[judge]を作成し、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力する処理をする。
	public static void judge(int jud) {
		
		// double型[aveAll]を宣言する。
		double aveAll;
		
		// メソッド[ave]を呼び出し、返り値を[avaAll]に代入する。
		aveAll = averageNum(jud);
		
		// 返り値が50以上だったら出力する処理をする。
		System.out.println(aveAll >= 50);
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください。
		
		System.out.println("Q1");
		
		// 整数型と文字列型のメソッド[nure]を呼び出し、文字列型[st]に「Hello JavaSE」整数型[num]に「11」を入れる。
		Hello("Hello JavaSE" , 11);

		System.out.println("\nQ2");
		
		// 乗算メソッド[jou]を呼び出し、[Jou1,jou2]の値を7，3に入力する。
		jouNum(7 , 3);

		System.out.println("\nQ3");
		
		// 配列を指定する
		int[] subDate = {12 , 34 , 56 , 78 , 90};
		
		// 配列メソッド[hai]を呼び出し、配列を入力する。
		hairetsu(subDate);
		
		System.out.println("\nQ4");
		
		// [jou]メソッドに引数を入れる。
		jouNum(12.34f , 56.78f);
		
		System.out.println("\nQ5");
		
		// メソッド[ran]を呼び出し、[rand]に配列に格納する回数の引数として入れる。
		Rand(10);
	
		System.out.println("\nQ6");
		
		// メソッド[ave]を呼び出し、[aveg]に配列に格納する回数の引数として入れる。
		averageNum(10);
		
		System.out.println("\nQ7");
		
		// メソッド[judge]を呼び出し、[jud]に配列に格納する回数を引数として入れる。
		judge(10);
		}
	}









