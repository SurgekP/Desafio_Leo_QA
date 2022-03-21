package adicionar.curso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("TESTE WEB PARA ADICIONAR NOVO CURSO NO MOODLE")
public class AdicionarCursoTest {
    @Test
    @DisplayName("Permitir adicionar um novo curso no Moodle após login")
    public void testAdicionarNovoCurso() {
        //arrange - dado que eu estou em um navegador Chrome aberto
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // maximizando a tela

        navegador.manage().window().maximize();
        //act -  quando eu navego para a URL https://sandbox.moodledemo.net/login/index.php e faço login
        navegador.get("https://sandbox.moodledemo.net/login/index.php");
        navegador.findElement(By.id("username")).click();
        navegador.findElement(By.id("username")).sendKeys("admin");
        navegador.findElement(By.id("password")).click();
        navegador.findElement(By.id("password")).sendKeys("sandbox");
        navegador.findElement(By.id("loginbtn")).click();

        //assert - então validar que um novo curso seja adicionado com sucesso
        navegador.findElement(By.linkText("Site administration")).click();
        navegador.findElement(By.linkText("Courses")).click();
        navegador.findElement(By.linkText("Add a new course")).click();
        navegador.findElement(By.id("id_fullname")).click();
        navegador.findElement(By.id("id_fullname")).sendKeys("Teste 13");
        navegador.findElement(By.id("id_shortname")).click();
        navegador.findElement(By.id("id_shortname")).sendKeys("Curto 13");
        navegador.findElement(By.id("id_idnumber")).click();
        navegador.findElement(By.id("id_idnumber")).sendKeys("13");
        navegador.findElement(By.id("id_saveanddisplay")).click();


    }

}
