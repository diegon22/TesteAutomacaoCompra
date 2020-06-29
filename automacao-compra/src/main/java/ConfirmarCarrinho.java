import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmarCarrinho {

    private By btCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    WebDriver driver;

    public ConfirmarCarrinho(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmaCarrinho() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btCheckout));
        element.click();
    }
}
