package com.grants.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyHelper {

	public void writeProperty(String propertyName, String proprtyValue) {
		Properties prop = new Properties();
		String dirPath = System.getProperty("user.dir");
		OutputStream output = null;

		try {

			output = new FileOutputStream(dirPath + "//src/test/java/com/grants/config//grants.properties");

			// set the properties value
			prop.setProperty(propertyName, proprtyValue);
			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	String path = getPath();

	public String readProperty(String key) {
		String value = "";
		try {
			Properties prop = new Properties();
			String dirPath = System.getProperty("user.dir");
			//System.out.println(("thet get " + dirPath));
			//File f = new File(dirPath + "//src//com//grants//config//application.properties");
			File f = new File(dirPath + "//src//test//java//com//grants//config//grants.properties");
			//System.out.println(("thet get " + f));
			if (f.exists()) {
				prop.load(new FileInputStream(f));
				value = prop.getProperty(key);
			}
		} catch (Exception e) {
			System.out.println("Failed to read from application.properties file.");
		}
		return value;
	}

	public String getPath() {
		String path = "";
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");
		return path;
	}

}
