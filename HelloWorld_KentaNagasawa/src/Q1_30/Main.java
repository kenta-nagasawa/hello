package Q1_30;

public class Main {
	public static void main(String[] args) {
		// Personクラスフィールドに("鈴木太郎", 20, 1.7, 60)を値として与える
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 一人目の名前、年齢、BMIを出力する
		person1.print();
		
		// 人数を出力する
		Person.printCount();
	}
}
