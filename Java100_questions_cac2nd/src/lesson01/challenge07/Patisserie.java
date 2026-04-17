/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int num1 = 30;
		int num2 = 30;
		int num3 = 30;
		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("シトロン  　\\250・・・ 残り" + num1 + "個");
		System.out.println("ショコラ　　\\280・・・ 残り" + num2 + "個");
		System.out.println("ピスタージュ　　 \\320・・・ 残り" + num3 + "個");
		System.out.println("それぞれ何個ずつ買いますか？（最大３０個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("シトロン＞");

		String str = reader.readLine();
		double str1 = Double.parseDouble(str);

		System.out.print("ショコラ＞");
		String stra = reader.readLine();
		double str2 = Double.parseDouble(stra);

		System.out.print("ピスターシュ＞");

		String strb = reader.readLine();
		double str3 = Double.parseDouble(strb);

		System.out.println("シトロン　　" + str1 + "個");
		System.out.println("ショコラ　　" + str2 + "個");
		System.out.println("ピスターシュ　　" + str3 + "個");

		double sum = (str1 + str2 + str3);
		double price = (str1 * 250 + str2 * 280 + str3 * 320);
		System.out.println("合計個数は" + sum + "個");
		System.out.println("合計金額は" + price + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		int num01 = (int) (30 - str1);
		int num02 = (int) (30 - str2);
		int num03 = (int) (30 - str3);

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("シトロン  　\\250・・・ 残り" + num01 + "個");
		System.out.println("ショコラ　　\\280・・・ 残り" + num02 + "個");
		System.out.println("ピスタージュ　　 \\320・・・ 残り" + num03 + "個");

	}
}
