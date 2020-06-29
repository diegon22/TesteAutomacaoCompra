import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmarPagamento {

    private By confirmaPagar = By.xpath("//*[@id='cart_navigation']/button");
    WebDriver driver;

    public ConfirmarPagamento(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmarPagamento() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(confirmaPagar));
        element.click();
    }
}
