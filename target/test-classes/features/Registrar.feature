@CrearCuentaCorreo
Feature: Realizar Creacion de Cuenta de Correo

  @Scenario:CrearCuenta
  Scenario: Crear Cuenta Con datos Validos
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta Con mis datos personales
    	And Un passwd correcto
    Then Validar que la cuenta se pueda Crear
