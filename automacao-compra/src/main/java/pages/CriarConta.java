package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class CriarConta extends DriverManager {

    private By inputEmail = By.id("email_create");
    private By btnCadastrar = By.xpath("//*[@id='SubmitCreate']/span");

    public void informarEmail() {
        driver.findElement(inputEmail).sendKeys("diegocampos2202@teste.com");
        driver.findElement(btnCadastrar).click();
    }
}
