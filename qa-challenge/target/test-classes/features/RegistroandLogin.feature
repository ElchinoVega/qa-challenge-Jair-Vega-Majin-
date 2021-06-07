Feature: Como usuario nuevo deseo poder registrarme en la web y poder loguearme de manera satisfactoria

  Scenario: Registro Exitoso
    Given Cargo Pagina de Registro
    When Ingreso datos del Usuario obligatorios email y password
    Then Registro de Usuario Exitoso


#  Scenario: Login Exitoso
#    Given Cargo Pagina de Login
#    When Ingreso datos del Usuario previamente registrado para el Login obligatorios email y password
#    Then Login Exitoso con mensaje

