import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastrarDados {

    private By primeiroNome = By.id("customer_firstname");
    private By ultimoNome = By.id("customer_lastname");
    private By senha = By.id("passwd");
    private By endereco = By.id("address1");
    private By cidade = By.id("city");
    private By estado = By.id("id_state");
    private By postCode = By.id("postcode");
    private By celular = By.id("phone_mobile");
    private By btnSubmit = By.id("submitAccount");
    WebDriver driver;

    public CadastrarDados(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherDados(String opcaoEstado) {
        driver.findElement(primeiroNome).sendKeys("Diegon");
        driver.findElement(ultimoNome).sendKeys("Anoni");
        driver.findElement(senha).sendKeys("89082");
        driver.findElement(endereco).sendKeys("Avenida Colorado");
        driver.findElement(cidade).sendKeys("SantRiver");
        new Select(driver.findElement(estado)).selectByVisibleText(opcaoEstado);
        driver.findElement(postCode).sendKeys("00000");
        driver.findElement(celular).sendKeys("5511962636577");
        driver.findElement(btnSubmit).click();
    }
}
