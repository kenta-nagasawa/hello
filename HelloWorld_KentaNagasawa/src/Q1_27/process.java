/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
  
  */
package Q1_27;

public class process {
	// 動物の名前のフィールド
	private String kinds;
	// 大きさのフィールド
	private double size;
	// 速さのフィールド
	private int speed;
	
	process(String kinds, String size, String speed) {
		// それぞれのフィールドに代入する
		this.kinds = kinds;
		this.size = Double.parseDouble(size);
		this.speed = Integer.parseInt(speed);
	}
	
	public String switchName() {
		// 動物の種類で場合分けを行う
		String result = "";
		switch(this.kinds) {
		    // ライオンの場合
			case "ライオン":
				// 条件に合致した場合、結果が"パンテラ レオ"になる
				result = this.size == 2.1d && this.speed == 80 ? "パンテラ レオ" : "不明" ;
				break;
				
			// ゾウの場合	
			case "ゾウ":
				// 条件に合致した場合、 結果が"ロキソドンタ・サイクロティス"になる
				result = this.size == 3.2d && this.speed == 40 ? "ロキソドンタ・サイクロティス" : "不明" ;
				break;
			
			// パンダの場合
			case "パンダ":
				// 条件に合致した場合、 結果が"アイルロポダ・メラノレウカ"になる
				result = this.size == 1.9d && this.speed == 30 ? "アイルロポダ・メラノレウカ" : "不明" ;
				break;
			
			// チンパンジーの場合
			case "チンパンジー":
				// 条件に合致した場合、結果が"パン・トゥログロディテス"になる
				result = this.size == 0.94d && this.speed == 25 ? "パン・トゥログロディテス" : "不明" ;
				break;
				
			// シマウマの場合
			case "シマウマ":
				// 条件に合致した場合、結果が"チャップマンシマウマ"になる
				result = this.size == 2.4d && this.speed == 65 ? "チャップマンシマウマ" : "不明" ;
				break;
				
			// インコの場合	
			case "インコ":
				// 条件不明のため、結果が不明
				result = "不明" ;
				break;	
		}	
		return result;
	}
	
	// コンソールに出力する
	public void print() {
		System.out.print("動物名：" + this.kinds + "\n体長：" + this.size + "m\n速度：" + this.speed + "km/h" + "\n学名：" + this.switchName());
	}
}
