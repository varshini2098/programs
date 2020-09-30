class Arithmetic{
void m1(){
short a=10;
short b=17;
short c,c1,c2,c3;
c= (short) (a+b);
c1=(short)(a-b);
c2=(short)(a*b);
c3=(short)(a/b);
System.out.println("The value for a+b:");
System.out.println(c);
System.out.println("the value a-b is:");
System.out.println(c1);
System.out.println("the value a*b is:");
System.out.println(c2);
System.out.println("the value a/b is:");
System.out.println(c3);
}
public static void main(String args[])
{
Arithmetic a= new Arithmetic();
a.m1();
}
}

