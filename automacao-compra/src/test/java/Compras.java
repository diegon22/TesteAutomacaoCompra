import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compras {

    WebDriver driver;
    ClicarProduto clicarProduto;
    ColocarNoCarrinho colocarNoCarrinho;
    ConfirmarCarrinho confirmarCarrinho;
    CriarConta criarConta;
    CadastrarDados cadastrarDados;
    ConfirmarEndereco confirmarEndereco;
    AceitarTermos aceitarTermos;
    FormaDePagamento formaDePagamento;
    ConfirmarPagamento confirmarPagamento;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        System.out.println("Before");
    }

    @Test
    public void clicarNoProduto()  {
        System.out.println("Teste1");
        clicarProduto = new ClicarProduto(driver);
        clicarProduto.escolherProduto();
        colocarNoCarrinho = new ColocarNoCarrinho(driver);
        colocarNoCarrinho.colocarNoCarrinho();
        colocarNoCarrinho.verificarAdicao();
        confirmarCarrinho = new ConfirmarCarrinho(driver);
        confirmarCarrinho.confirmaCarrinho();
        criarConta = new CriarConta(driver);
        criarConta.informarEmail();
        cadastrarDados = new CadastrarDados(driver);
        cadastrarDados.preencherDados("Arizona");
        confirmarEndereco = new ConfirmarEndereco(driver);
        confirmarEndereco.confirmarEndereco();
        aceitarTermos = new AceitarTermos(driver);
        aceitarTermos.aceitaTermos();
        formaDePagamento = new FormaDePagamento(driver);
        formaDePagamento.formadePagamento();
        confirmarPagamento = new ConfirmarPagamento(driver);
        confirmarPagamento.confirmarPagamento();
    }


    @After
    public void tearDown(){
        System.out.println("After");
        driver.close();
    }

}
