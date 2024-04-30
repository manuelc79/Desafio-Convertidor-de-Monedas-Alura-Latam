# Desafio-Convertidor-de-Monedas-Alura-Latam
Challenge One - Convertidor de monedas Consumiendo una API - Alura One Java Bak End
---
Título: Conversor de Monedas <br>
Autor: Cespedes Jesús Manuel <br>
Fecha 04-2024
---

## Descripción
Un conversor de monedas simple y eficiente construido en Java, que utiliza la API de ExchangeRate-API para obtener las tasas de cambio actuales. Este proyecto permite a los usuarios convertir entre diferentes monedas utilizando las tasas de cambio en tiempo real.

### Requisitos
Java Development Kit (JDK) 11 o superior.
IntelliJ IDEA o cualquier otro IDE de Java.
Acceso a Internet para consumir la API de ExchangeRate-API.
Gson
### Configuración del Entorno
Asegúrate de tener instalado JDK 11 o superior. Puedes verificar su versión de Java ejecutando ___java -version___ en la terminal.

#### Creación del Proyecto: 
Importación de la Biblioteca Gson:
Abre tu proyecto en IntelliJ.
Haz clic derecho sobre la carpeta del proyecto en el panel izquierdo.
Selecciona "Open Module Settings" en el menú contextual.
Ve a la pestaña "Dependencies".
Haz clic en el signo "+" en la esquina inferior izquierda y elige "Library".
Busca "gson" en el cuadro de búsqueda.
Selecciona la versión de Gson que desees utilizar.
Haz clic en "OK" para cerrar la ventana.

#### Obtener la Clave de API:
Regístrate en ExchangeRate-API para obtener una clave de API gratuita.
Guarda tu clave de API en un lugar seguro para su uso en el proyecto.

![Badge-Conversor](https://github.com/manuelc79/Desafio-Convertidor-de-Monedas-Alura-Latam/assets/34587375/c90ef95a-7432-466f-9db9-fc185a7473e6)

#### Uso del Conversor de Monedas
Desde el menu de opciones debe elegir cual par de monedas desea cambiar, después debe ingresar el monto a convertir y el sistema devolverá el valor del cambio de divisa.
En la opción 7 se debe ingresar la nomenclatura de las monedas que desea cambiar, este debe ser ingresado segun la norma ISO 4217 por ejmplo USD, ARS, COP, BRL etc
