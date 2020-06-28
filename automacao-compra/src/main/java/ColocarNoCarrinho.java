import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColocarNoCarrinho {

    private By procedeAdicionar = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
    private By btCheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
    WebDriver driver;

    public ColocarNoCarrinho(WebDriver driver) {
        this.driver = driver;
    }

    public void colocarNoCarrinho() {
        WebElement ele = driver.findElement(procedeAdicionar);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public void verificarAdicao() {
        WebElement ele = driver.findElement(btCheckout);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

}
