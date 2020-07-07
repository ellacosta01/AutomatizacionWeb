#language: es
Característica: : Reservar un vuelo

  Antecedentes:
    Dado que el usuario se encuentra en la pagina web de despegar
    Cuando seleciona el tipo de vuelo
    Y define la ciudad de origen y la ciudad de destino
      | <Ciudad Origen> | <Ciudad Destino> |
    Y selecciona la fecha de ida, regreso, numero de pasajero y clase en la que va a viajar
      | <Fecha de ida> | <Fecha de regreso> | <Numero de pasajaeros> | <Clase> |
    Y selecciona buscar

  Esquema del escenario: Reservar un vuelo de Medellin a Bogotá Exitoso

    Cuando selecciona el vuelo en que va a viajar
    Y completa el formulario de pago y datos del pasajero
      | <Titular a facturar Nombre> | <Titular a facturar Apellido> | <Cedula del titular> | <Ciudad del titular> | <Dirección del titular> | <Nombres Pasajero> | <Apellidos Pasajero> | <Documento del pasajero> |  | <Email Titular> | <Confirmar Email Titular> | <Area Titular> | <Numero Titular> |

    Ejemplos:
      | Titular a facturar Nombre | Titular a facturar Apellido | Cedula del titular | Ciudad del titular | Dirección del titular | Nombres Pasajero | Apellidos Pasajero | Documento del pasajero | Email Titular       | Confirmar Email Titular | Area Titular | Numero Titular |
      | Ella                      | Acosta                      | 1234567891         | Medellin           | Calle 42 #103-39      | Ella Beatriz     | Acosta Pulgar      | 1987654321             | ella12345@gmail.com | ella12345@gmail.com     | 57           | 3214567897     |