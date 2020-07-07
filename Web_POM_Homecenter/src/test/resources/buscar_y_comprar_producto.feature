#language:es
Característica: Compra de un articulo

  Esquema del escenario: Buscar y agregar un articulo al carrito de compras
    Dado que estoy en la pagina de homcenter
    Cuando busco la siguiente palabra:
      | <Producto> |
    Y selecciono el siguiente articulo:
      | <ProductoEnStock> |
    Y lo agrego al carrito de compra
    Entonces valido en el carro de compras aparezca el producto seleccionado
      | <ProductoEnCarrito> |

    Ejemplos:
      | Producto | ProductoEnStock                         | ProductoEnCarrito                     |
      | Sofa     | Sofá Murano 2 Puestos 155x89x76 cm Gris | Sofá Murano 2 Puestos 155x89x76 cm... |