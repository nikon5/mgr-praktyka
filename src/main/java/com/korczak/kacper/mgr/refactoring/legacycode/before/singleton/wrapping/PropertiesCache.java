package com.korczak.kacper.mgr.refactoring.legacycode.before.singleton.wrapping;

public class PropertiesCache {

	private static PropertiesCache instance = new PropertiesCache();

	private PropertiesCache() {

	}

	public static PropertiesCache getInstance() {
		return instance;
	}

}
