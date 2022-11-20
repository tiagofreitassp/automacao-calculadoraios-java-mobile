package calculadoraMobileIOS.page;

import calculadoraMobileIOS.drivers.MobileDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import java.io.IOException;

public class calculadoraIosMobilePage extends MobileDriver {
    BaseIosTest test = new BaseIosTest();
    BaseIosPage page = new BaseIosPage();

    private String btnAC = "btnAC";
    private String btnMaisMenos = "btnPlusMinus";
    private String btnPorcentagem = "btnPorc";
    private String btnDivisao = "btnDiv";
    private String btnSete = "btnSeven";
    private String btnOito = "btnEight";
    private String btnNove = "btnNine";
    private String btnQuatro = "btnFour";
    private String btnCinco = "btnFive";
    private String btnSeis = "btnSix";
    private String btnUm = "btnOne";
    private String btnDois = "btnTwo";
    private String btnTres = "btnThree";
    private String btnZero = "btnZero";
    private String btnPonto = "btnDot";
    private String btnIgual = "btnEqual";
    private String btnSoma = "btnPlus";
    private String btnSubtrair = "btnMinus";
    private String btnMultiplicar = "btnMult";

    private String txtResultado = "lblResult";

    public void soma() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Soma");
        test.criarPastaEvidencia("Calc iOS - Soma");
        page.clicar(By.id(btnAC));

        page.clicar(By.id(btnDois));
        test.gerarScreenshots("1Soma");
        page.clicar(By.id(btnSoma));
        page.clicar(By.id(btnTres));
        test.gerarScreenshots("2Soma");
        page.clicar(By.id(btnIgual));
        page.validarTexto(By.id(txtResultado),"5");
        test.gerarScreenshots("3Soma");

        page.esperar(1000);
        page.clicar(By.id(btnAC));
        test.gerarEvidenciaNoWord("Validar soma","1","Realizar uma soma");
    }

    public void subtrair() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Subtracao");
        test.criarPastaEvidencia("Calc iOS - Subtracao");
        page.clicar(By.id(btnAC));

        page.clicar(By.id(btnNove));
        test.gerarScreenshots("1Subtracao");
        page.clicar(By.id(btnSubtrair));
        page.clicar(By.id(btnQuatro));
        test.gerarScreenshots("2Subtracao");
        page.clicar(By.id(btnIgual));
        page.validarTexto(By.id(txtResultado),"5");
        test.gerarScreenshots("3Subtracao");

        page.esperar(1000);
        page.clicar(By.id(btnAC));
        test.gerarEvidenciaNoWord("Validar subtracao","2","Realizar uma subtracao");
    }

    public void multiplicar() throws InterruptedException, IOException, InvalidFormatException {
        System.out.println("Multiplicacao");
        test.criarPastaEvidencia("Calc iOS - Multiplicacao");
        page.clicar(By.id(btnAC));

        page.clicar(By.id(btnOito));
        test.gerarScreenshots("1Multiplicacao");
        page.clicar(By.id(btnMultiplicar));
        page.clicar(By.id(btnSete));
        test.gerarScreenshots("2Multiplicacao");
        page.clicar(By.id(btnIgual));
        page.validarTexto(By.id(txtResultado),"56");
        test.gerarScreenshots("3Multiplicacao");

        page.esperar(1000);
        page.clicar(By.id(btnAC));
        test.gerarEvidenciaNoWord("Validar multiplicacao","3","Realizar uma multiplicacao");
    }

    public void dividir() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Divisao");
        test.criarPastaEvidencia("Calc iOS - Divisao");
        page.clicar(By.id(btnAC));

        page.clicar(By.id(btnTres));
        page.clicar(By.id(btnDois));
        page.clicar(By.id(btnDivisao));
        page.clicar(By.id(btnZero));
        page.validarTexto(By.id(txtResultado),"0");

        page.clicar(By.id(btnAC));

        page.clicar(By.id(btnTres));
        page.clicar(By.id(btnDois));
        test.gerarScreenshots("1Divisao");
        page.clicar(By.id(btnDivisao));
        page.clicar(By.id(btnDois));
        test.gerarScreenshots("2Divisao");
        page.clicar(By.id(btnIgual));
        test.gerarScreenshots("3Divisao");
        page.validarTexto(By.id(txtResultado),"16");

        page.esperar(1000);
        page.clicar(By.id(btnAC));
        test.gerarEvidenciaNoWord("Validar divisao","4","Realizar uma divisao");
    }
}
