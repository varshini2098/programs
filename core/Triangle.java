class Triangle {
 
public static void main(String args[])
{
int a=10;
int b=30;
int c=20;

if((a==b)&&(b==c))
{
System.out.println("it is equilateral triangle");
}
else if((a==b)||(b==c)){
System.out.println("it is right angled triangle");
}

else {
System.out.println("it is scalane triangle");
}
}
}