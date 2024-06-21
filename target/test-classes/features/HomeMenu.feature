@Regression @Menuprincipal
Feature: El usuario interactua con distintas herramientas del menu lateral

  Background:
    Given el usuario clickea el boton Log in manually
    And el usuario ingresa su "email" y "password"
    And el usuario clickea el boton de menu


  @Settings @smoke
  Scenario: el usuario cambia el tema de la aplicacion y las notificaciones
    When el usuario clickea el boton Settings
    And el usuario clickea el boton AppTheme y cambia el tema a dark
    And el usuario desactiva las notificaciones
    Then se cambia el tema a dark y las notificaciones aparecen desactivadas


  @LogOutExitoso @smoke
  Scenario: el usuario desloguea de la aplicacion de clockify
    Given el usuario clickea el boton de menu
    When el usuario clickea el boton LogOut
    Then se muestra la Home pagessdfsff