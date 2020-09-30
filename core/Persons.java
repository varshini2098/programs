class Persons {
String name;
String dob;
int age;
String gender;
  
void details()
{
  System.out.println("Name is " +name);
  System.out.println("Dob is " +dob);
  System.out.println("Age is " +age);
  System.out.println("Gender is " +gender);
}
 public static void main(String args[])
{
 Persons p = new Persons();
 p.name = "varshini";
 p.dob = "20=07-1998";
 p.age = 23;
 p.gender = "female";
 p.details();
 Persons s = new Persons();
 s.name = "srilekya";
 s.dob = "22-08-1998";
 s.age = 22;
 s.gender = "female";
 s.details();
 Persons k = new Persons();
 k.name = "karthik";
 k.dob = "24=07-1998";
 k.age = 22;
 k.gender = "male";
 k.details();
 Persons m = new Persons();
 m.name = "meghana";
 m.dob = "20=07-1998";
 m.age = 22;
 m.gender = "female";
 m.details();
 Persons sa = new Persons();
 sa.name = "sameksha";
 sa.dob = "23=07-1998";
 sa.age = 22;
 sa.gender = "female";
 sa.details();
}
}

