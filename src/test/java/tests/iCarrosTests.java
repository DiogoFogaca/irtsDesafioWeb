package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import pages.HomePage;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "parametrosConsulta.csv")

public class iCarrosTests {
    private WebDriver navegador;

    @Test
    public void testConsulaIcarros(
            @Param(name = "marca") String marca,
            @Param(name = "modelo") String modelo,
            @Param(name = "val1") String val1,
            @Param(name = "val2") String val2
    ) {
        new HomePage(navegador)
                .buscarCarros(marca, modelo)
                .valorCarros(val1, val2)
                ;
    }
}