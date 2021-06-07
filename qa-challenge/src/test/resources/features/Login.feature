Feature: Como usuario nuevo deseo poder Loguearme en la web de manera satisfactoria

  Scenario: Login Exitoso
    Given Cargo Pagina de Login
    When Ingreso datos del Usuario previamente registrado para el Login obligatorios email y password
    Then Login Exitoso con mensaje