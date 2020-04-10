package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    private WebDriver navegador;

    public Home(WebDriver navegador) {
        this.navegador = navegador;
    }


    public Home btnMais() {

    navegador.findElement(By.xpath("//*[@id=\"header\"]/div[1]/button")).click();

       return this;
    }

    public Home criarQuadro(){
     navegador.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")).click();
        return this;
    }

    public Home inserirNome(String board){
        navegador.findElement(By.xpath("//*[@id=\"layer-manager-overlay\"]/div/div/div[1]/div/input")).sendKeys(board);
        return this;
    }

    public Board clickBoards(){
        navegador.findElement(By.xpath("//*[@id=\"layer-manager-overlay\"]/div/div/div[2]/div[2]/button")).click();
        return new Board(navegador);
    }




}
