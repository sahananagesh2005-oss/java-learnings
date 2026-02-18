@echo off
REM compile java sources into bin including jars in lib
IF NOT EXIST bin mkdir bin
javac -cp "lib/*" -d bin src\*.java
echo Compile exit code: %ERRORLEVEL%
pause
