package register_User;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 import regiter_Utile.R_ExcelReader;
import regiter_Utile.R_HomePage;
import regiter_Utile.R_LoginPage;
 


public class R_RegiterExcelData extends R_TestBase{
	
	R_HomePage homepagee;
	R_UserRegisterPgae registerpage;
	R_LoginPage  loginpage;
	
	@DataProvider(name="ExcelData")
	public String[][] dataexcel() throws IOException
	
	{
		R_ExcelReader readdata= new R_ExcelReader();
		return (String[][]) readdata.getdataexcel();
	}
	
	
	@Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
	public void userRegisterexcel(String fname, String lname, String emailbox, String companybox, String passw,String confpassw, String day, String mois, String  year)
	{
		
		homepagee= new R_HomePage(driver);
		homepagee.openRegsiterpage();
		registerpage=new R_UserRegisterPgae(driver);
		registerpage.userRegister(fname, lname, emailbox, companybox, passw, confpassw, day, mois, year);
		Assert.assertTrue(registerpage.successMessage.getText().contains("Your registration completed"));
	}
}
