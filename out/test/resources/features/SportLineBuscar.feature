Feature: HU-001 Buscador SportLine
  Yo como usuario de SportLine
  quiero buscar un producto en la plataforma
  para ver la descripción del producto

  Scenario: Buscar producto
    Given Dado que me encuentro en la página de SportLine
    When busque el nombre del producto
    Then puedo ver el producto en pantalla



