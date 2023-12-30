# 5th Homework of the Java Test Automation Course (2nd block) - Solvd Laba
This repository stores the 5th homework given by our mentor in the 2nd block of 
the Java Test Automation Course at Solvd Laba. It consists in creating an XML
file for 5 classes following their appropriate structure and after create an
XSD file to validate those structures. After, we had to choose between the DOM,
SAX and Stax parsers to parse one of the XML files into a Java object. 

## Explanation

To accomplish the requirements of the homework, I've created two folders
named 'xml' and 'xsd' in the resources' folder. Then, I created the suitable
XML file for the classes Animal, AnimalRoom, Customer, Person and Zoo. After,
in order to validate these structures, I created an XSD for each XML. Finally,
 I chose the SAX parser to convert the zoo.xml file into a Zoo Java object.
Please, notice that I created a package named 'utils' to store a class named
ZooSAXHandler, that is necessary to work with the SAX parser.

## What did I learn?

Doing this homework I learned further about the XML format and its elements.
Also, I didn't know the existence of XSD to validate these XML files nor how
the structure had to be defined in them, but now I'd say that I know how to
make XSD validators manually. The last thing I learned about was the XML parser
that are built-in in Java such as DOM, SAX and Stax and the differences between
them. I used only SAX to convert an XML file into a Java object and was kind of
hard at first, but then I could figure out how the handler works, because I think
it is the most complicated part of this parser.

## Technologies

- Java
- Maven
- MySQL
- JDBC
- MyBatis
- XML, XSD, SAX Parser

## Set-Up

To run this project you will need an updated version of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and, finally, run the 
Main.java file to see the program output.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
