# Universidad Nacional de Colombia
# Programación Orientada a Objetos

Create maven project:
With a given pom.xml
$ mvn install

Run maven from the terminal:
$ mvn compile
$ mvn exec:java -Dexec.mainClass=orgId.folder.Class -d

## Abstract Class

They exist only to be used in inheritance. They can't create instances.
And it's child have to implement every abstract methods and properties.
It must atleast have 1 abstract method.

asbtract class Name {
	...
	privacy abstract return name (params);
}

UML Format: Italic text

## Interfaces 

It's a 'class' that ONLY HAS abstract methods, constants could be defined but no properties.
You can't inheritate an interface. You have to IMPLEMENT the interface

[public] interface Name [extends ...] {
	return default methods ();
	return static methods ();
}

UML Format: 
	---- |> Inheritance arrow with an empty top.
	interface in top, Italic and inside <<, >>>
	name in Bold

In usage:

[public] class Name extends ParentClass implements Interface1, Interface2, ... { ... }
