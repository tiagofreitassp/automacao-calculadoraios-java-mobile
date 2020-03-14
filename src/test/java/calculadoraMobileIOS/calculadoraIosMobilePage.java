package calculadoraMobileIOS;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import java.io.IOException;

public class calculadoraIosMobilePage extends MobileDriver {
    BaseIosTest test = new BaseIosTest();
    BaseIosPage page = new BaseIosPage();

    private String btnC = "//XCUIElementTypeButton[@name=\"C\"]";
    private String btnMailMenos = "//XCUIElementTypeButton[@name=\"+/-\"]";
    private String btnPorcentagem = "//XCUIElementTypeButton[@name=\"%\"]";
    private String btnDivisao = "//XCUIElementTypeButton[@name=\"/\"]";
    private String btnSete = "//XCUIElementTypeButton[@name=\"7\"]";
    private String btnOito = "//XCUIElementTypeButton[@name=\"8\"]\n";
    private String btnNove = "//XCUIElementTypeButton[@name=\"9\"]";
    private String btnQuatro = "//XCUIElementTypeButton[@name=\"4\"]";
    private String btnCinco = "//XCUIElementTypeButton[@name=\"5\"]\n";
    private String btnSeis = "//XCUIElementTypeButton[@name=\"6\"]";
    private String btnUm = "//XCUIElementTypeButton[@name=\"1\"]";
    private String btnDois = "//XCUIElementTypeButton[@name=\"2\"]\n";
    private String btnTres = "//XCUIElementTypeButton[@name=\"3\"]\n";
    private String btnZeroZero = "//XCUIElementTypeButton[@name=\"00\"]";
    private String btnZero = "//XCUIElementTypeButton[@name=\"0\"]\n";
    private String btnPonto = "//XCUIElementTypeButton[@name=\".\"]";
    private String btnIgual = "//XCUIElementTypeButton[@name=\"=\"]";
    private String btnSoma = "//XCUIElementTypeButton[@name=\"+\"]";
    private String btnSubtrair = "//XCUIElementTypeButton[@name=\"-\"]";
    private String btnMultiplicar = "//XCUIElementTypeButton[@name=\"*\"]\n";

    //private String txtResultado = "";//A calculadora nao tem identificador, necessario um arquivo com id

    public void soma() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Soma");
        test.criarPastaEvidencia("Calc iOS - Soma");

        page.clicar(By.xpath(btnDois));
        page.clicar(By.xpath(btnSoma));
        page.clicar(By.xpath(btnTres));
        test.gerarScreenshots("Soma1");
        page.clicar(By.xpath(btnIgual));
        test.gerarScreenshots("Soma2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar soma","1","Realizar uma soma");
    }

    public void subtrair() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Subtracao");
        test.criarPastaEvidencia("Calc iOS - Subtracao");

        page.clicar(By.xpath(btnNove));
        page.clicar(By.xpath(btnSubtrair));
        page.clicar(By.xpath(btnQuatro));
        test.gerarScreenshots("Subtracao1");
        page.clicar(By.xpath(btnIgual));
        test.gerarScreenshots("Subtracao2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar subtracao","2","Realizar uma subtracao");
    }

    public void multiplicar() throws InterruptedException, IOException, InvalidFormatException {
        System.out.println("Multiplicacao");
        test.criarPastaEvidencia("Calc iOS - Multiplicacao");

        page.clicar(By.xpath(btnOito));
        page.clicar(By.xpath(btnMultiplicar));
        page.clicar(By.xpath(btnSete));
        test.gerarScreenshots("Multiplicacao1");
        page.clicar(By.xpath(btnIgual));
        test.gerarScreenshots("Multiplicacao2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar multiplicacao","3","Realizar uma multiplicacao");
    }

    public void dividir() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Divisao");
        test.criarPastaEvidencia("Calc iOS - Divisao");

        page.clicar(By.xpath(btnTres));
        page.clicar(By.xpath(btnDois));
        page.clicar(By.xpath(btnDivisao));
        page.clicar(By.xpath(btnDois));
        test.gerarScreenshots("Divisao1");
        page.clicar(By.xpath(btnIgual));
        test.gerarScreenshots("Divisao2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar divisao","4","Realizar uma divisao");
    }
}
