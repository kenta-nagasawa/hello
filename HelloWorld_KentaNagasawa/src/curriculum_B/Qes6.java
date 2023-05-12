package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("課題6");
//		変数を宣言し、値を設定する
		String text = "の残りの台数は";
		String text2 = "台です";
//		for(){}内の処理を繰り返させる
		
		for(int px = 0;;px++) {
//			入力された文字を読み取る

			System.out.println("商品を入力してください＞");
			Scanner sca = new Scanner(System.in);
		    String str = sca.nextLine();
//			、を区切りと指定する。
		    String[] st = str.split("、");
//		    拡張for文で入力された値すべてを実行する処理
			for(String ne: st) {
			switch (ne){
			  case "パソコン":
			    // 入力がパソコンときに実行される処理
				  int pc = Integer.valueOf(new Random().nextInt(11));
				  System.out.println(ne+text+pc+text2);
					break;
			  case "冷蔵庫":
			    // 入力が冷蔵庫のときに実行される処理
			      int re = Integer.valueOf(new Random().nextInt(11));
			      System.out.println(ne+text+re+text2);
			      break;
			      // 入力が冷蔵庫のときに実行される処理
			  case "扇風機":
				  int ok = Integer.valueOf(new Random().nextInt(11));
				  System.out.println(ne+text+ok+text2);
				  break;
				  // 入力が洗濯機のときに実行される処理
			  case "洗濯機":
				  int se = Integer.valueOf(new Random().nextInt(11));
				  System.out.println(ne+text+se+text2);
				  break;
				  // 入力が加湿器のときに実行される処理
			  case "加湿器":
				  int ka = Integer.valueOf(new Random().nextInt(11));
				  System.out.println(ne+text+ka+text2);
				  break;
				  // 入力がテレビまたはディスプレイのときに実行される処理
			  case  "テレビ","ディスプレイ" :
				  
			      int tv = Integer.valueOf(new Random().nextInt(11));
			      int dp = Integer.valueOf(new Random().nextInt(11));
			      // 入力がテレビ、ディスプレイの切り分けを行う処理
			      String result= ne =="テレビ"?ne+text+tv+text2:ne+text+dp+text2;
			      System.out.println(result);
			  break;
			  // 入力が条件に当てはまらなかったのときに実行される処理
			  default :
				  System.out.println("『"+ne+"』は指定の商品ではありません");
				  break;
			}
			
		
		}
			 }

		}

	}


