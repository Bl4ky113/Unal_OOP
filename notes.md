# Universidad Nacional de Colombia
# Programación Orientada a Objetos

Create maven project:
With a given pom.xml
$ mvn install

Run maven from the terminal:
$ mvn compile
$ mvn exec:java -Dexec.mainClass=orgId.folder.Class -d

Student
	+ classes
	+ name
	+ age
	+ addClass(Class)
Class
	+ name
Relation Asosiación
	_ Main


Printer
	+ imprimir(Document)
Document
	- contenido
	+ getContenido()
Relationship Dependency
	+ Main
