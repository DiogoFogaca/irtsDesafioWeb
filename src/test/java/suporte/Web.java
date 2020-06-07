package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Navegando para pagina
        navegador.get("https://www.icarros.com.br/principal/index.jsp");
        return navegador;

    }
}
