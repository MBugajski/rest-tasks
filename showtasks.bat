call runcrud
if "%ERRORLEVEL%" == "0" goto startdefault
echo.
echo. Cannot start the server
goto fail

:startdefault
start http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL%" == "0" goto startchrome
echo.
echo. Cannot start default browser
goto fail

:startchrome
start chrome http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL%" == "0" goto end
echo.
echo. Cannot start chrome
goto fail

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.