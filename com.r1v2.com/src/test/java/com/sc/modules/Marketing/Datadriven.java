package com.sc.modules.Marketing;

import java.io.FileInputStream;
import java.util.Properties;

public class Datadriven {

	public static Properties objectProperty() {
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\WorkSpace\\com.r1v2.com\\Testdata.properties");
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop;
	}
	
	}