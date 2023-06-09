/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package curriculum1_23;

public class info {
	
	// 変数をすべてprivateで宣言する
	// 動物名の変数[animal]を宣言する
	private String animal;
	
	// 体長の変数[size]を宣言する
	private double size;
	
	// 速度の変数[speed]を宣言する
	private int speed;
	
	// 動物名を格納するメソッド
	public void setAnimal(String animal_name) {
		this.animal = animal_name;
	}
	
	// 動物名を取得するメソッド
	public String getAnimal() {
		return this.animal;
	}
	
	// 体長を格納するメソッド
	public void setSize(double size_m) {
		this.size = size_m;
	}
	
	// 体長を取得するメソッド
	public double getSize() {
		return this.size;
	}
	
	// 速度を格納するメソッド
	public void setSpeed(int speed_km) {
		this.speed = speed_km;
	}
	
	// 速度を取得するメソッド
	public int getSpeed() {
		return this.speed;
	}
}
