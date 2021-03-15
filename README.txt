*Se deberan descomprimir las carpetas que se encuentren con extension .zip*

Pruebas de Interfaz Grafica:

Para la ejecucion de pruebas de interfaz grafica se debe ingrear a la carpeta Katalon_Studio_Windows_64-7.9.1 donde se encuentran dos carpetas, la primera es "Katalon_Studio_Windows_64-7.9.1" y la segunda carpeta es "Renfe.com", se debe abrir la primer carpeta donde se encuentra todo lo referente al IDE, para empezar a ejecutar el framework se debe seleccionar el archivo "katalon.exe", se abrira katalon studion el cual sirve para ejecutar las pruebas de interfaz. para poder abrir el ejemplo de una prueba de interfaz se debe seleccioanr en la parte superiro izquierda en la barra la opcion "File / Open Project" donde abrira una ventana emergente, para seleccioanr la carpeta donde esta el ejemplo de la prueba se debe direccionar a la carpeta que descargo del repositorio en la direccion de "Katalon_Studio_Windows_64-7.9.1" y se debe seleccionar la carpeta Renfe.com y dar clic en el boton de Seleccioanr Carpeta. automaticamente se cargara el proyecto, ahora en la parte izquierta se seleccioan el item de "Test Cases / Viajar / Gestiona tu billete" donde aparece el test case que se debe abrir, para ejecutar el test case, en la parte superiror aparecera una flecha de color verde, a la cual se debera seleccinar y automaticamente ejecutara el test case en Crhome predeterminadamente.(se debera espera un momento mientras se ejecuta en pantalla el test case autoamticamente) una vez finalizado el test case de manera exitosa se mostrara el status en la barra de "Job Progress".

Pruebas de Carga y Stress:

Para la ejecucion de las pruebas de carga y stress se debe dirigir a la carpeta de apache-jmeter-5.4.1 donde se encontrara con dos carpetas, la primera "apache-jmeter-5.4.1" que es donde se encuentra la aplicacion Jmeter la cual ejecutara las pruebas de carga y stress y la segunda carpeta que "Tests" donde se encuentran las pruebas de carga y stress, para poder emepzar la ejecusion debemos seleccioanr la primer carpeta donde se encuentra Jmeter, al abrir la carpeta se debe seleccionar la carpeta "bin" y por ultimo seleccionar el archivo "ApacheJMeter.jar" y se abrira la interfaz de Jmeter, para poder abrir el archivo de pruebas se debera seleccionar en la parte superior izquierda el item "Archivo" y "abrir", se abirira una ventana emergente donde se debera seleccioanr la carpeta que se ha descargado del repositorio, la carpeta "apache-jmeter-5.4.1", despues la carpeta "Tests" y por ultimo el archivo "Renfe.com.jmx". En la parte izquierda se mostrara los siguientes items organizados de la siguiente manera:

* Renfe.com
  - Inicio Secion (se podra colcoar la cantidad de hilos, el periodo de ejecucion en segundos y la cantidad de bucles)
    - Recording Controller (En esta seccion se podra mostara un hilo de peticiones)
    - view results tree (Se mostrara el status de las peticiones ejecutadas)
    - summary report (Se mostrara la una tabal con los datos durante la ejecucion)
    - Graph Results (Se mostrara una grafica que se realizo durante la ejecucion)
* HTTP(s) test Script Recorder
  - View Results Tree

Para ejecutar el test se podra hacer dando clic en el boton "play" (flecha de color verde) que aparece en la barra superior, para poder visualizar los resultados se podran consultar en los items (view results tree, summary report y Graph Results).


