/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int str1 = Integer.parseInt(str);

		System.out.print("ショコラ＞");
		String stra = reader.readLine();
		int str2 = Integer.parseInt(stra);

		System.out.print("ピスターシュ＞");

		String strb = reader.readLine();
		int str3 = Integer.parseInt(strb);

		System.out.println("シトロン　　" + str1 + "個");
		System.out.println("ショコラ　　" + str2 + "個");
		System.out.println("ピスターシュ　　" + str3 + "個");

		int sum = (str1 + str2 + str3);
		int price = (str1 * 250 + str2 * 280 + str3 * 320);
		System.out.println("合計個数は" + sum + "個");
		System.out.println("合計金額は" + price + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		int num01 = (30 - str1);
		int num02 = (30 - str2);
		int num03 = (30 - str3);

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("シトロン  　\\250・・・ 残り" + num01 + "個");
		System.out.println("ショコラ　　\\280・・・ 残り" + num02 + "個");
		System.out.println("ピスタージュ　　 \\320・・・ 残り" + num03 + "個");

	}

}
