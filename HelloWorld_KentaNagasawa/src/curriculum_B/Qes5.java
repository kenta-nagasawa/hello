package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("課題5");
//		左側を基準に、右側の数字を01～09までループし、終わったら左側の数字を01進める条件式
		for(int ma=1;ma<=9;ma++) {
				for(int ne=1;ne<=14;ne++) {
					if(ne<=9) {
				
//				計算式を出力し、フォーマットを0を埋め込む形式にする
				System.out.println(String.format("%02d",ne)+"*"+String.format("%02d",ma)+"="+String.format("%03d",ne*ma));
					}else {
//						計算式を出力し、フォーマットを0を埋め込む形式にする
						System.out.println(String.format("%03d",ne)+"*"+String.format("%02d",ma)+"="+String.format("%03d",ne*ma));
					}
		}
}

	}

}
