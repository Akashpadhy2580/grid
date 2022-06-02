package mypack;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 
{
	public static void main(String[] args) throws Exception
	{
		URL u1=new URL("http://192.168.0.35:5556/wd/hub"); //node1 url
		DesiredCapabilities dc1=new DesiredCapabilities();
        dc1.setCapability("browserName","chrome");
		RemoteWebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get("http://www.google.co.in");
		driver1.close();
		
		URL u2=new URL("http://192.168.0.35:5557/wd/hub"); //node2 url
		DesiredCapabilities dc2= new DesiredCapabilities();
        dc2.setCapability("browserName","firefox");
		RemoteWebDriver driver2=new RemoteWebDriver(u2,dc2);
		driver2.get("http://www.google.co.in");
		driver2.close();

		URL u3=new URL("http://192.168.0.35:5558/wd/hub"); //node3 url
		DesiredCapabilities dc3=new DesiredCapabilities();
        dc3.setCapability("browserName","operablink");
		RemoteWebDriver driver3=new RemoteWebDriver(u3,dc3);
		driver3.get("http://www.google.co.in");
		driver3.quit();

		URL u4=new URL("http://192.168.0.35:5559/wd/hub"); //node4 url
		DesiredCapabilities dc4=new DesiredCapabilities();
        dc4.setCapability("browserName","MicrosoftEdge");
		RemoteWebDriver driver4=new RemoteWebDriver(u4,dc4);
		driver4.get("http://www.google.co.in");
		driver4.quit();
	}
}
