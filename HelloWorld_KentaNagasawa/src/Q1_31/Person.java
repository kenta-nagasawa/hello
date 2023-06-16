package Q1_31;

public class Person {
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age = 0;
	public double height = 0.0d;
	public double weight = 0.0d;
	public static int number = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, String lastName, int age, double height, double weight){

		// 受け取った値をそれぞれ代入する
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// カウントを1つ進める
		number++;
	}

	public String fullName() {
		return this.firstName + this.lastName;
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
		System.out.println("名前は" + this.firstName + this.lastName + "です");
		System.out.println("年は" + this.age + "歳です");
		System.out.println("BMIは" + bmiPerson + "です");
	}
	
	// 車のメソッドを作成する
	public void buy(Car car) {
		// 車の所有者の名前を登録する
		car.setOwner(this.firstName + this.lastName);
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// バイクのメソッドを作成する
	public void buy(Bicycle bicycle) {
		// バイクの所有者の名前を登録する
		bicycle.setOwner(this.firstName + this.lastName);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
	// 人数を出力する
	public static void printCount() {
		System.out.println("\n合計" + Person.number + "人です");
	}
} 

