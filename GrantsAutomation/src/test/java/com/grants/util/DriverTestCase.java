package com.grants.util;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class DriverTestCase {

	protected static PropertyReader propertyReader= new PropertyReader();
    protected static PropertyHelper propertyHelper=new PropertyHelper();
	
	static WebDriver driver;

	enum DriverType {
		Firefox, IE, Chrome, Headless
	}

	// Get Values from property file
	protected String username = propertyReader.readApplicationFile("GrantorUser");
	protected String password = propertyReader.readApplicationFile("GrantorPassword");
	protected String TName=propertyReader.readApplicationFile("TemplateName");
	protected String OppNumber=propertyReader.readApplicationFile("OpportunityNumber");
	protected String OppTitle=propertyReader.readApplicationFile("OpportunityTitle");
	protected String OppCategory=propertyReader.readApplicationFile("OpportunityCategory");
	protected String OppExplanation=propertyReader.readApplicationFile("OpportunityCategoryExplanation");
	protected String OppCFDANumber=propertyReader.readApplicationFile("OpportunityCFDANumber");
	
	protected String CFDA=propertyReader.readApplicationFile("CFDANumber");
	protected String CompetitionID=propertyReader.readApplicationFile("CompetitionID");
	protected String CompetitionTitle=propertyReader.readApplicationFile("CompetitionTitle");
	protected String ElectronicRequired=propertyReader.readApplicationFile("ElectronicRequired");
	protected String NoOFApplications=propertyReader.readApplicationFile("ExpectedNumberofApplications");
	protected String ExpectedAppSize=propertyReader.readApplicationFile("ExpectedApplicationSize");
	protected String OpenDate=propertyReader.readApplicationFile("OpenDate");
	protected String CloseDate=propertyReader.readApplicationFile("CloseDate");
	protected String GracePeriod=propertyReader.readApplicationFile("GracePeriod");
	protected String AppInstructionsFilePath=propertyReader.readApplicationFile("ApplicationInstructions");
	protected String ApplicantType=propertyReader.readApplicationFile("ApplicantType");
		
	
	@BeforeTest
	public void initateBrowserAndOpenApplication() {
	
		String driverType = propertyReader.readApplicationFile("BROWSER");
		System.out.println("the browser type is:" + driverType);

		if (DriverType.Firefox.toString().equals(driverType)) {
			String strDriverPath = System.getProperty("user.dir") + "\\webdriverexe\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", strDriverPath);
			driver = new FirefoxDriver();

		} else if (DriverType.IE.toString().equals(driverType)) {

			String strDriverPath = System.getProperty("user.dir") + "\\webdriverexe\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", strDriverPath);
			driver = new InternetExplorerDriver();

		} else if (DriverType.Chrome.toString().equals(driverType)) {

			String strDriverPath = System.getProperty("user.dir") + "\\webdriverexe\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", strDriverPath);

			driver = new ChromeDriver();
		} else if (DriverType.Headless.toString().equals(driverType)) {

			driver = new HtmlUnitDriver(true);
		}

		else {
			driver = new FirefoxDriver();

		}

		// Launch the URL
		String url = propertyReader.readApplicationFile("WebURL");
		getWebDriver().navigate().to(url);

		// Maximize window
		driver.manage().window().setSize(new Dimension(1920, 1080));
		// getWebDriver().manage().window().maximize();
		//getWebDriver().manage().window().setSize(new Dimension(1920, 1080));
		// getWebDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Delete cookies
		getWebDriver().manage().deleteAllCookies();

		// Wait for page load
		//getWebDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public PropertyReader getProperty() {
		return propertyReader;
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	public By ByLocator(String locator) {
		By result = null;

		if (locator.startsWith("//")) {
			result = By.xpath(locator);
		} else if (locator.startsWith("css=")) {
			result = By.cssSelector(locator.replace("css=", ""));
		} else if (locator.startsWith("#")) {
			result = By.name(locator.replace("#", ""));

		} else if (locator.startsWith("link=")) {
			result = By.linkText(locator.replace("link=", ""));
		}

		else if (locator.startsWith("class=")) {
			result = By.className(locator.replace("class=", ""));
		} else if (locator.startsWith("name=")) {
			result = By.name(locator.replace("name=", ""));
		}

		else if (locator.startsWith("id=")) {
			result = By.id(locator.replace("id=", ""));
		} else if (locator.startsWith("(")) {
			result = By.xpath(locator);
		} else {
			result = By.id(locator);
		}

		return result;
	}

	public Boolean isElementPresent(String locator) {
		Boolean result = false;
		try {
			getWebDriver().findElement(ByLocator(locator));
			result = true;
		} catch (Exception ex) {

		}

		return result;
	}

	public Boolean isElementDisplayed(String locator) {

		Boolean result = false;
		try {
			getWebDriver().findElement(ByLocator(locator)).isDisplayed();
			result = true;
		} catch (Exception ex) {

		}
		return result;
	}

	public void WaitForElementPresent(String locator, int timeout) {

		for (int i = 0; i < timeout; i++) {
			if (isElementPresent(locator)) {
				break;
			}
		}
	}

	public void WaitForElementNotPresent(String locator, int timeout) {

		for (int i = 0; i < timeout; i++) {
			if (!isElementPresent(locator)) {
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void WaitForElementEnabled(String locator, int timeout) {

		for (int i = 0; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (getWebDriver().findElement(ByLocator(locator)).isEnabled()) {
					break;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void WaitForElementNotEnabled(String locator, int timeout) {

		for (int i = 0; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (!getWebDriver().findElement(ByLocator(locator)).isEnabled()) {
					break;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void WaitForElementVisible(String locator, int timeout) {

		for (int i = 0; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (getWebDriver().findElement(ByLocator(locator)).isDisplayed()) {
					break;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void WaitForElementNotVisible(String locator, int timeout) {

		for (int i = 0; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (!getWebDriver().findElement(ByLocator(locator)).isDisplayed()) {
					break;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void mouseOver(String locator) {
		//this.WaitForElementPresent(locator, 50);
		WebElement el = getWebDriver().findElement(ByLocator(locator));

		Actions builder = new Actions(getWebDriver());
		builder.moveToElement(el).build().perform();
	}

	public void mouseDoubleClick(String locator) {
		//this.WaitForElementPresent(locator, 50);
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		Actions builder = new Actions(getWebDriver());
		builder.doubleClick(el).perform();
	}

	public void dragAndDrop(String draggable, String to) {
		WebElement elDraggable = getWebDriver().findElement(ByLocator(draggable));
		WebElement todrag = getWebDriver().findElement(ByLocator(to));
		Actions builder = new Actions(getWebDriver());
		builder.dragAndDrop(elDraggable, todrag).perform();
	}

	public void clickOn(String locator) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.click();
	}

	public void clearTextField(String locator) {
		//this.WaitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.clear();
	}

	public void sendKeys(String locator, String userName) {
		//this.WaitForElementPresent(locator, 30);
		//this.WaitForElementEnabled(locator, 30);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.clear();
		el.sendKeys(userName);
	}
	
	
	public void cleartextbox(String locator)
	{
		
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.clear();
	}

	public void selectDropDown(String locator, String targetValue) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		//this.WaitForElementPresent(locator, 20);
		this.WaitForElementEnabled(locator, 20);
		new Select(getWebDriver().findElement(ByLocator(locator))).selectByVisibleText(targetValue);

	}

	public boolean isTextPresent(String locator, String str) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		String message = getWebDriver().findElement(ByLocator(locator)).getText();
		if (message.contains(str)) {
			return true;
		} else {
			return false;
		}
	}

	public String getText(String locator) {
		//WaitForElementPresent(locator, 20);
		//WaitForElementEnabled(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		String text = getWebDriver().findElement(ByLocator(locator)).getText();
		return text;
	}

	public boolean isChecked(String locator) {
		boolean checkStatus = false;
		//WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		checkStatus = el.isSelected();
		return checkStatus;
	}

	public String getAttribute(String locator, String attribute) {
		//WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		String text = getWebDriver().findElement(ByLocator(locator)).getAttribute(attribute);
		return text;
	}

	public Integer getInt(String strString) {
		Pattern intsOnly = Pattern.compile("\\d+");
		String input = strString;
		Matcher makeMatch = intsOnly.matcher(input);
		makeMatch.find();
		String digitStr = makeMatch.group();
		Integer digit = Integer.parseInt(digitStr);
		return digit;
	}

	public void javaScriptExecute(String javascrpt) {
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		js.executeScript(javascrpt);
	}

	public void rightClick(String locator) {
		WebElement el = getWebDriver().findElement(ByLocator(locator));

		// build and perform the mouseOver with Advanced User Interactions API
		Actions builder = new Actions(getWebDriver());
		builder.contextClick(el).build().perform();
		// builder.moveToElement(el).build().perform();
	}

	// click on yes at the delete video popup
	public void acceptPopup() {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
		getWebDriver().findElement(By.xpath("//div[@class='modal-footer']/button[contains(text(),'Delete Incident')]"))
				.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modal-content")));

	}

	public void clickTextField(String locator) {
		//this.WaitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.clear();
	}
	public int getSize(String locator){
		//this.WaitForElementPresent(locator, 50);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		int total = getWebDriver().findElements(ByLocator(locator)).size();
		return total;
	}
	
	public String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String str = simpleDateFormat.format(date);
		return str;
	}
	
	public String randomString(int len) {
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public void elementwait(String locator)
	{
		WebDriverWait wait = new WebDriverWait(getWebDriver(), 30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByLocator(locator)));
		
	}
	public void elementwait(String locator,int nTime)
	{
		WebDriverWait wait = new WebDriverWait(getWebDriver(), nTime); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByLocator(locator)));
		
	}
		
	public void deleteAllcookies()
	{
		getWebDriver().manage().deleteAllCookies();
	}
		
	//Scroll down page
	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
	
	// scroll to Particular element
	public void scrollToElement(String locator) {
		WebElement element = getWebDriver().findElement(ByLocator(locator));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}
		
	public void waitForPageload(int timeout)
	{
		getWebDriver().manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	}
	
	// To Generate 4 digit random number
	public int getRandomNumber()
	{
	Random rand = new Random();
	int rNumber=rand.nextInt(10000);
	return rNumber;
	}
	
	// To handle browse
	public void browseAfile(String FilePath) throws AWTException, InterruptedException
	{
		String dirPath = System.getProperty("user.dir");
		String pathToFile = dirPath+FilePath;
		StringSelection ss = new StringSelection(pathToFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		waitForElementLoad(5);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	 public void waitForElementLoad(int x) {
	  int num = x * 1000;
	  try {
	   Thread.sleep(num);
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	 }

}
