import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmarEndereco {

    private By confirmaEndereco = By.name("processAddress");
    WebDriver driver;

    public ConfirmarEndereco(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmarEndereco() {
        driver.findElement(confirmaEndereco).click();
    }
}
