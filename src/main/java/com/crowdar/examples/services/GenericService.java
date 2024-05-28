package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;

public class GenericService {
    private static AndroidDriver driver = null;

    public GenericService(AndroidDriver driver) {
        this.driver = driver;
    }

    public static void clickAndHoldBckp(WebElement element) {
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();
    }
    public static RemoteWebDriver getDriver()
    {
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        return driver;
    }

    public static void genericScroll(int startX, int startY, int endX, int endY){
        TouchAction ts = new TouchAction((PerformsTouchActions) getDriver());
        ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();

    }

    public static void genericTouch(int x, int y){
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        TouchAction ts = new TouchAction(driver);
        ts.tap(PointOption.point(x, y)).perform();
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException var4) {
            System.out.println("Error in sleep: ".concat(var4.getMessage()));
            var4.printStackTrace();
        }
    }

    public static void deleteText(String locator, int cantidad){
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        Actions action = new Actions(driver);
        MobileActionManager.click(locator);
        for(int i = 0; i < cantidad; i++){
            action.sendKeys(Keys.BACK_SPACE);
        }
        action.perform();
    }

    public static void deleteTextNoClick(int cantidad){
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        Actions action = new Actions(driver);
        for(int i = 0; i < cantidad; i++){
            action.sendKeys(Keys.BACK_SPACE);
        }
        action.perform();
    }


    public static void deleteTextSlash(String locator1,String locator2, int cantidad){
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriverInstance().getWrappedDriver();
        Actions action = new Actions(driver);
        MobileActionManager.click(locator1);
        action.sendKeys(Keys.ARROW_RIGHT);
        for(int i = 0; i < cantidad; i++){
            action.sendKeys(Keys.BACK_SPACE);
        }
        action.perform();

        MobileActionManager.click(locator2);
        action.sendKeys(Keys.ARROW_RIGHT);
        for(int i = 0; i < cantidad; i++){
            action.sendKeys(Keys.BACK_SPACE);
        }
        action.perform();
    }



}