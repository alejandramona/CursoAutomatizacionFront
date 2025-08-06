Feature: Yo como usuario,
  quiero completar el formuario de DemoQA
  y válidar el funcionaiento

  @RegisterDemoQA
  Scenario Outline: Registrarse en DemoQA
    Given Accedo a la Pagina de DemoQA
    When Completo los campos de manera correcta <nombre>
    Then Valido que se envie de manera correcta

    Examples:
    |nombre|
    |'Leonardo'|