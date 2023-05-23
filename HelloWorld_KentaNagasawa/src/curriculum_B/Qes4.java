package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		System.out.println("課題4");
		// 左側を基準に、右側の数字を01～09までループし、終わったら左側の数字を01進める条件式
		for(int ne = 1 ;ne <= 9 ; ne ++) {
			// 改行をする
			System.out.println("\n");
			for(int ma = 1 ; ma <= 9 ; ma ++) {
				// 計算式を出力し、フォーマットを0を埋め込む形式にする
				if(ma <= 8) {
				System.out.print(String.format("%02d", ne) +
                                  " * " + String.format("%02d", ma) + 
                                  " = " + String.format("%02d", ne * ma) + " || ");
				// 条件がfalseの時に実行される処理
				}else {
					System.out.print(String.format("%02d",ne) +
                                     " * " + String.format("%02d", ma ) + 
                                     " = " + String.format("%02d", ne * ma));
				}
					
				
			}
		}
	}

}
