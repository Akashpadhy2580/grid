package mypack;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test7
{
	@Test
    public void setupTest() throws Exception 
	{
        DesiredCapabilities dc1=new DesiredCapabilities();
        dc1.setCapability("browserName","chrome");
        RemoteWebDriver driver1=new RemoteWebDriver(new URL("http://localhost:5556/wd/hub"),
                dc1);
        driver1.get("https://en.wikipedia.org/wiki/Main_Page");
        driver1.quit();
        
        DesiredCapabilities dc2=new DesiredCapabilities();
        dc2.setCapability("browserName","firefox");
        RemoteWebDriver driver2=new RemoteWebDriver(new URL("http://localhost:5557/wd/hub"),
                dc2);
        driver2.get("https://en.wikipedia.org/wiki/Main_Page");
        driver2.quit();
    }
}
