@ECHO OFF

ECHO Welcome to kafka server. To start specify the folder path where bin folder is located:

SET /P _inputname= Please enter an input:

cd %_inputname%


@ECHO Starting kafka

bin\windows\kafka-server-start.bat .\config\server.properties
