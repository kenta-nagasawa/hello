/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
 	
package curriculum1_23;

public class animal {

	public static void main(String[] args) {
		// 変数[Animals]を宣言し、クラス[info]を呼び出す		
		info Animals = new info();
		
		// [Animals]を使って、クラス[info]にある[setAnima]にライオンを格納
		Animals.setAnimal("ライオン");
		
		// [Animals]を使って、クラス[info]にある[setSize]に2.1dを格納
		Animals.setSize(2.1d);
		
		// [Animals]を使って、クラス[info]にある[setSpeed]に80を格納
		Animals.setSpeed(80);
		
		// 格納された、動物名、体長、速度をコンソールに出力する
		System.out.println("動物名：" + Animals.getAnimal() + 
				           "\n体長：" + Animals.getSize() + "m" +
				           "\n速度：" + Animals.getSpeed() + "km/h");
	}
}
