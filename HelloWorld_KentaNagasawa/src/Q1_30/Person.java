package Q1_30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age = 0;
	public double height = 0.0d;
	public double weight = 0.0d;
	public static int number = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name1, int age1, double height1, double weight1){

		// 受け取った値をそれぞれ代入する
		this.name = name1;
		this.age = age1;
		this.height = height1;
		this.weight = weight1;
		// カウントを1つ進める
		number++;
	}

	// bmiメソッドを作成する
	public double bmi() {

		// BMIを計算し、戻り値とする
		return this.weight / this.height / this.height;
	}

	// printメソッドを作成する
	public void print() {

		// BMIを呼び出し、小数点を切り捨てる
		double bmiPerson = Math.floor(this.bmi());

		//コンソールに出力する
		System.out.print("\n");
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMIは" + bmiPerson + "です");
		System.out.println("年は" + this.age + "歳です");
	}
	
	// 人数を出力する
	public static void printCount() {
		System.out.println("\n合計" + Person.number + "人です");
	}
} 
