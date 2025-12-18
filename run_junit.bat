@echo off
setlocal

set LIB_DIR=lib
if not exist "%LIB_DIR%" mkdir "%LIB_DIR%"

set JUNIT_JAR=%LIB_DIR%\junit-4.13.2.jar
set HAMCREST_JAR=%LIB_DIR%\hamcrest-core-1.3.jar

if not exist "%JUNIT_JAR%" (
    powershell -Command "Invoke-WebRequest -Uri 'https://search.maven.org/remotecontent?filepath=junit/junit/4.13.2/junit-4.13.2.jar' -OutFile '%JUNIT_JAR%'"
)

if not exist "%HAMCREST_JAR%" (
    powershell -Command "Invoke-WebRequest -Uri 'https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar' -OutFile '%HAMCREST_JAR%'"
)

if not exist src (
    echo Pasta src nao encontrada.
    exit /b 1
)

if not exist test (
    echo Pasta test nao encontrada.
    exit /b 1
)

if exist out rmdir /s /q out
mkdir out

javac -cp ".;%JUNIT_JAR%;%HAMCREST_JAR%" -d out src\*.java test\*.java
if errorlevel 1 (
    echo Erro na compilacao.
    exit /b 1
)

java -cp "out;%JUNIT_JAR%;%HAMCREST_JAR%" org.junit.runner.JUnitCore JantarTest

endlocal


