#language:es
Característica: : Buscar un vuelo

  Esquema del escenario: Buscar un vuelo de Medellin a Bogotá Exitoso
    Dado que el usuario se encuentra en la pagina web de despegar
    Cuando seleciona el tipo de vuelo
    Y define la ciudad de origen y la ciudad de destino
      | <Ciudad Origen> | <Ciudad Destino> |
    Y selecciona la fecha de ida, regreso, numero de pasajero y clase en la que va a viajar
      | <Fecha de ida> | <Fecha de regreso> | <Numero de pasajaeros> | <Clase> |
    Y selecciona buscar
    Entonces valido que aparezca el texto precios por aerolinea
      | <Precios por aerolineas> |

    Ejemplos:
      | Ciudad Origen       | Ciudad Destino     | Numero de pasajaeros | Clase     | Fecha de ida | Fecha de regreso | Precios por aerolineas |
      | Medellín, Antioquia | Bogotá, Bogotá D.C | 1                    | Económica | 01/09/2020   | 07/09/2020       | Precios por aerolínea  |