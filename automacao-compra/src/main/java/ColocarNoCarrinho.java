import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColocarNoCarrinho {

    private By procede = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");
    WebDriver driver;

    public ColocarNoCarrinho(WebDriver driver) {
        this.driver = driver;
    }

    public void colocarNoCarrinho()  {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(procede));
        element.click();
    }

}
