package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {
	
	public static void main(String args[]) throws SQLException 
	{
		String host="localhost";
				String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "Sathya12@");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from demo where username='sadguna'");
		
		
			while(rs.next());
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://login.salesforce.com");
			driver.findElement(By.xpath("//*[id='username']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath("//*[id='password']")).sendKeys(rs.getString("password"));
	
	}
	}
	

}
;