Feature: Login

  @LoginSuccessful
  Scenario Outline: Login
    Given El cliente ingresa a la pagina website
    When El cliente <usuario> y <contrasena>
    Then ver la cuenta <validtexto>
    Examples:
      | usuario       | contrasena   | validtexto |
      | standard_user | secret_sauce | casa   |
