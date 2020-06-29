<h1>Teste de Automação (Compras) </h1>

<h3>Site testado: http://automationpractice.com/index.php </h3>
<h4> Aplicado com conhecimentos de Selenium, Cucumber e Page Object </h4> <br /> 

Softwares necessários: Intellij IDEA; Google Chrome e ChromeDrive; <br/>

<h4> Caso de teste: Realizar uma compra com sucesso </h4>

<ol>
  <li>Acessar o site: http://automationpractice.com/index.php </li>
  <li>Escolha um produto qualquer na loja</li>
  <li>Prossiga para o checkout</li>
  <li>Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo</li>
  <li>Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários</li>
  <li>Valide se o endereço está correto e prossiga</li>
  <li>Aceite os termos de serviço e prossiga</li>
  <li>Valide o valor total da compra</li>
  <li>Selecione um método de pagamento e prossiga</li>
  <li>Confirme a compra e valide se foi finalizada com sucesso</li>
 </ol>

<h4> Executando o script - Passo a Passo </h4>
<ul>
  <li> Baixe e descompacte o projeto; </li>
  <li> Acesse o Intellij IDEA, abra o projeto e após carregar, vá em src/test/java/runner; </li>
  <li> Execute o Runner.java; </li>
</ul> 
<br /> 
O script ira executar o teste e após isso a própria IDEA vai alertar que o teste foi concluído com êxito. Caso negativo, irá captar a exceção na console. <br /> <br />

<strong> IMPORTANTE: Para mais de uma execução, é necessário que altere o valor do e-mail enviado por sendKeys em "src/main/java/pages/CriarConta.java", uma vez que a intenção é que seja executado somente uma vez e para cadastrar o usuário, o e-mail deve ser único. </strong>
