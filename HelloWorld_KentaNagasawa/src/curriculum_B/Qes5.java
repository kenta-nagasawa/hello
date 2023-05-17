package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		System.out.println("課題5");
		// 左側を基準に、右側の数字を01～09までループし、終わったら左側の数字を01進める条件式
		for(int ma = 1 ; ma <= 9 ; ma ++) {
			// 改行をする
			System.out.println("\n");
			// for文を使用し、変数[ne]を1から20まで繰り返す処理
			for(int ne = 1 ; ne <= 20 ; ne ++) {
				// 変数[ne]が9以下の時
				if( ne <= 9) {
					// 計算式を出力し、フォーマットを0を埋め込む形式にする
					System.out.print(String.format("%02d",ne) +
							         "*" + String.format("%02d",ma) +
							         "=" + String.format("%03d",ne*ma) + "||");
				}else {
					// 変数[ne]が10以上19以下の時
					if(10 <= ne && ne <= 19) {
					// 計算式を出力し、フォーマットを0を埋め込む形式にする
					System.out.print(String.format("%03d",ne) +
							         "*" + String.format("%02d",ma) +
							         "=" + String.format("%03d",ne*ma) + "||");
					}else {
						// それ以外の時の出力用法
						System.out.print(String.format("%03d",ne) + 
								         "*" + String.format("%02d",ma) + 
								         "=" + String.format("%03d",ne*ma));
					
					}
				}
			}
		}

	}

}
