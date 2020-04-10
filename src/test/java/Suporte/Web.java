package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    public static WebDriver createChome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\silvi\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://trello.com/");
        navegador.manage().window().maximize();

        return navegador;
    }
}
