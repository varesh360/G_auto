package com.grants.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	String path = getPath();

	public String readApplicationFile(String key) {
		String value = "";
		try {
			Properties prop = new Properties();
			String dirPath = System.getProperty("user.dir");
			//System.out.println(("thet get " + dirPath));
			//File f = new File(dirPath + "//src//com//grants//config//application.properties");
			File f = new File(dirPath + "//src//test//java//com//grants//config//application.properties");
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
	
	public void writeProperty(String key, String data) {
		String dirPath = System.getProperty("user.dir");
        FileOutputStream fileOut = null;
        FileInputStream fileIn = null;
        try {
            Properties configProperty = new Properties();

            File file = new File(dirPath + "//src//test//java//com//grants//config//grants.properties");
            fileIn = new FileInputStream(file);
            configProperty.load(fileIn);
            configProperty.setProperty(key, data);
            fileOut = new FileOutputStream(file);
            configProperty.store(fileOut, "sample properties");
        } catch (Exception ex) {
          
        } finally {

            try {
                fileOut.close();
            } catch (IOException ex) {
              
            }
        }
    }

	public String readProperty(String key) {
		String value = "";
		try {
			Properties prop = new Properties();
			String dirPath = System.getProperty("user.dir");
			File f = new File(dirPath + "//src//test//java//com//grants//config//grants.properties");
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