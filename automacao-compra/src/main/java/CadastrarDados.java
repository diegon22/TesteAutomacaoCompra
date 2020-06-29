import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastrarDados {

    private By genero = By.name("id_gender");
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

    public void preencherDados() {

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(genero));
        element.click();

        driver.findElement(primeiroNome).sendKeys("Diego");
        driver.findElement(ultimoNome).sendKeys("CB");
        driver.findElement(senha).sendKeys("34512");
        driver.findElement(endereco).sendKeys("Avenue New Pain");
        driver.findElement(cidade).sendKeys("Colorful");
        driver.findElement(estado).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(estado).sendKeys(Keys.ENTER);
        driver.findElement(postCode).sendKeys("00000");
        driver.findElement(celular).sendKeys("5511985736245");
        driver.findElement(btnSubmit).click();
    }
}
