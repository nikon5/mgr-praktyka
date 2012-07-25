package com.korczak.kacper.mgr.refactoring.legacycode.after.singleton.wrapping;

public class PropertiesCacheWrapper{

	public PropertiesCacheWrapper() {

	}

	public PropertiesCache getInstance() {
		return PropertiesCache.getInstance();
	}
}