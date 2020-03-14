package calculadoraMobileIOS;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class BaseIosPage extends MobileDriver{
    public WebDriverWait wait;

    public void clicar(By by) throws MalformedURLException {
        aguardarElemento(by);
        getDriver().findElement(by).click();
    }

    public void validarTexto(By by, String texto) throws MalformedURLException {
        aguardarElemento(by);
        Assert.assertEquals(texto, obterTexto(by));
    }

    public String obterTexto(By by) throws MalformedURLException {
        aguardarElemento(by);
        return getDriver().findElement(by).getText();
    }

    public void aguardarElemento(By by) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void esperar(long temp) throws InterruptedException {
        Thread.sleep(temp);
    }
}
