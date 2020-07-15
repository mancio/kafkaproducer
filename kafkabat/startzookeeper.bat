@ECHO OFF

ECHO Welcome to zookeeper server. To start specify the folder path where bin folder is located:

SET /P _inputname= Please enter an input:

cd %_inputname%

@ECHO Starting zookeeper

bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties



