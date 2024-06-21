package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.examples.constants.HomeConstants.*;

public class HomeService {

    public static void hamburguerMenu(){
        MobileActionManager.click(HAMBURGUER_MENU);
    }

    public static void menuHome() {
        MobileActionManager.waitVisibility(HAMBURGUER_MENU);
        Assert.assertTrue(MobileActionManager.isVisible(HAMBURGUER_MENU), VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void menuSettings() {
        MobileActionManager.click(SETTINGS_BUTTON);
    }

    public static void menuSettingsTheme() {
        MobileActionManager.click(APP_THEME_BUTTON);
        MobileActionManager.click(DARK_THEME_BUTTON);
        MobileActionManager.click(CONFIRM_BUTTON);
    }

    public static void menuSettingsNotifications(){
        MobileActionManager.click(NOTIFICATIONS_SLIDE_BUTTON);
    }

    public static void menuLogOut(){
        MobileActionManager.click(LOG_OUT_BUTTON);
        MobileActionManager.click(CONFIRM_LOG_OUT_BUTTON);
    }

    public static void settingsAplicados(){
        MobileActionManager.isSelected(DARK_THEME_BUTTON);
        MobileActionManager.isSelected(NOTIFICATIONS_SLIDE_BUTTON);
        Assert.assertTrue(MobileActionManager.isSelected(DARK_THEME_BUTTON,NOTIFICATIONS_SLIDE_BUTTON));
    }

    public static void logOutExitoso(){
        MobileActionManager.waitVisibility(LoginConstants.LOG_IN_MANUALLY);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.LOG_IN_MANUALLY), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}