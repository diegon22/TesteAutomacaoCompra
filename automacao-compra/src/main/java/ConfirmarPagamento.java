import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmarPagamento {

    private By confirmaPagar = By.xpath("//*[@id=\"cart_navigation\"]/button");
    WebDriver driver;

    public ConfirmarPagamento(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmarPagamento() {
        driver.findElement(confirmaPagar).click();
    }
}
