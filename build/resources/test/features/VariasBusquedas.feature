Feature: Probar las busquedas en Dafiti

  Background:
    Given Navego en Dafiti


  Scenario Outline: Buscar Productos en Dafiti
    Given Navego en Dafiti
    When Busco <producto> los en Dafiti
    Then Obtengo y Valido los Resultados

    Examples:
      |producto|
      |'Tenis Gris adidas Performance GALAXY 5'|
      |'Priceshoes Tenis Media Priceshoes Deportivos Dama 522Medianegro'|
      |'Camisa Morado Nautica'|
      |'Camisa Blanco Polo Ralph Lauren'|
      |'Polo Morado Calvin Klein'|

  Scenario Outline: Buscar Productos en Dafiti
    Given Navego en Dafiti
    When Busco <producto> los en Dafiti
    Then Obtengo y Valido los Resultados
    Examples:
      |producto|
      |'Tenis Gris adidas Performance GALAXY 5'|
      |'Priceshoes Tenis Media Priceshoes Deportivos Dama 522Medianegro'|
      |'Camisa Morado Nautica'|
      |'Camisa Blanco Polo Ralph Lauren'|
      |'Polo Morado Calvin Klein'|