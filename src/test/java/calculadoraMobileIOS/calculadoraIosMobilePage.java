package calculadoraMobileIOS;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import java.io.IOException;

public class calculadoraIosMobilePage extends MobileDriver {
    BaseIosTest test = new BaseIosTest();
    BaseIosPage page = new BaseIosPage();

    private String btnC = "btnC";
    private String btnMailMenos = "btnMailMenos";
    private String btnPorcentagem = "btnPorcentagem";
    private String btnDivisao = "btnDivisao";
    private String btnSete = "btnSete";
    private String btnOito = "btnOito";
    private String btnNove = "btnNove";
    private String btnQuatro = "btnQuatro";
    private String btnCinco = "btnCinco";
    private String btnSeis = "btnSeis";
    private String btnUm = "btnUm";
    private String btnDois = "btnDois";
    private String btnTres = "btnTres";
    private String btnZeroZero = "btnZeroZero";
    private String btnZero = "btnZero";
    private String btnPonto = "btnPonto";
    private String btnIgual = "btnIgual";
    private String btnSoma = "btnAdicao";
    private String btnSubtrair = "btnSubtracao";
    private String btnMultiplicar = "btnMultiplicacao";

    private String txtResultado = "lblResultado";

    public void soma() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Soma");
        test.criarPastaEvidencia("Calc iOS - Soma");

        page.clicar(By.id(btnDois));
        page.clicar(By.id(btnSoma));
        page.clicar(By.id(btnTres));
        test.gerarScreenshots("Soma1");
        page.validarTexto(By.id(txtResultado),"5");
        page.clicar(By.id(btnIgual));
        test.gerarScreenshots("Soma2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar soma","1","Realizar uma soma");
    }

    public void subtrair() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Subtracao");
        test.criarPastaEvidencia("Calc iOS - Subtracao");

        page.clicar(By.id(btnNove));
        page.clicar(By.id(btnSubtrair));
        page.clicar(By.id(btnQuatro));
        test.gerarScreenshots("Subtracao1");
        page.validarTexto(By.id(txtResultado),"5");
        page.clicar(By.id(btnIgual));
        test.gerarScreenshots("Subtracao2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar subtracao","2","Realizar uma subtracao");
    }

    public void multiplicar() throws InterruptedException, IOException, InvalidFormatException {
        System.out.println("Multiplicacao");
        test.criarPastaEvidencia("Calc iOS - Multiplicacao");

        page.clicar(By.id(btnOito));
        page.clicar(By.id(btnMultiplicar));
        page.clicar(By.id(btnSete));
        test.gerarScreenshots("Multiplicacao1");
        page.validarTexto(By.id(txtResultado),"56");
        page.clicar(By.id(btnIgual));
        test.gerarScreenshots("Multiplicacao2");

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar multiplicacao","3","Realizar uma multiplicacao");
    }

    public void dividir() throws IOException, InterruptedException, InvalidFormatException {
        System.out.println("Divisao");
        test.criarPastaEvidencia("Calc iOS - Divisao");

        page.clicar(By.id(btnTres));
        page.clicar(By.id(btnDois));
        page.clicar(By.id(btnDivisao));
        page.clicar(By.id(btnZero));
        page.validarTexto(By.id(txtResultado),"inf");
        test.gerarScreenshots("Divisao1");
        page.clicar(By.id(btnC));

        page.clicar(By.id(btnTres));
        page.clicar(By.id(btnDois));
        page.clicar(By.id(btnDivisao));
        page.clicar(By.id(btnDois));
        test.gerarScreenshots("Divisao2");
        page.validarTexto(By.id(txtResultado),"16");
        page.clicar(By.id(btnIgual));

        page.esperar(1000);
        test.gerarEvidenciaNoWord("Validar divisao","4","Realizar uma divisao");
    }
}
