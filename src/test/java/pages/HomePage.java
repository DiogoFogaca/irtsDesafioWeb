package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import suporte.Web;

public class HomePage extends Base{

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public ListaCarros buscarCarros(String marca, String modelo) {
        navegador = Web.createChrome();
        navegador.findElement(By.cssSelector("button[title=\"Marca\"]")).sendKeys(marca);
        navegador.findElement(By.cssSelector("a[data-normalized-text=\"Audi\"]")).click();
        WebElement modelocar = navegador.findElement(By.cssSelector("button[title=\"Modelo\"]"));
        modelocar.click();
        modelocar.sendKeys(modelo);
        navegador.findElement(By.xpath("//span[text()=\"A3\"]")).click();
        navegador.findElement(By.cssSelector("button[class=\"button button--primary button--large button--block\"]")).click();
        return new ListaCarros(navegador);
    }
}
