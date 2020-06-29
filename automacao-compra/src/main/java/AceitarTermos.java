import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AceitarTermos {

    private By aceitarTermo = By.id("cgv");
    private By confirmarAceite = By.name("processCarrier");
    WebDriver driver;

    public AceitarTermos(WebDriver driver) {
        this.driver = driver;
    }

    public void aceitaTermos() {
        driver.findElement(aceitarTermo).click();
        driver.findElement(confirmarAceite).click();
    }
}
