package Ｑ1_33;

class Main{
	public static void main(String[] args){
		// 一人目の情報を入力する
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// 一人目の情報を出力する
		person1.print();
		
		// 二人目の情報を入力する
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// 二人目の情報を出力する
		person2.print();
		
		// 人数メソッドを呼び出す
		Person.printCount();
	}
}
