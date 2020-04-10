package tests;

import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Home;
import pages.LoginPage;
import pages.Quadro;

public class InfoUserTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChome();
    }



    @Test
    public void addInfos() throws InterruptedException {
        new LoginPage(navegador)
            .clickLogin()
            .typeLogin("silviaramalho")
            .typePass("87654321")
            .clickEntrar()
            .btnMais()
            .criarQuadro()
            .inserirNome("Novo quadro")
            .clickBoards()
            .todo("To Do")
            .btnTodo()
            .doing("Doing")
            .btnDoing()
            .done("Done")
            .btnDone()
            .btnPerfil()
            .btnPerfileVisi()
        .btnAlterar()
        .btnAvatar()


        ;
    }





   /* @After
    public void tearDown(){
        navegador.quit();
    }*/


}
