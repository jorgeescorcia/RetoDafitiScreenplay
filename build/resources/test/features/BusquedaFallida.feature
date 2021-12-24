Feature: Probar las Busqueda en Dafiti

  Scenario: Buscar Productos en Dafiti
    Given Navego en Dafiti
    When Busco 'Tenis Gris adidas Performance GALAXY 5' los en Dafiti
    Then Obtengo y Valido los Resultados


  Scenario: Buscar Productos en Dafiti
    Given Navego en Dafiti
    When Busco 'Xiaomi RedmiNote 8' los en Dafiti
    Then Obtengo y Valido los Resultados
