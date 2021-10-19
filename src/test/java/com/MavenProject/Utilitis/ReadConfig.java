package com.MavenProject.Utilitis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		try
		{
			FileInputStream file=new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());

		}
	}

	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getusername()
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	public String getpassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
}
