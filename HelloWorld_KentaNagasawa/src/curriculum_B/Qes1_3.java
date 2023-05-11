package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		System.out.println("課題1");
//		st＝ログインユーザー名
		Scanner st1 = new Scanner(System.in);
		System.out.print("ユーザー名 > ");
		String st = st1.next();
		System.out.println(st);;
//		入力された文字数を確認する
		int num = st.length();
//     条件式を作る
		if(num > 10 ) {
//		条件式がnum >= 10がtrueの時に実行される処理
			System.out.println("「名前を10文字以内にしてください」");
			
		}else {
//			条件式num == 0がtrueの時に実行される処理
			if(num == 0 ) {
				System.out.println("「名前を入力してください」");
//				上記の条件式に当てはまらないときに実行される処理
			}else {
				System.out.println("ユーザー名「"+ st +"」を登録しました");
			}
			
		}
		
		
		System.out.println("課題2");
//		半角英数字のみ
//		st＝ログインユーザー名
		String alpha ="^[0-9a-zA-Z]+$";
//     半角英数字でない場合に実行される処理
		if(st.matches(alpha) == false) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		}else {
//		半角英数字の場合の時に実行される処理
			if(st.matches(alpha) == true) {
		}
		if(num > 10 ) {
//		条件式がnum >= 10がtrueの時に実行される処理
			System.out.println("「名前を10文字以内にしてください」");
			
		}else {
//			条件式num == 0がtrueの時に実行される処理
			if(num == 0 ) {
				System.out.println("「名前を入力してください」");
//				上記の条件式に当てはまらないときに実行される処理
			}else {
				System.out.println("ユーザー名「"+ st +"」を登録しました");
			}
			}
		}
	
		
		
		System.out.println("課題3");
//	   st＝ユーザー名
//	     半角英数字でない場合に実行される処理
			if(st.matches(alpha) == false) {
				System.out.println("「半角英数字のみで名前を入力してください」");
			}else {
//			半角英数字の場合の時に実行される処理
				if(st.matches(alpha) == true) {
			}
			if(num > 10 ) {
//			条件式がnum >= 10がtrueの時に実行される処理
				System.out.println("「名前を10文字以内にしてください」");
				
			}else {
//				条件式num == 0がtrueの時に実行される処理
				if(num == 0 ) {
					System.out.println("「名前を入力してください」");
//					上記の条件式に当てはまらないときに実行される処理
				}else {
					System.out.println("ユーザー名「"+ st +"」を登録しました");
//					じゃんけんでnameが勝つまで実行される処理
					String myT;
					String enemy;
//				myをnameの手とする
				for(int i =0;;i++) {
//		      相手の手
					int cpu = Integer.valueOf(new Random().nextInt(3));
//					nameの手
				    Scanner my1 = new Scanner(System.in);
				    System.out.println("じゃんけん：0はグー、1：チョキ、2：パー");
					System.out.print("入力してください > ");
					int my = my1.nextInt();
					System.out.println(my);
//					nameがグーを出したときに実行される処理
					if(my == 0) {
						 myT = "「グー」";
//						nameがチョキを出したときに実行される処理
					}else {
						if(my == 1) {
							myT = "「チョキ」";
//							nameがパーを出したときに実行される処理
						}else {
							myT = "「パー」";
						}
						
					}
					if(cpu == 0) {
						 enemy = "「グー」";
//						nameがチョキを出したときに実行される処理
					}else {
						if(cpu == 1) {
							enemy = "「チョキ」";
//							nameがパーを出したときに実行される処理
						}else {
							enemy = "「パー」";
						}
						
					}
//					お互いの手を出力
					System.out.println(st + "の手は"+myT);
					System.out.println("相手の手は"+enemy);
//					nameが勝ったときのに実行される処理
					if((my==0 && cpu==1)||(my==1 && cpu==2)||(my==2 && cpu==2)) {
						System.out.println("やるやん。");
						System.out.println("次は俺にリベンジさせて");
						System.out.println("勝つまでにかかった合計回数は"+ i + "回です");
						break;
					}else {
//						nameがグーで負けた場合
						if(my==1 && cpu==0) {
							System.out.println("俺の勝ち！");
							System.out.println("負けは次につながるチャンスです！");
							System.out.println("ネバーギブアップ！");
						}else {
//							nameがチョキで負けた場合
							if(my==2 && cpu==1) {
								System.out.println("俺の勝ち！");
								System.out.println("たかがじゃんけん、そう思ってないですか？");
								System.out.println("それやったら次も、俺が勝ちますよ");
							}else {
//								nameがパーで負けた場合
								if(my==0 && cpu==2) {
									System.out.println("俺の勝ち！");
									System.out.println("なんで負けたか、明日まで考えといてください。");
									System.out.println("そしたら何かが見えてくるはずです");
								}else {
//									あいこの場合
									System.out.println("DRAW あいこ もう一回しましょう！");
								}
							}
						}
					}
					
				}
				}
			  }
			}
		

		
			System.out.println("課題4");
//			左側を基準に、右側の数字を01～09までループし、終わったら左側の数字を01進める条件式
			for(int n=1;n<=9;n++) {
				for(int m=1;m<=9;m++) {
//					計算式を出力し、フォーマットを0を埋め込む形式にする
					System.out.println(String.format("%02d",n)+"*"+String.format("%02d",m)+"="+String.format("%02d",n*m));
					
				}
				
			}
			System.out.println("課題5");
//			左側を基準に、右側の数字を01～09までループし、終わったら左側の数字を01進める条件式
			for(int m=1;m<=9;m++) {
					for(int n=1;n<=14;n++) {
						if(n<=9) {
					
//					計算式を出力し、フォーマットを0を埋め込む形式にする
					System.out.println(String.format("%02d",n)+"*"+String.format("%02d",m)+"="+String.format("%03d",n*m));
						}else {
							System.out.println(String.format("%03d",n)+"*"+String.format("%02d",m)+"="+String.format("%03d",n*m));
						}
			}
	}
			System.out.println("課題6");
//			変数を宣言し、値を設定する
			String text = "の残りの台数は";
			String text2 = "台です";
//			for(){}内の処理を繰り返させる
			for(int p = 0;;p++) {
//				入力文字を読み取る
				Scanner sc = new Scanner(System.in);
				System.out.print("商品を入力 > ");
				String next = sc.next();
//				、を区切りと指定する。
				sc.useDelimiter("、");
				
				
				switch (next){
				  case "パソコン":
				    // 入力がパソコンときに実行される処理
					  int pc = Integer.valueOf(new Random().nextInt(11));
					  System.out.println(next+text+pc+text2);
						break;
				  case "冷蔵庫":
				    // 入力が冷蔵庫のときに実行される処理
				      int re = Integer.valueOf(new Random().nextInt(11));
				      System.out.println(next+text+re+text2);
				      break;
				  case "扇風機":
					  int ok = Integer.valueOf(new Random().nextInt(11));
					  System.out.println(next+text+ok+text2);
					  break;
				  case "洗濯機":
					  int se = Integer.valueOf(new Random().nextInt(11));
					  System.out.println(next+text+se+text2);
					  break;
				  case "加湿器":
					  int ka = Integer.valueOf(new Random().nextInt(11));
					  System.out.println(next+text+ka+text2);
					  break;
				  case  "テレビ","ディスプレイ" :
					  
				      int tv = Integer.valueOf(new Random().nextInt(11));
				      System.out.println(next+text+tv+text2);
				  break;
				  default :
					  System.out.println("『 その他商品 』は指定の商品ではありません");
						
				}
				
				
			

			}
	}
    
}