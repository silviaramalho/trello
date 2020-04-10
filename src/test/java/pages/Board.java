package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Board {
    private WebDriver navegador;

    public Board(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Board todo(String nome) throws InterruptedException {
        Thread.sleep(7000);
        navegador.findElement(By.xpath("//*[@id=\"board\"]/div/form/input")).sendKeys(nome);
        Thread.sleep(5000);
        return this;
    }

    public Board btnTodo() {
        navegador.findElement(By.xpath("//*[@id=\"board\"]/div/form/div/input")).click();
        return this;
    }

    public Board doing(String nome) throws InterruptedException {
        Thread.sleep(5000);
        navegador.findElement(By.xpath("//*[@id=\"board\"]/div[2]/form/input")).sendKeys(nome);
        return this;
    }

    public Board btnDoing() {
        navegador.findElement(By.xpath("//*[@id=\"board\"]/div[2]/form/div/input")).click();
        return this;
    }

    public Board done(String nome) throws InterruptedException {
        Thread.sleep(5000);
        navegador.findElement(By.xpath("//*[@id=\"board\"]/div[3]/form/input")).sendKeys(nome);
        return this;
    }

    public Board btnDone() {
        navegador.findElement(By.xpath("//*[@id=\"board\"]/div[3]/form/div/input")).click();
        return this;
    }

    public Board btnPerfil() {
        navegador.findElement(By.xpath("//*[@id=\"header\"]/div[2]/button[3]/div/span")).click();
    return this;
    }


    public Perfil btnPerfileVisi() throws InterruptedException {
        Thread.sleep(8000);
        WebElement perfil = navegador.findElement(By.xpath("/html/body/div[6]"));
        perfil.findElement(By.xpath("/html/body/div[6]/div/section/div/nav/ul/li[1]/a")).click();

        return new Perfil(navegador);
    }




}
