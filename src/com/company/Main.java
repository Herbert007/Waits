package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // implicity waits
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herbert\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        //submit knop
        //driver.findElement(By.xpath(".//button[@class='searchbox__search-button submit-button gtm-searchbox-submit']")).click();
        //vlucht en auto

        WebDriverWait d = new WebDriverWait(driver, 20);
        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println(count);
        for (int i = 0; i < count; i++) {

            String waarde = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            String vwaarde = "butter";
            Boolean selected = driver.findElements(By.xpath("//input[@name='group1']")).get(i).isSelected();
            if (selected) {
                System.out.println("radiobutton met de waarde " + driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value") + "is geselecteerd");
            }
            if (waarde.contains(vwaarde)) {
                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            }
        }

//        System.out.println("aantal input " + driver.findElements(new By.ByCssSelector("input[type='radio']")).size());
//        List<WebElement> l = driver.findElements(new By.ByCssSelector("input[type='radio']"));
//        for (WebElement elem: l){
//            System.out.println("input elementen" + elem.getAttribute("name").toString());
//            if (!elem.isSelected() && elem.isDisplayed()) {
//                elem.click();
//                System.out.println("radio button dat is geselecteerd" + elem.getText());
//            }
//        }
//
//        for (int i = 0;i < l.size();i++) {
//            System.out.println("for check input");
//            WebElement rbutton =  l.get(i);
//            WebDriverWait e=new WebDriverWait(driver,10);
//            if (!rbutton.isSelected() && rbutton.isDisplayed()){
//               System.out.println("radio button dat is geselecteerd" + l.get(i).getText());
//            }
//        }

//        for (int i = 1; i > l.size(); i++) {
//            if (l.get(i).isSelected()){
//                System.out.println("radio button is geselecteerd met tekst: " + l.get(i).getText());
//            }
//        }
    }
}
