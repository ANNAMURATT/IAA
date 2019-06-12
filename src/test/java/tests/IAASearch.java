package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.Menu;
import pages.SearchDetailsPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class IAASearch extends BrowserUtils {

    @Test
    public void test(){

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();
        loginPage.open();
//        waitForVisibility(loginPage.username,10);
        loginPage.login();
        MainMenuPage main = new MainMenuPage();
//        hover(main.vehicles);
//        waitForVisibility(main.advancedSearch,10);
//        main.advancedSearch.click();

        hover(main.auctions);
        waitForVisibility(main.buyNow,10);
        main.buyNow.click();

        SearchDetailsPage detailsPage = new SearchDetailsPage();
        detailsPage.yearRange("2016","2019");

        waitForClickablility(detailsPage.go,10);
        detailsPage.go.click();

        detailsPage.priceRange("500-1499").click();

        waitForClickablility(detailsPage.sellerType("insurance"),10);
        detailsPage.sellerType("insurance").click();

        waitForVisibility(detailsPage.cartype,10);
        detailsPage.cartype.click();
        waitForVisibility(detailsPage.vehicleType("Automobiles"),10);
        detailsPage.vehicleType("Automobiles").click();

        detailsPage.carMake.click();
        waitForVisibility(detailsPage.vehicleMake("Toyota"),10);
        detailsPage.vehicleMake("Toyota").click();

    }




//    @AfterMethod
//    public void close(){
//        Driver.getDriver().quit();
//    }
}
