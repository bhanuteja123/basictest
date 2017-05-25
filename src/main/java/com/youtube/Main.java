package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"yt-masthead-signin\"]/div/button")).click();
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"VLWL-guide-item\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gh-playlist-add-video\"]")).click();
        driver.switchTo().frame(2);
        System.out.println("args ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id=':6']/div")).click();
        System.out.println("args 1");
        driver.findElement(By.xpath("//div[@id=':7']")).click();
    }
}
