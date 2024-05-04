package UOH.PROCJECT.JAVA;

public class Person {
String Name;
int Age;
String PhoneNumer;
public Person(String Name, int Age,String PhoneNumber) {
	this.Name = Name;
	this.Age = Age;
	this.PhoneNumer = PhoneNumber;
}
public void displayInfo() {
    System.out.println("Name: " + Name + ", Age: " + Age+", PhoneNumber: "+ PhoneNumer);
}
}

