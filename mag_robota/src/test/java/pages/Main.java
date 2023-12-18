package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.configs.ConfigProvider;

public class Main {
    private WebDriver driver;
    private WebDriverWait wait;

    public Main(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        driver.get("http://www.ntu.edu.ua/");
    }

    public void maxSize() {
        driver.manage().window().maximize();
    }

    private By findLanguage = By.xpath("//*[@id=\"qtranslate-2-chooser\"]/li[2]/a");
    private By waitForLanguage = By.xpath("//*[@id=\"content\"]/p");

    public void getLanguageChange() {
        driver.findElement(findLanguage).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForLanguage));
    }

    private By findHE = By.xpath("//*[@id=\"myCarousel\"]/div/div/div[1]/a/img");
    private By waitForHE = By.xpath("//*[@id=\"headerimg\"]/img");

    public void getHEOpen() {
        driver.findElement(findHE).click();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForHE));
    }

    private By findUniversity = By.xpath("//*[@id=\"menu-item-35\"]/a");
    private By waitForUniversity = By.xpath("//*[@id=\"menu-item-9733\"]/a");
    private By findUniversity2 = By.xpath("//*[@id=\"menu-item-9733\"]/a");
    private By waitForUniversity2 = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div/div[2]/div/div/div/div[2]");

    public void getUniversityOpen() {
        driver.findElement(findUniversity).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForUniversity));
        driver.findElement(findUniversity2).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForUniversity2));
    }

    //private By findMap = By.xpath("//*[@id=\"mapDiv\"]/div/div[3]/div[3]/div/div/div/div/div[2]/a");
    private By waitForMap = By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[1]/h1");
    //private By locateMap = By.xpath("//*[@id=\"mapDiv\"]/div/div[3]/div[3]/div/div/div/div/div[2]/a");

    public void getMapOpen() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(locateMap));
        //driver.findElement(findMap).click();
        driver.findElement(By.xpath("//a[@href='https://maps.google.com/maps?ll=50.440001,30.549974&amp;z=13&amp;t=m&amp;hl=en-US&amp;gl=US&amp;mapclient=embed&amp;cid=5191994063495823679']")).click();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForMap));
    }

    private By findCentry = By.xpath("//*[@id=\"menu-item-2128\"]/a");
    private By waitForCentry = By.xpath("//*[@id=\"post-95\"]/header/h1");

    public void getPidrozdilyOpen() {
        driver.findElement(findCentry).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForCentry));
    }

    private By findAddress = By.xpath("//*[@id=\"widget-addr\"]/div/div/p[1]/text()[2]");
    private By waitForAddress = By.xpath("//*[@id=\"post-95\"]/header/h1");

    public void getUniversityAddress() {
        String actualString = driver.findElement(findAddress).getText();
    }

}
