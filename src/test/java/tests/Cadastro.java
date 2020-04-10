package tests;

import org.junit.After;
import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
public class Cadastro {

    @Test
    public void cadastro() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\silvi\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get("https://trello.com/");
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.manage().window().maximize();


        navegador.findElement(By.linkText("Cadastrar-se")).click();

       navegador.findElement(By.id("email")).sendKeys("silvia @email");
       // navegador.findElement(By.xpath("e//*[@id=\"email\"]mail")).sendKeys("silvia @email");
        navegador.findElement(By.id("signup-submit")).click();

//      navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        navegador.findElement(By.id("email")).clear();



        navegador.findElement(By.id("email")).sendKeys("       ");
        navegador.findElement(By.id("signup-submit")).click();
        navegador.findElement(By.id("email")).clear();



       //E-mail
        navegador.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("silvia@mailna.biz");
        navegador.findElement(By.id("signup-submit")).click();

        //nome completo
        Thread.sleep(20000);
        navegador.findElement(By.id("displayName")).sendKeys("Silvia Ramalho");


        //Senha
        Thread.sleep(20000);
        navegador.findElement(By.id("password")).sendKeys("87654321");

        //Enviar
        Thread.sleep(20000);
        navegador.findElement(By.xpath("//*[@id=\"signup-submit\"]/span/span")).click();


    }


}