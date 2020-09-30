class LocalVariableTest{
void m2(){
int var;
var=10;
System.out.println(var);
}
public static void main(String args[])
{
LocalVariableTest lvt = new LocalVariableTest();
lvt.m2();
System.out.println(lvt.var);
}
}