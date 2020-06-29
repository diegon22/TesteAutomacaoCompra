import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarConta {

    private By inputEmail = By.id("email_create");
    private By btnCadastrar = By.xpath("//*[@id='SubmitCreate']/span");
    WebDriver driver;

    public CriarConta(WebDriver driver) {
        this.driver = driver;
    }

    public void informarEmail() {
        driver.findElement(inputEmail).sendKeys("di272s202@teste.com");
        driver.findElement(btnCadastrar).click();
    }
}
