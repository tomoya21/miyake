package curriculum_A;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Qes1_13 {

	public static void main(String[] args) {

		// Q1 

//		バイト型変数を宣言
		byte by;
//		短整数型を宣言
		short sh;
//		整数型を宣言
		int in;
//		長整数型を宣言
		long lo;
//		単精度浮動小数点数型を宣言
		float fl;
//		倍精度浮動小数点数を宣言
		double dou;
//		文字型を宣言
		char ch;
//		文字列型を宣言
		String st;
//		ブーリアン型を宣言
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
		System.out.println("『問4』");
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
		// 修正内容　1行目の文字列型を整数型に変更
		System.out.println("『問5』");
		int num = 20;
		int num1 = 23;

		System.out.println("ハローJAVA" + (num + num1 + "\n"));

		
		
		// Q6
		/*
		 * [概要]formatの通りコンソールに出力
		 * [詳細]ローカル変数に『山田太郎 18歳 170.5cm 62.2kg 寿司』を代入し○○に入れる
		 */
		System.out.println("『問6』");
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
		System.out.println("『問7』");
		int m = 100;
		double bmi = weight / ((height / m) * (height / m));
		// BMI値の出力
		BigDecimal bd = new BigDecimal(bmi);
		BigDecimal bdBmi = bd.setScale(1, RoundingMode.UP);
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bdBmi.doubleValue() + "です" + "\n");

		//Q8
		/*
		 * [概要]宣言した変数に再代入
		 * [詳細]6で宣言した変数に再代入しコンソールに出力させる
		 */
		System.out.println("『問8』");
		// 初めまして鈴木一郎です
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");
		// 年齢は24歳です	
		age = 24;
		System.out.println("年齢は" + age + "歳です");
		// 身長は168.5cmです	
		height = 168.5;
		System.out.println("身長" + height + "cmです");
		// 体重は64.2kgです
		weight = 64.2;
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物はオムライスです
		food = "オムライス";
		System.out.println("好きな食べ物は" + food + "です");
		// BMIは22.6です
		bmi = 22.6;
		System.out.println("BMIは" + bmi + "です" + "\n");
	

		//Q9
		/*
		 * [概要]数値を和算で自己代入しコンソールに出力
		 * [詳細]8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力させる
		 */
		System.out.println("『問9』");
		// 初めまして鈴木一郎です
		System.out.println("初めまして" + name + "です");
		// 年齢は48歳です
		age += 24;
		System.out.println("年齢は" + age + "歳です");
		// 身長337.0です
		height += 168.5;
		System.out.println("身長" + height + "cmです");
		// 体重は128.4kgです
		weight += 64.2;
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + food + "です");
		// BMIは11.31です
		bmi = weight / ((height / m) * (height / m));
		System.out.println("BMIは" + Math.ceil(bmi * 100) /100 + "です" + "\n");

		//Q10
		/*
		 * [概要]25歳以上ならtrueを出力させる
		 * [詳細]8で使用した年齢が25歳以上ならtrueが出力させる。ただしif文は使わない
		 */
		System.out.println("『問10』");
		age = 24;
		height = 168.5;
		weight = 64.2;
		bo = (age >= 25);
		System.out.println(bo);
		System.out.println("\n");

		//Q11
		/*
		 * [概要]文字列型に変換し繋げて出力
		 * [詳細]8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力させる
		 */
		System.out.println("『問11』");
		// 整数型の年齢を文字列型に変換
		String strAge = String.valueOf(age);
		System.out.println(strAge);
		// 倍精度浮動小数点数型の身長を文字列型に変換
		String strHeight = String.valueOf(height);
		System.out.println(strHeight);
		// 倍精度浮動小数点数型の体重を文字列型に変換
		String strWeight = String.valueOf(weight);
		System.out.println(weight);
		// 上記3つを常げて出力
		System.out.println(strAge + strHeight + strWeight + "\n");

		//Q12
		/*
		 * [概要]整数型に変換して出力
		 * [詳細]11で変換した【年齢・身長】を整数型に変換して出力させる
		 */
		System.out.println("『問12』");
		// 文字列型を整数型に変換
		int intAge = Integer.parseInt(strAge);
		System.out.println(intAge);
		// 倍精度浮動小数点数型を
		int intHeight = (int)Double.parseDouble(strHeight);
		System.out.println(intHeight + "\n");
		

		//Q13
		/*
		 * [概要]trueを出力
		 * [詳細]12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力させる。ただしif文は使わない
		 */
		System.out.println("『問13』");
		System.out.println(intAge == 25 || intHeight >= 160);

	}
}
