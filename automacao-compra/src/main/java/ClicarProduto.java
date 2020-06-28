import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClicarProduto {

    private By produto = By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
    private By mensagem = By.xpath("//*[@id='add_to_cart']/button/span");
    WebDriver driver;

    public ClicarProduto(WebDriver driver) {
        this.driver = driver;
    }

    public void escolherProduto() {
        driver.findElement(produto).click();
    }

}
