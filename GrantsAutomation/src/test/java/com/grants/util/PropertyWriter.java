package com.grants.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyWriter {
	
	public void writeProperty()
	{
		Properties prop = new Properties();
		String dirPath = System.getProperty("user.dir");
		OutputStream output = null;

		try {

			output = new FileOutputStream(dirPath + "src/test/java/com/grants/config//test.properties"); 

			// set the properties value
			prop.setProperty("Name", "RAJ");
			prop.setProperty("Test", "Testdata");

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

}
