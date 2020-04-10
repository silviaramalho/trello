package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Perfil {
    private WebDriver navegador;

    public Perfil(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Perfil btnAlterar() throws InterruptedException {
        Thread.sleep(5000);
        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[2]/div/div/div[1]/div/div[1]/div/span")).click();

        return this;
    }


    public Perfil btnAvatar() throws InterruptedException {
        Thread.sleep(5000);

        String file = "C:\\Users\\silvi\\sil.jpg";
        WebElement upload = navegador.findElement(By.xpath("/html/body/div[6]/div/section/div/div/div/input"));

        upload.sendKeys(file);

        return this;
    }

    public Perfil btnSalvar() throws InterruptedException {
        Thread.sleep(3000);
        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[2]/div/div/div[1]/form/button")).click();
        Thread.sleep(3000);
        return this;
    }

}
