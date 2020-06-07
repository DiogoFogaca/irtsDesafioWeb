package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ListaCarros extends Base {
    public ListaCarros(WebDriver navegador) {
        super(navegador);
    }

    public ListaCarros valorCarros(String val1, String val2) {
        String valorCarro1 = navegador.findElement(By.xpath("//h3[text()=\"R$ 60.900,00\"]")).getText();
        String valorCarro2 = navegador.findElement(By.xpath("//h3[text()=\"R$ 142.990,00\"]")).getText();

        assertThat(valorCarro1, containsString(val1));
        assertThat(valorCarro2, containsString(val2));
        System.out.println(valorCarro1);
        System.out.println(valorCarro2);

        return this;
    }

}
