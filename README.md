Sample1
=======
Online system to Create,Read,Update,Delete(CRUD) patient records.

Prerequisites
=============
JDK 1.5 or higher, Apache Tomcat 6+ or J2EE compatible server, MSSQL Server 2008

Technologies
============
Java 1.5 +
Apache Tomcat 6+
MSSQL
Ant
Log4j

Initializing Database
======================
MSSQL Server:
 Assume the MSSQL Server is running on local machine under port 1433
 Database configuration is stored on src\com\bsharp\sample1\dao\impl\JDBCManager, You can change as you wish.
 Sql script is stored on resources/script.sql,Execute the script to create database and tables.
 
Tomcat Server Deployment
========================
Assume tomcat is up and running on your local machine.
From the project root folder , run the follwoing Ant command                   

[Project root]>ant

Note: You can change Build.xml in order to change tomcat configuration
After deploying succefully , you can access the application using follwoing URL
http://[yourTomcatHost]:[port]/DemoMVC

Project Structure 
==================
Project has done using MVC architecture.MVC Pattern isolates the application logic from the user interface layer 
and supports separation of concerns. Here the Controller receives all requests for the application and then works 
with the Model to prepare any data needed by the View. The View then uses the data prepared by the Controller to 
generate a final presentable response.
So even though current project has connected to MSSQL Server but it can be changed to any other database.
