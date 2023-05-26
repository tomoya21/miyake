package curriculum_A;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Qes1_13 {

	public static void main(String[] args) {

		// Q1 

//		バイト型変数 by を宣言
		byte by;
//		短整数型 sh を宣言
		short sh;
//		整数型 in を宣言
		int in;
//		長整数型 lo を宣言
		long lo;
//		単精度浮動小数点数型 fl　を宣言
		float fl;
//		倍精度浮動小数点数型 do を宣言
		double dou;
//		文字型　ch　を宣言
		char ch;
//		文字列型　st　を宣言
		String st;
//		ブーリアン型 bo を宣言
		boolean bo;
		
		// Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
//		バイト型変数を初期化
		by = 0;
//		短整数型を初期化
		sh = 0;
//		整数型を初期化
		in = 0;
//		長整数型を初期化
		lo = 0L;
//		単精度浮動小数点型を初期化
		fl = 0.0f;
//		倍精度浮動小数点型を初期化
		dou = 0.0d;
//		文字型を初期化
		ch = '\u0000';
//		文字列型を初期化
		st = null;
//		ブーリアン型を初期化
		bo = false;

		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		by = 10;
		// ・短整数型                 100
		sh = 100;
		// ・整数型                	 1000
		in = 1000;
		// ・長整数型                 10000
		lo = 10000L;
		// ・単精度浮動小数点数型   	 9.5
		fl = 9.5f;
		// ・倍精度浮動小数点数型		 10.5
		dou = 10.5d;
		// ・文字型                   a
		ch = 'a';
		// ・文字列型              	 ハロー
		st = "ハロー";
		// ・ブーリアン型          	 true
		bo = true;
		
		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		System.out.println(by + sh + in + lo);
		// 20.0
		System.out.println(fl + dou);
		// a ハロー true
		System.out.println(ch + " " + st + " " + bo);
		// 11130.0                    数字を全て足す
		System.out.println(by + sh + in + lo + fl + dou);
		// 10000000000                小数点以外の数字を全てかける
		System.out.println(by * sh * in * lo);
		// 0.105                      10.5割る100をする
		System.out.println(dou / sh);
		// -90                        10引く100をする
		System.out.println(by - sh + "\n");
		

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		//修正内容　1行目のStringをintに変更
		int num = 20;
		int num1 = 23;

		System.out.println("ハローJAVA" + (num + num1 + "\n"));

		
		
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
		System.out.println("好きな食べ物は" + food + "です" + "\n");

		//Q7
		/*
		 * [概要]自己紹介に続いてBMIを出力
		 * [詳細]6で作成した自己紹介に続いてBMIを出力させる（全て変数を使用する）
		 */
		int m = 100;
		double bmi = weight / ((height / m) * (height / m));
		//BMI値の出力
		BigDecimal bd = new BigDecimal(bmi);
		BigDecimal bdBmi = bd.setScale(1, RoundingMode.UP);
		System.out.println(bdBmi.doubleValue() +"\n");

		//Q8
		/*
		 * [概要]宣言した変数に再代入
		 * [詳細]6で宣言した変数に再代入しコンソールに出力させる
		 */
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = 22.6;
		System.out.println("\n");

		//Q9
		/*
		 * [概要]数値を和算で自己代入しコンソールに出力
		 * [詳細]8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力させる
		 */

//		name = 鈴木一郎
		System.out.println("初めまして" + name + "です");
//		age = 24
		System.out.println("年齢は" + age + age + "です");
//		height = 168.5
		System.out.println("身長" + height + height + "cmです");
//		weight = 64.2
		System.out.println("体重は" + weight + weight + "kgです");
//		food = オムライス
		System.out.println("好きな食べ物は" + food + "です");
//		bmi= 22.6
		System.out.println("BMIは" + bmi + "です" + "\n");

		//Q10
		/*
		 * [概要]25歳以上ならtrueを出力させる
		 * [詳細]8で使用した年齢が25歳以上ならtrueが出力させる。ただしif文は使わない
		 */

		int yourAge = 24;
		bo = (yourAge >= 25);
		System.out.println(bo);
		System.out.println("\n");

		//			Q11
		/*
		 * [概要]文字列型に変換し繋げて出力
		 * [詳細]8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力させる
		 */
//		age = 24
		String strAge = String.valueOf(age);
		System.out.println(strAge);
		String strHeight = String.valueOf(height);
		System.out.println(strHeight);
		String strWeight = String.valueOf(weight);
		System.out.println(weight);
		System.out.println(strAge + strHeight + strWeight + "\n");

		//		     Q12
		/*
		 * [概要]整数型に変換して出力
		 * [詳細]11で変換した【年齢・身長】を整数型に変換して出力させる
		 */
		int intAge = Integer.parseInt(strAge);
		System.out.println(intAge);
		int intHeight = (int)height;
		System.out.println(intHeight + "\n");
		

		//			Q13
		/*
		 * [概要]trueを出力
		 * [詳細]12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力させる。ただしif文は使わない
		 */
		System.out.println(intAge == 25 || intHeight >= 160);

	}
}
