package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.lang.reflect.Field;

public class SearchDetailsPage extends Menu{

   @FindBy(id="yearTextA")
    public WebElement startYear;

    @FindBy(id="yearTextB")
    public WebElement endYear;

    @FindBy(xpath = "//div[@id='VehicleTypeRefiner']//li[@class='showMore']")
    public WebElement cartype;

    @FindBy(xpath = "//div[@id='MakeModel']//li[contains(.,'More')]")
    public WebElement carMake;

    @FindBy(xpath = "//div[@class='yearRange-container']//input[@type='submit']")
    public WebElement go;

    public void yearRange(String start, String end){
        startYear.sendKeys(start);
        endYear.sendKeys(end);

    }
    public WebElement priceRange(String price){
        WebElement p = Driver.getDriver().findElement(By.xpath("//div[@id='BuyNowPriceFilterGroup']//a[@name='"+price+"']"));
        return p;
    }

    public WebElement sellerType(String type){
        WebElement p = Driver.getDriver().findElement(By.xpath("//a[@name='"+type+"']"));
        return p;
    }

    public WebElement vehicleType(String type){
        WebElement p = Driver.getDriver().findElement(By.xpath("//ul[@class='submenu' and contains(.,'"+type+"')]"));
        return p;
    }

    public WebElement vehicleMake(String make){
        WebElement p = Driver.getDriver().findElement(By.xpath("//ul[@class='submenu']//a[contains(.,'"+make+"')]"));
        return p;
    }


}
