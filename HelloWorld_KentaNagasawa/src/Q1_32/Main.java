package Q1_32;

class Main{
	public static void main(String[] argos){
		// 1人目の情報を入力する
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// 1人目の情報を出力する
		person1.print();
		
		// 2人目の情報を入力する
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// 2人目の情報を出力する
		person2.print();
		
		// 合計人数を出力する
		Person.printCount();
	}
}