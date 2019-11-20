package co.com.qvision.eribank.utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MyDriver {

	private static final Logger logger = Logger.getLogger(MyDriver.class.getName());
	private static AppiumDriver<MobileElement> driver;
	static String envPlatform = "ANDROID";
	public static String plataforma = "ANDROID";
	
    public static AppiumDriver<MobileElement> abrirApp(){
	    	
		
    	String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
		 	try {	
                capabilities.setCapability("deviceName", "emulator-5554");
             // capabilities.setCapability("udid", "J7AXHM001253GB7"); -> Utilizada con el ID del dispositivo REAL - No con emulador
                capabilities.setCapability("platformVersion", "5.0");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
                capabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
                capabilities.setCapability("noReset", true);
	        		
                driver = new AppiumDriver<MobileElement>(new URL(url), capabilities);
	        	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	return driver;
            } catch (Exception e) {
                logger.log(Level.SEVERE, ExceptionMessages.EXCEPTION_NO_CREATE_DRIVER.getMensaje(), e);
                throw new MyBusinessException(ExceptionMessages.EXCEPTION_NO_CREATE_DRIVER.getMensaje(), e);
            }
    }

    public static AppiumDriver<MobileElement> getDriver(){
        return driver;
    }
    
    public static Logger getLogger(){
        return logger;
    }	
	
	
}