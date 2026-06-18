package dev.colbster937.eaglercraft;

import net.lax1dude.eaglercraft.EagRuntime;

public class EaglercraftVersion {
	public static final String STORAGE_KEY = "_dev_ghostpaint_eaglercraft_in-20100219_";
	public static final String EAGLER_VERSION = "";
	public static final String MINECRAFT_VERSION = "in-20100219";
	public static final String PROJECT_GITHUB = "https://github.com/JJminecraftguy/in-20100219";
	public static final String PROJECT_AUTHOR = "GhostPaint";
	public static final String PROJECT_BRAND = "ghostpaint";
	public static final String[] getTitleString() {
		return new String[] {
			"Eaglercraft " + EAGLER_VERSION + " [" + EagRuntime.getPlatformType() + "]",
			"Made by " + PROJECT_AUTHOR
		};
	}
}
