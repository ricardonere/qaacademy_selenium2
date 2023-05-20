package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrimeiraClasse {
  String cursosOnlineBotao = "//*[@id='comp-k7g9c7sd2label']";
  String cursosPresenciaisBotao = "comp-k7g9c7sd1label";
  
    @Test
    public void testeAberturaNavegador(){
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
     driver.get("https://www.qaacademy.com.br");
      driver.findElement(By.xpath(cursosOnlineBotao)).click();
      driver.findElement(By.id(cursosPresenciaisBotao)).click();
      

    }
}
