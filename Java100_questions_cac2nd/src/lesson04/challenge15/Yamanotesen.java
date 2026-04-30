package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Yamanotesen {
	public static void main(String[] args) throws IOException {

		System.out.println("山手線ゲームスタート！");

		List<String> stationList = new ArrayList<String>();
		stationList.add("東京");
		stationList.add("神田");
		stationList.add("秋葉原");
		stationList.add("御徒町");
		stationList.add("上野");
		stationList.add("鶯谷");
		stationList.add("日暮里");
		stationList.add("西日暮里");
		stationList.add("田端");
		stationList.add("駒込");
		stationList.add("巣鴨");
		stationList.add("大塚");
		stationList.add("池袋");
		stationList.add("目白");
		stationList.add("高田馬場");
		stationList.add("新大久保");
		stationList.add("新宿");
		stationList.add("代々木");
		stationList.add("原宿");
		stationList.add("渋谷");
		stationList.add("恵比寿");
		stationList.add("目黒");
		stationList.add("五反田");
		stationList.add("大崎");
		stationList.add("品川");
		stationList.add("高輪ゲートウェイ");
		stationList.add("田町");
		stationList.add("浜松町");
		stationList.add("新橋");
		stationList.add("有楽町");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Random random = new Random();

		while (true) {

			String str = reader.readLine();

			if (!stationList.contains(str)) {
				System.out.println("あなたの負けです！");
				break;
			}

			stationList.remove(str);

			if (stationList.isEmpty()) {
				System.out.println("あなたの勝ちです！");
				break;
			}

			String cpu = stationList.get(random.nextInt(stationList.size()));
			System.out.println(cpu);

			stationList.remove(cpu);

			if (stationList.isEmpty()) {
				System.out.println("あなたの勝ちです！");
				break;
			}
		}
	}
}
