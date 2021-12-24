# Coronavirus Data Analysis With Machine Learning

Segundo Proyecto del Curso Organización  de Lenguajes y Compiladores 2 

Vacaciones de Diciembre 2021

Ing. Luis Fernando Espino Barrios

Aux. Haroldo Pablo Arias Molina

## Tabla de Contenido
1. [Resumen](#resumen)
2. [Conceptos Generales](#General-Concept)
3. [Descripción](#descripción)
4. [Flujo de la Aplicación](#flujo)
5. [Restricciones y Entregables](#restricciones)
6. [Referencias](#referencias)

## Resumen <a name="resumen"></a>
<div style="text-align: justify">

Durante la emergencia sanitaria provocada por el COVID-19, se ha observado un notable incremento en la aplicación de nuevas tecnologías al campo de la salud y la investigación. Desde la creación de todo tipo de dispositivos inteligentes destinados a detectar el más mínimo síntoma indicativo de contagio, hasta el diseño de nuevos patrones de investigación en la cura del nuevo coronavirus.

Sin duda, la IA (Inteligencia Artificial) ha estado presente en todas y cada una de las etapas de esta pandemia, e incluso en momentos previos a ella. En este sentido, se trató de una startup canadiense –BlueDot- que, gracias a un algoritmo basado en inteligencia artificial, logró predecirlo.

Mediante el procesamiento y análisis de noticias de todos los países del mundo, junto con información relacionada con rutas de vuelos comerciales y brotes de enfermedades, pudieron predecir, no solo la existencia de una enfermedad potencialmente pandémica, sino también el epicentro de la enfermedad. Así mismo, como su trayectoria más inmediata.

Así, la aplicación de la IA en esta pandemia global ha supuesto un antes y un después en el campo epidemiológico, ya que no solo ha permitido establecer un mayor control sobre la propagación del virus, sino que ha participado activamente en el diagnóstico, tratamiento. e investigación para poner fin a este brote lo antes posible.

En la actual pandemia que vive el mundo, el COVID-19 ha tenido grandes variaciones y tiende a ser engañoso debido a las nuevas olas derivadas del relajamiento social, las nuevas variantes y mutaciones que tenido el virus, asi tambien hoy en día existen varios factores que dificultan las comparaciones entre países, existen diferencias de una nación a otra, así como casos no detectados o reportados de la enfermedad, además existen diferentes tipos de pruebas, estrategias de detección, pero esto está limitado por las diferentes definiciones y formas de clasificación, como casos leves o asintomáticos que no son habitualmente contabilizados, porque no se reportan, por lo que la calidad de la atención también puede ser determinante, aun así es importante contar con modelos con los que sea posible predecir el comportamiento de la enfermedad de tal manera que se puedan tomar medidas preventivas en el a nivel poblacional para evitar el contagio, así como un mayor cuidado con las personas de alto riesgo, en dichos procesos de características y factores determinantes, diferentes características de los pacientes en los diferentes análisis realizados a lo largo del siguiente informe, edad, sexo, nacionalidad, entre otros.

A continuación se tratará de cómo ha evolucionado la pandemia del covid-19 desde el primer día que llegó a Guatemala y a algunos países de América, como Honduras, Costa Rica, Estados Unidos, e incluso una comparativa con países del otro lado del mundo como China. abordando preguntas sobre la tasa de mortalidad, número de personas infectadas por día, porcentaje de muertes según casos activos, porcentajes de vacunación, entre otros.

Todos los datos recopilados y mostrados han sido extraídos de las bases de datos públicas de cada país que rastrean esta información. Con esta información y utilizando el lenguaje de programación Python y su biblioteca Sckit-learn, es posible analizar y predecir los datos que se mostrarán a continuación.
</div>

## Conceptos Generales <a name="General-Concept"></a>
### Predicción de datos con Python
<div style="text-align: justify">
Entre los lenguajes de programación, Python es conocido como aquel que logra dominar todas las estadísticas, relacionadas con la minería de datos e incluso el aprendizaje automático, es software libre, por lo que muchas personas han podido usarlo para desarrollar sus soluciones dando un lugar que ha Bibliotecas muy interesantes donde se pueden encontrar casi todas las técnicas de machine learning que existen actualmente, por supuesto, tiene su parte negativa, y es que derivada del hecho de que muchas personas han aportado, tiene su sintaxis específica para cada caso, lo que hace aprendizaje un poco complejo.

Actualmente existe una solución muy viable, ya que Scikit-learn consiste en ser una estandarización conformada en una librería de código abierto, que intenta unificar en un mismo contexto todos los algoritmos y funciones posibles, ayudando en gran medida las fases de preprocesamiento, entrenamiento, optimización y validación. de los diferentes métodos predictivos utilizados.

Scikit-learn da la posibilidad de tener una gran cantidad de opciones de procesamiento de datos, de las cuales solo algunas serán utilizadas a lo largo de este informe, pero se recomienda poder buscar la documentación de esta herramienta que es muy útil para realizar este tipo. de predicciones como las que se encuentran a lo largo del documento.
Un factor que hay que tener en cuenta respecto a la citada biblioteca es su alto nivel de madurez, con el que logra definir modelos predictivos que incluso se utilizan en producción, por lo que se toma como base para el desarrollo de las diferentes soluciones, encuentra se centrará en la metodología de regresión lineal.
</div>

### Regresión lineal
<div style="text-align: justify">
Este modelo de predicción se basa en la posibilidad de calcular una línea recta que se acomode en la mayor medida posible a las diferentes muestras que se identifican dentro de la población que se toma para el análisis.

La forma de calcularlo se basa en que la regresión lineal se enfoca en definir los parámetros que se encuentran o caracterizan una función lineal, y = mx + b, de tal forma que los errores cuadráticos en la medición que se realizan, pueden ser eliminado hasta cierto punto. A la línea definida por la función descrita anteriormente, minimizando la distancia de cada médico a la línea, manualmente no es tan complejo, aunque el propósito de las diferentes soluciones que se presentan es realizar un modelo totalmente automatizado.

Los diferentes datos que se manejan en el informe no solo se tratan de esta forma, además en algunos casos no se tienen en cuenta solo 2 dimensiones para extraer alguna información, pero cuando se trata de datos tridimensionales, muchas veces es preferible optar para un Gradiente Descendente, el cual itera para poder seguir el proceso anterior, de tal manera que se encuentre la línea que mejor se ajuste al contorno definido por las muestras seleccionadas, lo que le otorga un mayor dato computacional, se usa frecuentemente en multidimensional casos.
</div>

### Medida de error
<div style="text-align: justify">
Como parte fundamental de los modelos con los que se definirá la información es que cuando existen problemas de esta naturaleza, ya sea machine learning o incluso ciencia de datos, en muy raras ocasiones son exactos, principalmente si se trata de la predicción del avance. de un virus patológico, ya que los resultados que se producen son probables, suelen ser estimaciones, esta razón da como resultado que siempre debe existir algún mecanismo que pueda evaluar la variación que existe y se da a lo largo de los cálculos realizados, claro está para saber los resultados que se están presentando como su precisión, y que estos puedan ser objetiva y cuantificablemente comparables, aplicando otros métodos adicionales que puedan sustentar en función de sus características hacia el comportamiento del conjunto de datos.
</div>

## Descripción <a name="descripción"></a>
<div style="text-align: justify">
Esta aplicación tendrá como objetivo principal que un usuario pueda generar distintos análisis de información basados de un origen de datos (un archivo en Excel) y diferentes variables que se deberán configurar dentro del sistema según sea el ánalisis a realizar.

La aplicación deberá ser capaz de poder analizar y predecir lo siguiente:

- Tendencia de la infección por Covid-19 en un País.
- Predicción de Infertados en un País.
- Indice de Progresión de la pandemia.
- Predicción de mortalidad por COVID en un Departamento.
- Predicción de mortalidad por COVID en un País.
- Análisis del número de muertes por coronavirus en un País.
- Tendencia del número de infectados por día de un País.
- Predicción de casos de un país para un año.
- Tendencia de la vacunación de en un País.
- Ánalisis Comparativo de Vacunaciópn entre 2 paises.
- Porcentaje de hombres infectados por covid-19 en un País desde el primer caso activo
- Ánalisis Comparativo entres 2 o más paises o continentes.
- Muertes promedio por casos confirmados y edad de covid 19 en un País.
- Muertes según regiones de un país - Covid 19.
- Tendencia de casos confirmados de Coronavirus en un departamento de un País.
- Porcentaje de muertes frente al total de casos en un país, región o continente.
- Tasa de comportamiento de casos activos en relación al número de muertes en un continente.
- Comportamiento y clasificación de personas infectadas por COVID-19 por municipio en un País.
- Predicción de muertes en el último día del primer año de infecciones en un país.
- Tasa de crecimiento de casos de COVID-19 en relación con nuevos casos diarios y tasa de muerte por COVID-19
- Predicciones de casos y muertes en todo el mundo - Neural Network MLPRegressor
- Tasa de mortalidad por coronavirus (COVID-19) en un país.
- Factores de muerte por COVID-19 en un país.
- Comparación entre el número de casos detectados y el número de pruebas de un país.
- Predicción de casos confirmados por día

 </div>

### **Componentes de la aplicación:** 
<div style="text-align: justify">
Se requiere la implementación de una Aplicación Web que permita el ánalisis de la información, y con esta poder terminar diferentes parametros de medición y configuración para desplegar gráficas y resultados de forma agradable y de fácil entendimiento para el usuario.
 </div>

#### **Componentes de la aplicación:** 
    Características básicas 
    •	Carga de Archivo de Datos
    •	Sección de Pametrización de Variables 
    •	Sección de Salidas de Reportes y Estadisticas.

#### **Mensajes:**
<div style="text-align: justify">
Los mensajes son un área especial dentro de la aplicación, con los cuales nos podrá indicar las notificaciones de errores, advertencias o mensajes satisfactorios que se produjeron durante el proceso de análisis de un archivo de entrada. 
 </div>

## Flujo de Aplicación <a name="flujo"></a>
<div style="text-align: justify">

</div>

## Restricciones y Entregables <a name="entregables"></a>
<div style="text-align: justify">

</div>

## Referencias  <a name="referencias"></a>

- Supervised learning — scikit-learn 0.23.2 documentation. (s. f.). Scikit Learn. Retrieved November 08, 2020, https://scikit-learn.org/stable/supervised_learning.html#supervised-learning
- C. (s. f.). CSSEGISandData/COVID-19. GitHub. Retrieved November 08, 2020, https://github.com/CSSEGISandData/COVID-19
- MLPRegressor — scikit-learn documentation. (s. f.). Scikit Learn. Retrieved November 13, 2020, https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html
- A Beginner’s Guide to Neural Networks in Python. Retrieved November 13, 2020, https://www.springboard.com/blog/beginners-guide-neural-network-in-python-scikit-learn-0-18/

- [scikit-learn - Machine Learning in Python](https://scikit-learn.org/stable/)

- [k-means in python - Step by step](https://www.aprendemachinelearning.com/k-means-en-python-paso-a-paso/)

- [Machine Learning - k-means](http://kunusoft.com/slides/ia1/ia109_ml3/index.php?pic=3)

- [Undestanding regression](https://towardsdatascience.com/understanding-regression-using-covid-19-dataset-detailed-analysis-be7e319e3a50)

- [Online datasets](https://www.worldometers.info/coronavirus/)

- [Predicting Stock Price with LSTM ](https://towardsdatascience.com/predicting-stock-price-with-lstm-13af86a74944)