/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		int pr1 = (int) str1 * 250;
		int pr2 = (int) str2 * 280;
		int pr3 = (int) str3 * 320;

		int num01 = (int) (30 - str1);
		int num02 = (int) (30 - str2);
		int num03 = (int) (30 - str3);

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("シトロン  　\\250・・・ 残り" + num01 + "個");
		System.out.println("ショコラ　　\\280・・・ 残り" + num02 + "個");
		System.out.println("ピスタージュ　　 \\320・・・ 残り" + num03 + "個");
		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしております。");
		System.out.println("売り上げの割合\n売上合計　\\" + (int) price);
		System.out.println("内訳");
		System.out.println("シトロン　\\" + pr1 + "・・・" + (int) (pr1 * 100 / price) + "%");
		System.out.println("シトロン　\\" + pr2 + "・・・" + (int) (pr2 * 100 / price) + "%");
		System.out.println("シトロン　\\" + pr3 + "・・・" + (int) (pr3 * 100 / price) + "%");

		System.out.println("明日の三色マカロンの配合率が決まりました！");

		System.out.println("シトロンの味    ・・・ " + (int) (pr1 * 100 / price) + "%");
		System.out.println("ショコラの味    ・・・ " + (int) (pr2 * 100 / price) + "%");
		System.out.println("ピスターシュの味    ・・・ " + (int) (pr1 * 100 / price) + "%");
		System.out.println("が楽しめます！");
		int pr4 = (int) (price / sum);

		System.out.println("値段は\\" + pr4 + "です。");
	}
}
