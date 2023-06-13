/*

	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください

		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24

		さあ冒険に出かけよう！
 */
package curriculum1_25;

public class status {
	// 名前の変数を宣言する
	private String user;

	// HPの変数を宣言する
	private int HP;

	// MPの変数を宣言する
	private int MP;

	// 攻撃力の変数を宣言する
	private int attack;

	// 素早さの変数を宣言する
	private int speed;

	// 防御力の変数を宣言する
	private int defense;

	// 名前を格納するメソッド
	public void setUser(String user_name) {
		this.user = user_name;
	}

	// 名前を取得するメソッド
	public String getUser() {
		return this.user;
	}

	// HPを格納するメソッド
	public void setHP(int HP_num) {
		this.HP = HP_num;
	}

	// HPを取得するメソッド
	public int getHP() {
		return this.HP;
	}

	// MPを格納するメソッド
	public void setMP(int MP_num) {
		this.MP = MP_num;
	}

	// MPを取得するメソッド
	public int getMP() {
		return this.MP;
	}

	// 攻撃力を格納するメソッド
	public void setAttack(int atk_num) {
		this.attack = atk_num;
	}

	// 攻撃力を取得するメソッド
	public int getAttack() {
		return this.attack;
	}

	// 素早さを格納するメソッド
	public void setSpeed(int spd_num) {
		this.speed = spd_num;
	}

	// 素早さを取得するメソッド
	public int getSpeed() {
		return this.speed;
	}

	// 防御力を格納するメソッド
	public void setDefense(int dfs_num) {
		this.defense = dfs_num;
	}

	// 防御力を取得するメソッド
	public int getDefense() {
		return this.defense;
	}
}


