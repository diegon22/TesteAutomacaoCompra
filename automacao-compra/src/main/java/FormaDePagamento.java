import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormaDePagamento {

    private By formadePagar = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]");
    WebDriver driver;

    public FormaDePagamento(WebDriver driver) {
        this.driver = driver;
    }

    public void formadePagamento() {
        driver.findElement(formadePagar).click();
    }
}
