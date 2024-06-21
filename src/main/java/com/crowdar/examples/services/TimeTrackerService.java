package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeTrackerConstants;
import org.testng.Assert;

import static com.crowdar.examples.constants.TimeTrackerConstants.*;

public class TimeTrackerService {

    //BACKGROUND

    public static void tapPlusButton() {
        MobileActionManager.click(TimeTrackerConstants.NEW_TIME_TRACKER);
    }

    public static void tapManualButton() {
        MobileActionManager.click(TimeTrackerConstants.MANUAL_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.CANCEL_DURATION_BUTTON);
    }

    //DATE
    public static void agregoFechaInput(String fecha) {
        MobileActionManager.click(TimeTrackerConstants.DATE_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.EDIT_DATE_BUTTON);
        GenericService.deleteText(TimeTrackerConstants.DATE_INPUT_CLEAR, 10);
        MobileActionManager.setInput(TimeTrackerConstants.DATE_INPUT, fecha);
        MobileActionManager.click(TimeTrackerConstants.DATE_OK_BUTTON);
    }

    public static void agregoFechaCalendario() {
        MobileActionManager.click(TimeTrackerConstants.DATE_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.YEAR_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.YEAR_2025);
        MobileActionManager.click(TimeTrackerConstants.MONT_BUTTON_NEXT);
        MobileActionManager.click(TimeTrackerConstants.MONT_BUTTON_NEXT);
        MobileActionManager.click(TimeTrackerConstants.MONT_BUTTON_NEXT);
        MobileActionManager.click(TimeTrackerConstants.DAY_SEPTEMBER_13);
        MobileActionManager.click(TimeTrackerConstants.DATE_OK_BUTTON);
    }

    //HORA
    public static void startButton(String inicio, String minutos) {
        MobileActionManager.click(TimeTrackerConstants.START_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.TECLADO_EN_PANTALLA);
        MobileActionManager.click(HORA_INPUT_CLEAR);
        MobileActionManager.setInput(TIME_INPUT, inicio);
        MobileActionManager.click(MINUTOS_INPUT_CLEAR);
        MobileActionManager.setInput(TIME_INPUT, minutos);
        MobileActionManager.click(TimeTrackerConstants.OK_BUTTON);
    }

    public static void endButton(String cierre, String minutos) {
        MobileActionManager.click(TimeTrackerConstants.END_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.TECLADO_EN_PANTALLA);
        MobileActionManager.click(HORA_INPUT_CLEAR);
        MobileActionManager.setInput(TIME_INPUT, cierre);
        MobileActionManager.click(MINUTOS_INPUT_CLEAR);
        MobileActionManager.setInput(TIME_INPUT, minutos);
        MobileActionManager.click(TimeTrackerConstants.OK_BUTTON);
    }


    //DATOS
    public static void nameNewEntry(String nombre) {
        MobileActionManager.setInput(TimeTrackerConstants.NAME_ENTRY_INPUT, nombre);
    }

    public static void addProyect() {
        MobileActionManager.click(TimeTrackerConstants.PROYECTO_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.AGREGAR_PROYECTO_BUTTON);
    }

    //TASK
    public static void addTask() {
        MobileActionManager.click(TimeTrackerConstants.TASK_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.TASK_SELECT);
    }

    //TAG
    public static void addTag() {
        MobileActionManager.click(TimeTrackerConstants.TAG_BUTTON);
        MobileActionManager.click(TimeTrackerConstants.TAG_CHECKBOX);
        MobileActionManager.click(TimeTrackerConstants.BACK_TAG_BUTTON);
    }

    public static void activateBilliable() {
        MobileActionManager.setCheckbox(TimeTrackerConstants.BILLIABLE_BUTTON, true);
    }

    public static void saveTimeEntry() {
        MobileActionManager.click(TimeTrackerConstants.SAVE_BUTTON);
    }

    public static void cancelTimeEntry() {
        MobileActionManager.click(DISCARD_BUTTON);
        MobileActionManager.click(DISCARD_OK_BUTTON);
    }

    public static void nuevoTimeEntryCreado() {
        MobileActionManager.waitVisibility(TimeTrackerConstants.ENTRY_CREATED_MESSAGE);
        Assert.assertTrue(MobileActionManager.isVisible(TimeTrackerConstants.ENTRY_CREATED_MESSAGE), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void nuevoTimeEntryCancelado() {
        MobileActionManager.waitVisibility(DATE_BUTTON);
        Assert.assertEquals(MobileActionManager.getElement(DATE_BUTTON),DATE_BUTTON);
    }
}
