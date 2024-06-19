@Regression @TimeTracker @TimeEntry
Feature: El usuario agrega horas de trabajo a su proyecto

  Background:
    Given el usuario clickea el boton Log in manually
    And el usuario ingresa su "email" y "password"
    And el usuario clickea el boton +
    And el usuario clickea sobre el boton Manual

  @RegistroConHoras @Smoke
  Scenario Outline: El usuario crea un nuevo registro de horas trabajadas
   # Given el usuario elige una <fecha>
    And el usuario clickea el boton Start y setea una hora de <inicio> con sus <minutos>
    When el usuario clickea el boton End y setea una hora de <cierre> con sus <minutos>
    And el usuario nombra el time entry <nombre>, elige un proyecto, elige una task, le asigna un tag, marca si es "billiable" y clickea el boton Save
    Then se crea un nuevo time entry

    Examples:
      | #fecha      | inicio | minutos | cierre | nombre       |
      | #13/09/2024 | 09     | 00      | 18     | LippiaMobile |

  @RegistroConFecha @Smoke
  Scenario Outline: Creo un nuevo registro de horas trabajadas pero modificando la fecha desde el calendario
    Given el usuario elige una <fecha>
    And el usuario clickea el boton Start y setea una hora de <inicio> con sus <minutos>
    When el usuario clickea el boton End y setea una hora de <cierre> con sus <minutos>
    And el usuario nombra el time entry <nombre>, elige un proyecto, elige una task, le asigna un tag, marca si es "billiable" y clickea el boton Save
    Then se crea un nuevo time entry

    Examples:
      | fecha      | inicio | minutos | cierre | nombre       |
      | 13/09/2024 | 09     | 00      | 18     | LippiaMobile |

  @RegistroCancelado @Smoke
  Scenario Outline: Creo un nuevo registro de horas trabajadas pero modificando la fecha desde el calendario
    Given el usuario elige una <fecha>
    And el usuario clickea el boton Start y setea una hora de <inicio> con sus <minutos>
    When el usuario clickea el boton End y setea una hora de <cierre> con sus <minutos>
    And el usuario nombra el time entry <nombre>, elige un proyecto, elige una task, le asigna un tag, marca si es "billiable" y clickea el boton Cancel
    Then no se crea un nuevo time entry

    Examples:
      | fecha      | inicio | minutos | cierre | nombre       |
      | 13/09/2024 | 09     | 00      | 18     | LippiaMobile |
