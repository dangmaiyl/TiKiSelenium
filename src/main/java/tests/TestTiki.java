package tests;

import core.BaseTest;
import core.Product;
import org.testng.annotations.Test;
import pages.TikiHomePage;

import java.util.List;

public class TestTiki extends BaseTest {
    @Test
    public void TC1(){
        TikiHomePage tikiHomePage=new TikiHomePage(getDriver());
        tikiHomePage.nagativeToTikiHomePage("https://tiki.vn/");
        tikiHomePage.sendKeyToSearchTextbox("IPhone 11");
        tikiHomePage.clickToSearchButton();
        //tikiHomePage.verifyListProductIphone();
       List<Product> ls= tikiHomePage.sortAndPrintProduct();
       tikiHomePage.sort(ls);
        for (Product pr:ls) {
            System.out.println(pr);
        }
    }
}
