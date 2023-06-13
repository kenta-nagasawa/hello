package Q1_29Sub;

public class info {
public static void kinds(int number) {
		// 情報を配列の中に入れる
		String[] kind = {"北海道:札幌市:83424" , "青森県:青森市:9646" , "岩手県:盛岡市:15275" ,"宮城県:仙台市:7282",
				"秋田県:秋田市:11638" , "山形県:山形市:9323" , "福島県:福島市:13784" , "茨城県:水戸市:6097" ,
				"栃木県:宇都宮市:6408" , "群馬県:前橋市:6362", "埼玉県:さいたま市:3798"};
		
		// 配列を呼びだし、：ごとに区切り、新しい配列に入れる
		String[] text = kind[number].split(":");
		
		// 小数点を表示するように設定する。
		double size = Double.parseDouble(text[2]);
		
		// コンソールに出力する
		System.out.print("都道府県名：" + text[0] + "\n県庁所在地：" + text[1] + "\n面積：" + size + "km2");
		System.out.println("\n");
	}
}


