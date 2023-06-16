package Q1_31;

public class Main {
	public static void main(String[] args) {
		// Personクラスフィールドに("鈴木太郎", 20, 1.7, 60)を値として与える
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// 一人目の名前、年齢、BMIを出力する
		person1.print();
		
		// Personクラスフィールドに("山田花子", 22, 1.5, 40)を値として与える
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// 二人目の名前、年齢、BMIを出力する
		person2.print();
		
		// 人数を出力する
		Person.printCount();
		
		// 車のクラスを呼び出す
		Car car = new Car();
		
		// バイクのクラスを呼び出す
		Bicycle bicycle = new Bicycle();
		System.out.print("\n");
		
		// 一人目を車の所有者として名前を登録する
		car.setOwner(person1.fullName());
		
		// 二人目をバイクの所有者として名前を登録する
		bicycle.setOwner(person2.fullName());
		
		// 車の所有者を出力する
		System.out.println(car.getOwner());
		
		// バイクの所有者を出力する
		System.out.println(bicycle.getOwner());
		System.out.print("\n");
		
		// 車の購入者を出力する
		person1.buy(car);
		
		// バイクの購入者を出力する
		person2.buy(bicycle);
	}
}
