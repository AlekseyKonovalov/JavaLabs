cd C:\lab1\sep6\bin
java -classpath C:\lab1\external;C:\lab1\sep6\lib\secret.jar; Hello

echo wscript.Sleep 30000>"%temp%\sleep30.vbs" 
cscript //nologo "%temp%\sleep30.vbs" 
del "%temp%\sleep30.vbs"