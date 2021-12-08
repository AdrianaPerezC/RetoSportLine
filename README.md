# SportLine

Prueba de Automatización con [Selenium](https://www.selenium.dev/) y [Cucumber](https://cucumber.io/tools/cucumber-open/)

SportLine es una tienda de Deporte para la compra en linea calzado, ropa y accesorios. En este ejercicio se automatiza las pruebas en la búsqueda de artículos en la página https://sportline.com.co/.

## ¿Qué herramientas son utilizadas en la automatización?

Como primer herramienta de automatización de prueba tenemos a **Selenium**, que es un entorno de pruebas de software para aplicaciones basadas en la web. Permite operaciones automatizadas como escribir, hacer clic y seleccionar desde un menú desplegable de la página web. **Cucumber** es una herramienta utilizada para implementar metodologías como **BDD (Behaviour Driven Development)** las cuales permiten ejecutar descripciones funcionales escritas en texto plano como pruebas de software automatizadas. En lenguaje **Gherkin**, usualmente, estas pruebas se van a guardar en archivos “.feature”. 

## Estructura del proyecto:

![](https://user-images.githubusercontent.com/50307550/145244167-e13681dc-a4b8-4849-9951-5e61799d9e55.png)

## SportLineBuscar.feature:

Contiene los escenarios existosos del escenario búsqueda de un producto en la página utilizando el lenguaje Gherkin.
![](https://user-images.githubusercontent.com/50307550/145243681-8aa099e5-f544-4c15-9caf-7d2fba9c086b.png)

## SportLineRunner:

Como Cucumber usa Junit , necesitamos tener una clase **SportLineRunner**. Esta clase usará la anotación de Junit @RunWith () , que le dice a JUnit cuál es la clase de corredor de prueba. Es un punto de partida para que Junit comience a ejecutar sus pruebas.
![](https://user-images.githubusercontent.com/50307550/145244165-47823406-d0c5-47fc-83f6-5b33f0c21c5b.png)

## SportLineStepDefinitions:

Gestiona los fragmentos de código definidos en el Given, Then, When de los escenarios de los archivos .feature escritos en lenguaje Gherkin. Cada método mapea las instrucciones del escenario:

![](https://user-images.githubusercontent.com/50307550/145245120-0c527c2d-ddc8-4494-9e73-e5916b7c691b.png)

En las clases de Java está estructurado en el proyecto:

## GoogleChromeDriver:

En la clase **GoogleChromeDriver** se crea y se inicializa un objeto WebDriver, el cual es una herramienta de código abierto para pruebas automatizadas de aplicaciones web en muchos navegadores. Proporciona capacidades para navegar a páginas web, entrada de usuarios, ejecución de JavaScript.

En el constructor de la clase se recibe como parámetro la url de la página a navegar:

![](https://user-images.githubusercontent.com/50307550/145252299-6b179e1f-c09d-44a5-ac00-2652422edecb.png)

## Excel:

En la clase **Excel** se leen los datos de un archivo excel en java, para cumplir esta funconalidad es necesario importar una librería que facilite y entienda estos formatos de los archivos. Para los archivos excel está la librería Apache POI, importada en el archivo **build.gradle**.

![](https://user-images.githubusercontent.com/50307550/145255632-26407605-5ac1-474a-b0fc-fe64ab2a40bc.png)

Clase **Excel.java**

![](https://user-images.githubusercontent.com/50307550/145252290-86204e28-59c0-40f9-b5a6-7e3c83e26c10.png)

### Estructura del archivo de excel

![](https://user-images.githubusercontent.com/50307550/145252540-59128baa-b462-4124-b683-6c657df4c03c.png)

## SportLinePage:

Page Object Model (POM) es un patrón de diseño, utilizado en la automatización de pruebas que crea un repositorio de objetos para los elementos de la interfaz de usuario web. En esta clase **SportLinePage** se identifican los elementos web indispensables para realizar la búsqueda de productos en la página, para ello se cuentan con tres variables *txtBuscador*, *btnElementoBusqueda*, *txtElementoBusqueda*. 

![](https://user-images.githubusercontent.com/50307550/145252285-b18dce2b-95b8-4f76-a34e-4cda8d0438e7.png)

## SportLineSteps:

En esta clase se codifican los métodos necesarios para cumplir con los pasos indicados en el archivo **SportLineBuscar.feature**. 
- En la primer función llamado **abrirPagina** por medio de GoogleChromeDriver se abre el navegador con la url indicada. 
- En la segunda función **cargardatos**, en el cual se llama al método de la clase Excel para cargar la lista de productos a buscar y se guardan en la variable **listaProductos**.
- En la función **buscarYValidarElementosEnSportLine**, permite validar que todos los productos listados en el excel se muestren en pantalla al buscarlos en la página SportLine. **Nota:** Al llamar la función Assert.assertEquals, se pasan los dos valorestipo texto (String) a cadenas sin espacios.
![](https://user-images.githubusercontent.com/50307550/145252278-e397e7b5-2a78-47aa-a7aa-198559adee08.png)

Elaborado ⌨️ por [Adriana Pérez ](https://github.com/AdrianaPerezC )






