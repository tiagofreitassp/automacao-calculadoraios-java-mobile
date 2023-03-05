package calculadoraMobileIOS.page;

import calculadoraMobileIOS.drivers.MobileDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import java.io.IOException;

public class calculadoraIosMobilePage extends MobileDriver {
    BaseIosTest test = new BaseIosTest();
    BaseIosPage page = new BaseIosPage();

    private String btnAC = "//XCUIElementTypeButton[@name=\"btnC\"]";
    private String btnMaisMenos = "//XCUIElementTypeButton[@name=\"btnMailMenos\"]";
    private String btnPorcentagem = "//XCUIElementTypeButton[@name=\"btnPorcentagem\"]";
    private String btnDivisao = "//XCUIElementTypeButton[@name=\"btnDivisao\"]";
    private String btnSete = "//XCUIElementTypeButton[@name=\"btnSete\"]";
    private String btnOito = "//XCUIElementTypeButton[@name=\"btnOito\"]";
    private String btnNove = "//XCUIElementTypeButton[@name=\"btnNove\"]";
    private String btnQuatro = "//XCUIElementTypeButton[@name=\"btnQuatro\"]";
    private String btnCinco = "//XCUIElementTypeButton[@name=\"btnCinco\"]";
    private String btnSeis = "//XCUIElementTypeButton[@name=\"btnSeis\"]";
    private String btnUm = "//XCUIElementTypeButton[@name=\"btnUm\"]";
    private String btnDois = "//XCUIElementTypeButton[@name=\"btnDois\"]";
    private String btnTres = "//XCUIElementTypeButton[@name=\"btnTres\"]";
    private String btnZero = "//XCUIElementTypeButton[@name=\"btnZero\"]";
    private String btnPonto = "//XCUIElementTypeButton[@name=\"btnPonto\"]";
    private String btnIgual = "//XCUIElementTypeButton[@name=\"btnIgual\"]";
    private String btnSoma = "//XCUIElementTypeButton[@name=\"btnAdicao\"]";
    private String btnSubtrair = "//XCUIElementTypeButton[@name=\"btnSubtracao\"]";
    private String btnMultiplicar = "//XCUIElementTypeButton[@name=\"btnMultiplicacao\"]";

    private String txtResultado = "//XCUIElementTypeStaticText[@name=\"lblResultado\"]";

    public void soma() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Soma");
        test.criarPastaEvidencia("Calc iOS - Soma");
        page.clicar(By.xpath(btnAC));

        page.clicar(By.xpath(btnDois));
        test.gerarScreenshots("1Soma");
        page.clicar(By.xpath(btnSoma));
        page.clicar(By.xpath(btnTres));
        test.gerarScreenshots("2Soma");
        page.clicar(By.xpath(btnIgual));
        page.validarTexto(By.xpath(txtResultado),"5");
        test.gerarScreenshots("3Soma");

        page.esperar(1000);
        page.clicar(By.xpath(btnAC));
        test.gerarEvidenciaNoWord("Validar soma","1","Realizar uma soma");
    }

    public void subtrair() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Subtracao");
        test.criarPastaEvidencia("Calc iOS - Subtracao");
        page.clicar(By.xpath(btnAC));

        page.clicar(By.xpath(btnNove));
        test.gerarScreenshots("1Subtracao");
        page.clicar(By.xpath(btnSubtrair));
        page.clicar(By.xpath(btnQuatro));
        test.gerarScreenshots("2Subtracao");
        page.clicar(By.xpath(btnIgual));
        page.validarTexto(By.xpath(txtResultado),"5");
        test.gerarScreenshots("3Subtracao");

        page.esperar(1000);
        page.clicar(By.xpath(btnAC));
        test.gerarEvidenciaNoWord("Validar subtracao","2","Realizar uma subtracao");
    }

    public void multiplicar() throws InterruptedException, IOException, InvalidFormatException {
        System.out.println("Multiplicacao");
        test.criarPastaEvidencia("Calc iOS - Multiplicacao");
        page.clicar(By.xpath(btnAC));

        page.clicar(By.xpath(btnOito));
        test.gerarScreenshots("1Multiplicacao");
        page.clicar(By.xpath(btnMultiplicar));
        page.clicar(By.xpath(btnSete));
        test.gerarScreenshots("2Multiplicacao");
        page.clicar(By.xpath(btnIgual));
        page.validarTexto(By.xpath(txtResultado),"56");
        test.gerarScreenshots("3Multiplicacao");

        page.esperar(1000);
        page.clicar(By.xpath(btnAC));
        test.gerarEvidenciaNoWord("Validar multiplicacao","3","Realizar uma multiplicacao");
    }

    public void dividir() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Divisao");
        test.criarPastaEvidencia("Calc iOS - Divisao");
        page.clicar(By.xpath(btnAC));

        page.clicar(By.xpath(btnTres));
        page.clicar(By.xpath(btnDois));
        page.clicar(By.xpath(btnDivisao));
        page.clicar(By.xpath(btnZero));
        page.validarTexto(By.xpath(txtResultado),"0");

        page.clicar(By.xpath(btnAC));

        page.clicar(By.xpath(btnTres));
        page.clicar(By.xpath(btnDois));
        test.gerarScreenshots("1Divisao");
        page.clicar(By.xpath(btnDivisao));
        page.clicar(By.xpath(btnDois));
        test.gerarScreenshots("2Divisao");
        page.clicar(By.xpath(btnIgual));
        test.gerarScreenshots("3Divisao");
        page.validarTexto(By.xpath(txtResultado),"16");

        page.esperar(1000);
        page.clicar(By.xpath(btnAC));
        test.gerarEvidenciaNoWord("Validar divisao","4","Realizar uma divisao");
    }
}
