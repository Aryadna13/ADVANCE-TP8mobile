package com.crowdar.examples.steps;

import com.crowdar.examples.services.TimeTrackerService;
import io.cucumber.java.en.*;

public class TimeEntrySteps {

    @Given("el usuario clickea el boton +")
    public void elUsuarioClickeaElBoton() {
        TimeTrackerService.tapPlusButton();
    }

    @And("el usuario clickea sobre el boton Manual")
    public void elUsuarioClickeaSobreElBotonManual() {
        TimeTrackerService.tapManualButton();
    }

    //DATE
    @Given("el usuario elige una (.*)")
    public void elUsuarioEligeUnaFecha(String fecha) {
        TimeTrackerService.agregoFecha(fecha);
    }

    //HOURS
    @Given("el usuario clickea el boton Start y setea una hora de (.*) con sus (.*)")
    public void elUsuarioClickeaElBotonStartYSeteaUnaHoraDeInicioConSusMinutos(String inicio, String minutos) {
        TimeTrackerService.startButton(inicio, minutos);
    }

    @And("el usuario clickea el boton End y setea una hora de (.*) con sus (.*)")
    public void elUsuarioClickeaElBotonEndYSeteaUnaHoraDeCierre(String cierre, String minutos) {
        TimeTrackerService.endButton(cierre, minutos);
    }

    //DATOS
    @And("el usuario nombra el time entry (.*), elige un proyecto, elige una task, le asigna un tag, marca si es (.*) y clickea el boton Save")
    public void elUsuarioNombraElTimeEntryNombreEligeUnProyectoEligeUnaTaskLeAsignaUnTagMarcaSiEsYClickeaElBotonSave(String nombre, Boolean billiable) {
        TimeTrackerService.nameNewEntry(nombre);
        TimeTrackerService.addProyect();
        TimeTrackerService.addTask();
        TimeTrackerService.addTag();
        TimeTrackerService.activateBilliable();
        TimeTrackerService.saveTimeEntry();
    }

    @Then("se crea un nuevo time entry")
    public void seCreaUnNuevoTimeEntry() {
        TimeTrackerService.nuevoTimeEntryCreado();
    }

    @And("el usuario nombra el time entry <nombre>, elige un proyecto, elige una task, le asigna un tag, marca si es {string} y clickea el boton Cancel")
    public void elUsuarioNombraElTimeEntryNombreEligeUnProyectoEligeUnaTaskLeAsignaUnTagMarcaSiEsYClickeaElBotonCancel(String adfsdfrg0) {

    }

    @Then("no se crea un nuevo time entry")
    public void noSeCreaUnNuevoTimeEntry() {
    }

}




