package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class Projeto {
    String campoProcura = "//*[@id='root-search-bar-component']/div/div/form/fieldset/input";
    String clicarNomeProduto = "//*[@id='root-search-bar-component']/div/div/form/div/div/div/div/div[1]/div[1]/div/ul/li[1]/a";
    String confirmarCompra = "//*[@id='656240']/a";
    String criarCadastro = "/html/body/header/div[2]/div/div/div[5]/div[2]/a/span/span[1]";
    String cadastrarAgora = "//*[@id='modalLoginDefault']/div/div/div/form/div[2]/div/a[2]";  
    String emailString = "//*[@id='rnk-input-email-create-account']";
    String criarConta = "/html/body/main/div[3]/div/div/div/form/div[2]/button[2]";
    String nomeString = "//*[@id='input-nome-form']";
    String sobrenomeString = "//*[@id='input-sobrenome-form']";
    String cpfString = "//*[@id='input-cpf-form']";
    String telefoneString = "//*[@id='input-telefone-form']";
    String senhaString = "//*[@id='show-password-input']";
    String confirmaSenhaString = "//*[@id='show-password-confirmation']";
    String concluiContaString = "//*[@id='modalLoginCreateAccountForm']/div/div/div/form/div[2]/button[2]";


    @Test
    public void testeAcessoNavegador()throws InterruptedException{
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.drogariasaopaulo.com.br/");
      Thread.sleep(5000);
        
      driver.findElement(By.xpath(campoProcura)).sendKeys("Soro Fisiológico Ever Care 500"); 
      Thread.sleep(5000);
      driver.findElement(By.xpath(clicarNomeProduto)).click();






      driver.findElement(By.xpath(confirmarCompra)).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath(criarCadastro)).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath(cadastrarAgora)).click();
      driver.findElement(By.xpath(emailString)).sendKeys("clark2014@bol.com.br");
      Thread.sleep(5000);
      driver.findElement(By.xpath(criarConta)).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath(nomeString)).sendKeys("Lucas");
      driver.findElement(By.xpath(sobrenomeString)).sendKeys("Soares");
      driver.findElement(By.xpath(cpfString)).sendKeys("127.475.500-01");
      driver.findElement(By.xpath(telefoneString)).sendKeys("1154545454");
      driver.findElement(By.xpath(senhaString)).sendKeys("Teste123");
      driver.findElement(By.xpath(confirmaSenhaString)).sendKeys("Teste123");
      driver.findElement(By.xpath(concluiContaString)).click();
    }

      
      }

