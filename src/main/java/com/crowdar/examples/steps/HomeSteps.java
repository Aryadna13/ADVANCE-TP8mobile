package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.*;



public class HomeSteps extends PageSteps {


    @io.cucumber.java.en.Then("se muestra la Home page")
    public void seMuestraLaHomePage() {
        HomeService.menuHome();
    }

    @And("el usuario clickea el boton de menu")
    public void elUsuarioClickeaElBotonDeMenu() {
        HomeService.hamburguerMenu();
    }

    @When("el usuario clickea el boton Settings")
    public void elUsuarioClickeaElBotonSettings() {
        HomeService.menuSettings();
    }

    @And("el usuario clickea el boton AppTheme y cambia el tema a dark")
    public void elUsuarioClickeaElBotonAppThemeYCambiaElTemaA() {
        HomeService.menuSettingsTheme();
    }

    @And("el usuario desactiva las notificaciones")
    public void elUsuarioDesactivaLasNotificaciones() {
        HomeService.menuSettingsNotifications();
    }

    @Then("se cambia el tema a dark y las notificaciones aparecen desactivadas")
    public void seCambiaElTemaADarkYLasNotificacionesAparecenDesactivadas() {
        HomeService.settingsAplicados();
    }

    @When("el usuario clickea el boton LogOut")
    public void elUsuarioClickeaElBotonLogOut() {
        HomeService.menuLogOut();
    }

    @Then("se muestra la Homepage sin loguear")
    public void seMuestraLaHomepageSinLoguear() {
        HomeService.logOutExitoso();
    }
}


