package Proyecto.Prueba.Steps;

import Proyecto.Prueba.PageObject.PruebaPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptException;

public class PruebaSteps {
	PruebaPageObject PruebaPageObject;
	
	@Step
	public void IngresarCrearCuenta() {
		try{
			PruebaPageObject.open();
		}catch (JavascriptException e){

		}

	}
	@Step
	public void DatosPersonales() {
		PruebaPageObject.EscribirNombre();
		PruebaPageObject.EscribirApellidos();
		PruebaPageObject.EscribirUsername();


	}
	@Step
	public void Contrasena() {
		PruebaPageObject.EscribirPasswd();
		PruebaPageObject.EscribirRepasswd();
		PruebaPageObject.InteractuarSiguiente();
	}
	@Step
	public void ValidacionCrearCuenta() {

		PruebaPageObject.EscribirPhone();
		PruebaPageObject.InteractuarBtonPhoneSiguiente();
		PruebaPageObject.EscribirCODE();
		PruebaPageObject.VerifyCODE();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
	

}
