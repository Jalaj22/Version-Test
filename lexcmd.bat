set location=E:\Selenium java program\BatchProject

cd %location%

e:

set classpath=%location%\bin;%location%\lib\*;

java -cp org.testng.TestNG testng.xml

pause