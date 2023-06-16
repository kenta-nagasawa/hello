package Ｑ1_33;

class Person{
	// 人数をカウントするフィールド
	public static int count = 0;
	// 名字をのフィールド
	public String firstName;
	// 年齢のフィールド
	public int age;
	// 身長、体重のフィールド
	public double height, weight;
	// 名前のフィールド
	public String lastName;

	Person(String firstName, String lastName, int age, double height, double weight){
		// 人数を1人増やす
		Person.count++;
		// 受け取った値をそれぞれのフィールドに代入する
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.lastName = lastName;
	}
	
	// フルネームの値を返すメソッド
	public String fullName(){
		// 名字、名前を返す
		return this.firstName + this.lastName;
	}
	
	// コンソールに出力するメソッド
	public void print(){
		
		// BMIを呼び出し、小数点を切り捨てる
		double bmiPerson = Math.floor(this.bmi());
		
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + bmiPerson + "です");
		System.out.print("\n");
	}
	
	// BMIを返すメソッド
	public double bmi(){
		// BMIを計算する
		return this.weight / this.height / this.height;
	}
	
	// 人数を出力するメソッド
	public static void printCount(){
		// 人数をコンソールに出力する
		System.out.println("合計" + Person.count + "人です");
	}
}
