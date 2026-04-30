
package lesson08.challenge10;

class Robot {
	private int energy;
	private String name;
	private int water;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param energy セットする energy
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void randomWater() {
		water = (int) (Math.random() * 10) % 9 + 1;
	}
	//	public void setWater(int water) {
	//		this.water = water;
	//	}

	public void pumpWater() {
		//		setWater(water);

		System.out.println("水を" + water + "リットルだしました。");
	}

	public void makeOmlet(int eggNum, int butterNum) {
		int egg = (int) eggNum / 2;
		int butter = (int) butterNum / 5;
		if (egg >= butter) {
			System.out.println("オムレツを" + butter + "個作ります");
		} else {
			System.out.println("オムレツを" + egg + "個作ります");
		}

	}

	public int getWater() {
		return water;
	}

	public String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		String menu = null;
		if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			menu = "クッキー";
		} else if (eggNum >= 2 && butterNum >= 5) {
			menu = "オムレツ";
		} else if (eggNum >= 1) {
			menu = "ゆでたまご";
		} else {
			menu = null;
		}
		return menu;
	}

	//選択肢　　　1,肉　2,魚　3,野菜　4,小麦粉
	public String cooking(int num) {
		String menu2 = null;
		if (num == 1) {
			menu2 = "レアステーキ";
		} else if (num == 2) {
			menu2 = "焼き魚のソテー";
		} else if (num == 3) {
			menu2 = "八宝菜";
		} else if (num == 4) {
			menu2 = "マルゲリータ";
		} else {
			menu2 = null;
		}
		return menu2;
	}

}
