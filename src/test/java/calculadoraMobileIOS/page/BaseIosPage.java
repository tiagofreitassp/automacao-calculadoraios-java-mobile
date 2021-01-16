package calculadoraMobileIOS.page;

import calculadoraMobileIOS.drivers.MobileDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class BaseIosPage extends MobileDriver {
    public WebDriverWait wait;

    public void clicar(By by) throws MalformedURLException {
        aguardarElemento(by);
        getDriver().findElement(by).click();
    }

    public void validarTexto(By by, String texto) throws MalformedURLException, InterruptedException {
        aguardarElemento(by);
        Assert.assertEquals(texto, obterTexto(by));
        Thread.sleep(1000);
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

    public String obterNomeSistemaOperacional(){
        String so = System.getProperty("os.name");
        return so;
    }

    public String obterUsuarioLogado(){
        String usuario = System.getProperty("user.name");
        return usuario;
    }

    public String obterNumeroIP() throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        //System.out.println("Numero IP: "+ip);
        return ip;
    }

    public String obterNomaDaMaquina() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        //System.out.println("Nome da maquina: "+hostName);
        return hostName;
    }
}
