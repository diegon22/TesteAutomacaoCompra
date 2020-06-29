<h1>Teste de Automação (Compras) </h1>

<h3>Site testado: http://automationpractice.com/index.php </h3>
<h4> Aplicado com conhecimentos de Selenium, Cucumber e Page Object </h4> <br /> 

Softwares necessários: Intellij IDEA; Google Chrome e ChromeDrive; <br/>

<h4> Caso de teste: Realizar uma compra com sucesso </h4>

1.Acessar o site: http://automationpractice.com/index.php <br/>
2.Escolha um produto qualquer na loja. <br/>
3. Adicione o produto escolhido ao carrinho. <br/>
4.Prossiga para o checkout. <br/>
5. Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo. <br/>
6.Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários. <br/>
7. Valide se o endereço está correto e prossiga. <br/>
8. Aceite os termos de serviço e prossiga. <br/>
9. Valide o valor total da compra. <br/>
10.Selecione um método de pagamento e prossiga. <br/>
11.Confirme a compra e valide se foi finalizada com sucesso. <br/> <br/>

<h4> Executando o script - Passo a Passo </h4>
<ul>
  <li> Baixe e descompacte o projeto; </li>
  <li> Acesse o Intellij IDEA, abra o projeto e após carregar, vá em src/test/java/runner; </li>
  <li> Execute o Runner.java; </li>
</ul> 
<br /> 
O script ira executar o teste e após isso a própria IDEA vai alertar que o teste foi concluído com êxito. Caso negativo, irá captar a exceção na console. <br /> <br />

<strong> IMPORTANTE: Para mais de uma execução, é necessário que altere o valor do e-mail enviado por sendKeys em "src/main/java/pages/CriarConta.java", uma vez que a intenção é que seja executado somente uma vez e para cadastrar o usuário, o e-mail deve ser único. </strong>
