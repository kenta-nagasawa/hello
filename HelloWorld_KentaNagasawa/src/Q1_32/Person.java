package Q1_32;

class Person{
	// 名前のフィールド
	public String name;
	// 年齢のフィールド
	public int age;
	// 身長のフィールド
	public double height;
	// 体重のフィールド
	public double weight;
	// 人数のフィールド
	private static int count = 0;

	Person(String name, int age, double height, double weight){
		// それぞれのフィールドに値を代入する
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 人数を一人増やす
		Person.count++;
	}
	
	// BMIを計算するメソッド
	public double bmi(){
		// BMIを計算する
		return this.weight / this.height / this.height;
	}
	
	// コンソールに出力するメソッド
	public void print(){
		// BMIを呼び出し、小数点を切り捨てる
		double bmiPerson = Math.floor(this.bmi());
		
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmiPerson + "です");
		System.out.print("\n");
	}
	
	// 合計人数を出力するメソッド
	public static void printCount() {
		// 合計人数を出力する
		System.out.println("合計" + Person.count + "人です");
	}
}
