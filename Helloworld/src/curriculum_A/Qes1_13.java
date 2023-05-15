package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		// Q1 下記9個をローカル変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		// 	・単精度浮動小数点数型・倍精度浮動小数点数型
		//   	・文字型・文字列型
		//	 	・ブーリアン型 

		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		String string1;
		boolean boolean1;

		// Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		byte1 = 0;
		short1 = 0;
		int1 = 0;
		long1 = 0L;
		float1 = 0.0f;
		double1 = 0.0d;
		char1 = '\u0000';
		string1 = null;
		boolean1 = false;

		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		byte1 = 10;
		// ・短整数型                 100
		short1 = 100;
		// ・整数型                	 1000
		int1 = 1000;
		// ・長整数型                 10000
		long1 = 10000L;
		// ・単精度浮動小数点数型   	 9.5
		float1 = 9.5f;
		// ・倍精度浮動小数点数型		 10.5
		double1 = 10.5d;
		// ・文字型                   a
		char1 = 'a';
		// ・文字列型              	 ハロー
		string1 = "ハロー";
		// ・ブーリアン型          	 true
		boolean1 = true;
		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		System.out.println(byte1 + short1 + int1 + long1);

		// 20.0
		System.out.println(float1 + double1);
		// a ハロー true
		System.out.println(char1 + string1 + boolean1);
		// 11130.0                    数字を全て足す
		System.out.println(byte1 + short1 + int1 + long1 + float1 + double1);
		// 10000000000                小数点以外の数字を全てかける
		System.out.println(byte1 * short1 * int1 * long1);
		// 0.105                      10.5割る100をする
		System.out.println(double1 / short1);
		// -90                        10引く100をする
		System.out.println(byte1 - short1);

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		int num = 20;
		int num1 = 23;

		System.out.println("ハローJAVA" + (num + num1));

		// Q6
		/*
		 * [概要]formatの通りコンソールに出力
		 * [詳細]ローカル変数に『山田太郎 18歳 170.5cm 62.2kg 寿司』を代入し○○に入れる
		 */

		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");

		//Q7
		/*
		 * [概要]自己紹介に続いてBMIを出力
		 * [詳細]6で作成した自己紹介に続いてBMIを出力させる（全て変数を使用する）
		 */
		double bmi = weight / ((height / 100) * (height * 100));
		//BMI値の出力
		System.out.println("BMIは" + bmi + "です");

		//Q8
		/*
		 * [概要]宣言した変数に再代入
		 * [詳細]6で宣言した変数に再代入しコンソールに出力させる
		 */
		String name1 = "鈴木一郎";
		int age1 = 24;
		double height1 = 168.5;
		double weight1 = 64.2;
		String food1 = "オムライス";
		double bmi1 = 22.6;

		//Q9
		/*
		 * [概要]数値を和算で事故代入しコンソールに出力
		 * [詳細]8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力させる
		 */

		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + age1 + "です");
		System.out.println("身長" + height1 + "cmです");
		System.out.println("体重は" + weight1 + "kgです");
		System.out.println("好きな食べ物は" + food1 + "です");
		System.out.println("BMIは" + bmi1 + "です");

		//Q10
		/*
		 * [概要]25歳以上ならtrueを出力させる
		 * [詳細]8で使用した年齢が25歳以上ならtrueが出力させる。ただしif文は使わない
		 */

		int yourAge = 24;
		boolean1 = (yourAge >= 25);
		System.out.println(boolean1);

		//			Q11
		/*
		 * [概要]文字列型に変換し繋げて出力
		 * [詳細]8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力させる
		 */
		String strage1 = String.valueOf(age1);
		System.out.println(strage1);
		String strheight1 = String.valueOf(height1);
		System.out.println(height1);
		String strweight1 = String.valueOf(weight1);
		System.out.println(weight1);
		System.out.println(strage1 + strheight1 + strweight1);

		//		     Q12
		/*
		 * [概要]整数型に変換して出力
		 * [詳細]11で変換した【年齢・身長】を整数型に変換して出力させる
		 */
		int intage = Integer.parseInt(strage1);
		System.out.println(intage);
		double intheight = Double.parseDouble(strheight1);
		System.out.println(intheight);

		//			Q13
		/*
		 * [概要]trueを出力
		 * [詳細]12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力させる。ただしif文は使わない
		 */
		System.out.println(intage > 25 || intheight > 160);

	}
}
