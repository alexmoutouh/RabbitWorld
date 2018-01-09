package gameEngine;

public class Constants {
	private static int mapWidth = 20;
	private static int mapHeight = 20;
	private static int adultAge = 8;
	private static int minStarve = 5;
	private static int maxStarve = 10;
	private static int carrotLife = 10;
	private static int maxRespawnCarrot = 10;
	private static String pathTileset1 = "./RW_Tileset.png";
	private static String pathTileset2 = "./RW_Charset.png";

	public static int getMapWidth() {
		return mapWidth;
	}

	public static int getMapHeight() {
		return mapHeight;
	}

	public static int getAdultAge() {
		return adultAge;
	}

	public static int getMinStarve() {
		return minStarve;
	}

	public static int getMaxStarve() {
		return maxStarve;
	}

	public static int getCarrotLife() {
		return carrotLife;
	}

	public static int getMaxRespawnCarrot() {
		return maxRespawnCarrot;
	}

	public static String getPathTileset1() {
		return pathTileset1;
	}

	public static String getPathTileset2() {
		return pathTileset2;
	}

	private Constants() {
	}
}
