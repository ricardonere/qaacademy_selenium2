import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioFormulario {
    String primeiroNomeString = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String sobrenomeString = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String enderecoString = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String emailString = "//*[@id='eid']/input";
    String telefoneString = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String sexoMasculinoString = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input";
    String hobiesMovies = "//*[@id='checkbox2']";
    String skillString = "//*[@id='Skills']";
    String selectCssString = "//*[@id='Skills']/option[20]";
    String selectSkillString = "/html/body/section/div/div/div[2]/form/div[8]/div/select";
    String countryString = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span/span[2]";
    String selectCountryString = "/html/body/span/span/span[1]/input";
    String nameCountryString = "//*[@id='select2-country-results']/li";
    String yearString = "//*[@id='yearbox']";
    String selectYeaString = "//*[@id='yearbox']/option[6]";
    String month = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select";
    String selectMonth = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[8]";
    String day = "//*[@id='daybox']/option[11]";
    String firstPassword = "//*[@id='firstpassword']";
    String repeatPassword = "//*[@id='secondpassword']";


    @Test
    public void testeAcessoNavegador()throws InterruptedException{
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.automationtesting.in/Register.html");
      Thread.sleep(5000);
     
      driver.findElement(By.xpath(primeiroNomeString)).click();
      driver.findElement(By.xpath(primeiroNomeString)).sendKeys("Davi");
      driver.findElement(By.xpath(sobrenomeString)).sendKeys("Roque");
      driver.findElement(By.xpath(enderecoString)).sendKeys("Avenida Paulista 809");
      driver.findElement(By.xpath(emailString)).sendKeys("davi.roque@gmail.com");
      driver.findElement(By.xpath(telefoneString)).sendKeys("08009192");
      driver.findElement(By.xpath(sexoMasculinoString)).click();
      driver.findElement(By.xpath(hobiesMovies)).click();
      driver.findElement(By.xpath(skillString)).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath(selectCssString)).click();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,400)", "");
      driver.findElement(By.xpath(skillString)).click();
      driver.findElement(By.xpath(countryString)).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath(selectCountryString)).sendKeys("Australia");
      driver.findElement(By.xpath(nameCountryString)).click();
      driver.findElement(By.xpath(yearString)).click();
      driver.findElement(By.xpath(selectYeaString)).click();
      driver.findElement(By.xpath(month)).click();
      driver.findElement(By.xpath(selectMonth)).click();
      driver.findElement(By.xpath(day)).click();
      driver.findElement(By.xpath(firstPassword)).sendKeys("Teste@23");
      driver.findElement(By.xpath(repeatPassword)).sendKeys("Teste@23");
      


}
}
