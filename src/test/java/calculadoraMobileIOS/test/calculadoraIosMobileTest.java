package calculadoraMobileIOS.test;

import calculadoraMobileIOS.page.BaseIosTest;
import calculadoraMobileIOS.page.calculadoraIosMobilePage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;
import java.net.MalformedURLException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class calculadoraIosMobileTest extends BaseIosTest {
    calculadoraIosMobilePage page = new calculadoraIosMobilePage();

    @Before
    public void inicializarDriver() throws MalformedURLException {
        page.getDriver();
    }

    @Test
    public void test1_Soma() throws IOException, InterruptedException, InvalidFormatException {
        page.soma();
    }

    @Test
    public void test2_Subtracao() throws IOException, InterruptedException, InvalidFormatException {
        page.subtrair();
    }

    @Test
    public void test3_Multiplicacao() throws IOException, InterruptedException, InvalidFormatException {
        page.multiplicar();
    }

    @Test
    public void test4_Divisao() throws IOException, InterruptedException, InvalidFormatException {
        page.dividir();
    }
}
