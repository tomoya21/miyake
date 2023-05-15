package lesson1_4;

public class Curriculum_New_1_4 {

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
	     System.out.println(byte1 + short1 + int1 +long1 + float1 + double1);
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
 		 
 		
     	