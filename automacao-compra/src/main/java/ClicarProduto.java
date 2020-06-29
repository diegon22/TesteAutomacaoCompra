import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClicarProduto {

    private By produto = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]");
    private By mensagem = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span");
    WebDriver driver;

    public ClicarProduto(WebDriver driver) {
        this.driver = driver;
    }

    public void escolherProduto() {
        driver.findElement(produto).click();
        driver.findElement(mensagem).click();
    }

}
