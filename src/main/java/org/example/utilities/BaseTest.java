package org.example.utilities;


import junit.framework.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxCommandContext;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Listeners;

@Listeners(ListenersImplementation.class)
public class BaseTest {

public static WebDriver driver;
public static EdgeDriver edgeOptions;
public static ChromeOptions chromeOptions;
public static FirefoxOptions firefoxOptions;

public static final ReadProperty readProperty = ReadProperty.getInstance();
public static final String URL = readProperty.readProperties("Url");
public static final String testDataExcel = System.getProperty("user.dir") + readProperty.readProperties("");
//public static downloadFolder = System.getProperty("user.dir")+ "\\downloads\\";


}
