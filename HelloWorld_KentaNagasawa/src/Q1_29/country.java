/*

 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください

   	例:
   	8,5,9,.....
   	と入力された場合（昇順）

   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */

package Q1_29;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import Q1_29Sub.info;

public class country extends info{
	country() {
		System.out.print("1～10の数字を入力してください：");
		
		// 入力内容を読み取る
		Scanner sca = new Scanner(System.in);
		
		// 入力内容を文字列にし、","で一区切りとする
		String num = sca.nextLine();
		String[] countryNum = num.split(",");
		
		// 入力された数字を1～10の順に並ぶようにする
		int[] countryLen = new int[countryNum.length];
		
		// 正しく入力された数
		int trueNum = 0;
		
		// 入力された数
		int times = 0;
		
		// 入力がなかった場合
		if(Objects.isNull(num) || num.isEmpty()) {
			System.out.println("NULL");
			return;
			
		// 入力があった場合
		} else {
			
			// 入力された文字列をひとつづつ処理する
			for(String text: countryNum) {
				
				// 値が整数でない場合,0～2ではない場合
				if(!text.matches("-?\\d+")) {
					
					// -1を格納する
					countryLen[times] = -1;
					
				// 整数の場合
				} else {
					
					// 文字列型から整数型に変換する
					int coNum = Integer.parseInt(text);
					
					// 0～10が入力された場合、配列に数字を格納する
					if(coNum <= 10 && coNum >= 0 ) {
						countryLen[times] = coNum;
						
						// 正しく入力された回数を1回増やす
						trueNum++;
						
					// 0～10以外の数字が入力されたとき	
					} else {
						
						// -1を格納する
						countryLen[times] = -1;
					}
				}
				times++;
			}
			
			// 入力ミス回数のを出力する
			System.out.println("入力miss" + (times - trueNum) + "回\n");
			
			// 配列をソートし、並び順を調整する。
			Arrays.sort(countryLen);
			
			// 正しく入力された配列のみ出力する
			for(int numSort = 0 + countryNum.length - trueNum; numSort <= countryNum.length - 1; numSort++) {
				System.out.print(countryLen[numSort]);
				
			    // スーパークラスのkindsメソッドを呼び出す。
			    super.kinds(countryLen[numSort]);
			}
		}
	}
	
	public static void main(String[] args) {
		// countryクラスを呼び出す
		country country = new country();
	}
}
