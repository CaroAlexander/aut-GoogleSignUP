package Proyecto.Prueba.PageObject;

import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp")
// https://www.utest.com/
//https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp
//https://accounts.google.com/
public class PruebaPageObject extends PageObject{
	
	/*
	 * Definicion de variables
	 * */
	String TXT_CONTRASENA="Loquequieraponer2020";
	@FindBy(id="firstName")
	public WebElementFacade TXT_NOMBRES;
	
	@FindBy(name="lastName")
	public WebElementFacade TXT_APELLIDOS;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	public WebElementFacade TXT_USERNAME;
	
	@FindBy(name="Passwd")
	public WebElementFacade TXT_PASSWD;
	
	@FindBy(xpath="//*[@id=\"accountDetailsNext\"]")
	public WebElementFacade TXT_PASSWDCONF;
	
	@FindBy(xpath="//*[@id=\"accountDetailsNext\"]/span/span")
	public WebElementFacade BTN_SIGUIENTE;
	
	@FindBy(id="headingText")
	public WebElementFacade LBL_CONFIRMACION;
	
	
	public void EscribirNombre() {
		TXT_NOMBRES.sendKeys("Nombre de Prueba");
		}

	public void EscribirApellidos() {
		TXT_APELLIDOS.sendKeys("Apellido Prueba");
	}


	public void EscribirUsername() {
		TXT_USERNAME.sendKeys("userprueba20202");
		
	}


	public void EscribirPasswd() {
		TXT_PASSWD.sendKeys(TXT_CONTRASENA);
		
	}


	public void EscribirRepasswd() {
		TXT_PASSWDCONF.sendKeys(TXT_CONTRASENA);
		
	}

	public void InteractuarSiguiente() {
		BTN_SIGUIENTE.click();
		
	}

	

	
}
