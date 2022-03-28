#Zadanie domowe 8

Dodaj loggery do zadania nr. 6.
Logback zawiera:
- Appender wyświetlający log na consoli w jsonie dla Errorów -> appender = JSON
- Appender zapisujący logi w formcie json do pliku .json -> appender = JSON_FILE
- Appender zapisujący logi w formcie xml do pliku .xml -> appender = XML_FILE
- Appender zapisujacy logi o levelu ERROR do pliku json -> appender = ERRORS_FILE
- Logi zapisywane w folderach im odpowiadających
- Wcięcia do logów w konsoli dla poprawienia ich widoczności (zamysłem jest stworzenie "drzewka" - DRIVER - TEST - METHOD, które będzie łatwe do odczytania)
- Zmiana patternu wyswietlanie w konsoli dla poszczegolnych klas/package (Klasa MultiLayoutPattern)
- Dodanie markera passed jeżeli test przeszedł (Klasa Marker Filter)
- Test do sprawdzania działania poszczególnych leveli loggerów i markera (LoggerTest)

#Zadanie domowe 6

Zakres: JUnit5 - dependencies, maven runner, Hamcrest matcher, Asercje JUnit, Selenium, WebDriverManager, Parametryzacja testów. 
 
Źródła: JUnit - https://junit.org/junit5/docs/current/user-guide/
Hamcrest:- http://hamcrest.org/JavaHamcrest/distributables
 
Zadanie domowe:
Stwórz zestaw 5 testów regresji w JUnit 5 w przeglądarce chrome. 

Każdy test wchodzi na 5 różnych stron www i sprawdza ich tytuł. Strony:

* https://siiportal.sii.pl/

* https://www.onet.pl/

* <s>http://kotuszkowo.pl/ - blog o kotach :-)</s>  -> https://psiedszkole.pl/ <b>psy > koty></b> :D 

* https://www.filmweb.pl/

* https://www.selenium.dev/documentation/en/webdriver/ - dokumentacja Selenium

Testy są sparametryzowane (parametrem jest tytuł strony). Każdy test z tagiem "regresja".

##Dodatkowo:

* wartości przekazywane są z pliku .csv

* przeglądarka odpalana w headless
