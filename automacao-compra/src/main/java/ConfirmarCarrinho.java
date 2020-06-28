import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmarCarrinho {

    private By btCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    WebDriver driver;

    public ConfirmarCarrinho(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmaCarrinho() {
        driver.navigate().refresh();
        WebElement ele = driver.findElement(btCheckout);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }
}
