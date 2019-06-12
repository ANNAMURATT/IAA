package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainMenuPage extends Menu {

    @FindBy(linkText = "VEHICLES")
    public WebElement vehicles;

    @FindBy(linkText = "Advanced Search")
    public WebElement advancedSearch;

    @FindBy(linkText = "Fast Search")
    public WebElement fastSearch;

    @FindBy(linkText = "AUCTIONS")
    public WebElement auctions;

    @FindBy(linkText = "Live Auctions")
    public WebElement liveAuctions;

    @FindBy(linkText = "Timed Auctions")
    public WebElement timedAuctions;

    @FindBy(linkText = "Buy Now")
    public WebElement buyNow;

    @FindBy(linkText = "Locations")
    public WebElement locations;
}
