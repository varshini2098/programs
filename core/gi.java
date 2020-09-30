class InstanceOfOperatorDemo{

public static void main(String args[]){

Object ref1;
ref1 = new Tree();
Object ref2 ;
ref2  = new Fruit();
Object ref3;
ref3 = new College();

System.out.println("InstanceOfOperatorDemo.....");

System.out.println("ref2 is instance of Tree :" +  (ref2 instanceof Tree)); // false 

System.out.println("ref2 is instance of Fruit :" +  (ref2 instanceof Fruit)); // true

System.out.println("ref2 is instance of College :" +  (ref2 instanceof College)); // false 

}

}

class Tree{
String name  = "Banian tree";
}

class Fruit{
String name  = "Mango";
}

class College{
String name = "APS college";
}
