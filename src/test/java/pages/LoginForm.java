package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm {

    private WebDriver navegador;

    public LoginForm(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginForm typeLogin (String login) throws InterruptedException {
        Thread.sleep(5000);
        navegador.findElement(By.id("user")).sendKeys(login);
        return this;
    }

    public LoginForm typePass (String pass){
        navegador.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
        return this;
    }

    public Home clickEntrar(){
        navegador.findElement(By.xpath("//*[@id=\"login\"]")).click();
        return new Home(navegador);
    }
}
