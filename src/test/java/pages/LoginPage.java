package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver navegador;


    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginForm clickLogin() {
        navegador.findElement(By.xpath("/html/body/header/nav/div[2]/a[1]")).click();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return new LoginForm(navegador);
    }
}
