package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "configuration")
    public Object[][] getDataforCart() {
        Object[][] data = new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]"},//add parameter by coma and ""
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00]", "400 GB [+$100.00]", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]", "320 GB", "Vista Home [+$50.00]", "al Commander [+$5.00]"}
        };
        return data;
    }

    @DataProvider(name = "register")
    public Object[][] getDataForRegister() {
        Object[][] data = new Object[][]{
                {"test1@gmail.com", "test123"},
                {"test2@gmail.com", "test234"},
                {"test3@gmail.com", "test345"}
        };
        return data;
    }
}