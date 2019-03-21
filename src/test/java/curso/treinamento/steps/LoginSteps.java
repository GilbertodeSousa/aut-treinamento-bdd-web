package curso.treinamento.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class LoginSteps {
	
	@Dado("^que eu esteja na tela de login$")
	public void queEuEstejaNaTelaDeLogin() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.newtours.demoaut.com/");
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("login")).click();
	   
	}

	@Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\" ​$")
	public void façoLoginComOUsuárioESenha​(String arg1, String arg2) throws Throwable {

	}

	@Entao("^sou autenticado com sucesso$")
	public void souAutenticadoComSucesso() throws Throwable {
	
	}

}
