
## Developing Web App "DataBase for Resumes"
  -  Use: Java 8, <a href="https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016-trends/#java-ides-adoption">IntelliJ IDEA</a>,
    <a href="https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016-trends/#java-vcs-adoption">GitHib/Git</a>, Servlets, JSP, JSTL, Tomcat, JUnit, PostgreSQL, GSON, JAXB
  - Means of store
     -  arrays, sorted arrays, list and associative array (Map)
     -  in the file system (File API и <a href="http://www.quizful.net/post/java-nio-tutorial">Java 7 NIO File API</a>)
        - in the standard and custom Java serialization
        - using JSON (<a href="https://github.com/google/gson">Google Gson</a>)
        - using XML (<a href="https://ru.wikipedia.org/wiki/Java_Architecture_for_XML_Binding">JAXB</a>)
     -  Relational database <a href="https://ru.wikipedia.org/wiki/PostgreSQL">PostgreSQL</a>
  -  deploy
     - to the servlet container <a href="http://tomcat.apache.org/">Tomcat</a>
     - to the cloud service <a href="https://www.heroku.com/">Heroku</a>

This application was being developed through the series of lessons listed below and based on its contents:
**Object model, collection, input-output system, working with files, serialization, working with XML, JSON, SQL, PostgreSQL, servlets, HTML/JSP/JSTL, web-container Tomcat, module tests JUnit, java.util.Logging,  Git.**



### Lesson 1
 - [Project presentation](lesson/lesson1.md#-Вебинар-ПРЕЗЕНТАЦИЯ-обучения)
 - [App development](lesson/lesson1.md#-1-Разработка-ПО)
 - [review Java](lesson/lesson1.md#-3-Обзор-языка-java)
 - [Version control systems. Git](lesson/lesson1.md#-4-Системы-управления-версиями-git)
 - [First home work](lesson/lesson1.md#Домашнее-задание-hw1)

### Lesson 2
 - [OOP foundation](lesson/lesson2.md#Принципы-ООП)
 - [Memory structure: heap, stack, registers, constants](lesson/lesson2.md#Структура-памяти-куча-стек-регистры-константы)
 - [data types. packets](lesson/lesson2.md#Типы-данных-Пакеты)

### Lesson 3
 - [Object model in Java ](lesson/lesson3.md#Объектная-модель-в-java)
 - [Algorithm complexity](lesson/lesson3.md#Сложность-алгоритмов)
 - [Programming patterns template method](https://github.com/JavaOPs/JavaSE-Web/blob/master/lesson/lesson3.md#Паттерн-проектирования-Шаблонный-метод)
 
### Lesson 4
 - [works with strings](lesson/lesson4.md#Работа-со-строками)
 - [exceptions](lesson/lesson4.md#Исключения)
 - [Reflection. Annotetions. Module testing](lesson/lesson4.md#reflection-Аннотации-Модульное-тестирование)

### Lesson 5
 - [Containers/Collections](lesson/lesson5.md#Контейнерыколлекции)
 
### Lesson 6
 - [Iterator / Iterable. Inner, Nested, Local classes](lesson/lesson6.md#iterator--iterable-Вложенные-внутренние-локальные-и-анонимные-классы)
 - [whats new in Java 8](lesson/lesson6.md#Новое-в-java-8)

### Lesson 7
 - [Параметризация. Стирание типов](lesson/lesson7.md#Параметризация-Стирание-типов)
 - [Логирование](lesson/lesson7.md#Логирование)
 - [Синглетон, Enum](lesson/lesson7.md#Синглетон-enum)

### Lesson 8
 - [Работа с датами и временем](lesson/lesson8.md#Работа-с-датами-и-временем)
 - [Работа с файлами и ресурсами](lesson/lesson8.md#Работа-с-файлами-и-ресурсами)

### Lesson 9
 - [Ввод/вывод](lesson/lesson9.md#Вводвывод)
 - [Сериализация](lesson/lesson9.md#Сериализация)
 - [NIO](lesson/lesson9.md#nio)
 - [Основы Java 8 Stream API](lesson/lesson9.md#Основы-java-8-stream-api) 

### Lesson 10
 - [Формат XML. Работа с XML в Java](lesson/lesson10.md#Формат-xml-Работа-с-xml-в-java)
 - [JSON](lesson/lesson10.md#json)
 - [DataInputStream / DataOutputStream](lesson/lesson10.md#datainputstream--dataoutputstream)

### Lesson 11
 - [Многопоточность. Параллельное выполнение.](lesson/lesson11.md#Многопоточность-Параллельное-выполнение)
 - [Потоки. Синхронизация](lesson/lesson11.md#Потоки-Синхронизация)
 - [Ленивая инициализация, JMM](lesson/lesson11.md#Ленивая-инициализация-jmm)
 
### Lesson 12
 - [java.util.concurrent](lesson/lesson12.md#javautilconcurrent)

### Lesson 13
 - [Базы данных. Реляционные СУБД. PostgreSQL](lesson/lesson13.md#Базы-данных-Реляционные-СУБД-postgresql)
 - [Конфигурирование данных в Java проекте](lesson/lesson13.md#Конфигурирование-данных-в-java-проекте)
 - [Подключение DB в проект](lesson/lesson13.md#Подключение-db-в-проект)

### Lesson 14
 - [JOIN](lesson/lesson14.md#join)
 - [Транзакции](lesson/lesson14.md#Транзакции)
 - [Установка/запуск Tomcat](lesson/lesson14.md#Установказапуск-tomcat)

### Lesson 15
 - [HTML, Tomcat](lesson/lesson15.md#html-tomcat)
 - [Сервлеты](lesson/lesson15.md#Сервлеты)
 
### Lesson 16
 - [JSP](lesson/lesson16.md#jsp)
 - [JSTL](lesson/lesson16.md#jstl)
 
### Lesson 17
 - [Деплой в Heroku](lesson/lesson17.md#Деплой-в-heroku)
 - [Classloader](lesson/lesson17.md#classloader)
 - [Обзор Java Enterprise](lesson/lesson17.md#Обзор-java-enterprise)

## recomended books  
- <a href="http://myflex.org/books/java4kids/java4kids.htm">YAKOV FAIN: Программирование на Java для начинающих</a>
- <a href="https://habrahabr.ru/post/153373/">Книги по Java: от новичка до профессионала</a>
- <a href="http://scanlibs.com/java-effektivnoe-programmirovanie-2-e-izdanie">Джошуа Блох: Java. Эффективное программирование, 2-е издание</a>
- <a href="http://www.labirint.ru/books/87603/">Гамма, Хелм, Джонсон: Приемы объектно-ориентированного проектирования. Паттерны проектирования</a>
- <a href="http://www.bookvoed.ru/book?id=639284">Редмонд Э.: Семь баз данных за семь недель. Введение в современные базы данных и идеологию NoSQL.</a>

##  useful resources
- [Руководство по Java Core](http://proselyte.net/tutorials/java-core/)
- [Java. Базовый курс](https://stepik.org/course/Java-Базовый-курс-187)
- <a href="http://www.intuit.ru/studies/courses/16/16/info">intuit: Программирование на Java</a>
- <a href="http://sernam.ru/book_java.php">Основы программирования на Java: учебное пособие</a>
