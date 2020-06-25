# LSN_Task1

##Założenia:
- aplikacja będzie czytać dane z pliku;
- aplikacja oczekuje zwalidowanych danych (nie waliduje pliku wejściowego);
- aplikacja oczekuje danych wejściowych w formacie: 
```
1 10 20 20 2 5
```
- przykładowew dane wyjściowe:

```
1 2 5 10 20
count: 6
distinct: 5
min: 1
max: 20
```

##Uruchomienie
- projekt maven'owy, zbudować przez:

```mvn clean install```
- uruchomić zbudowanego jar'a przekazując jako parametr ścieżke do pliku, na przykład:

``` java -jar target\t1-1.0-SNAPSHOT.jar C:\_WORK\LOGISFERA_NOVA\t1_test.txt```