class mobile{
 String name;
 String colour;
 int price;
 void popularity(){
 System.out.println(name + " is very popular");
}
 public static void main(String args[])
{
 mobile m = new mobile();
 m.name="iphone";
 m.colour="red";
 m.price= 100000;
 m.popularity();
}
}