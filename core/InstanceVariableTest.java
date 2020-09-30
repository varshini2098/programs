class InstanceVariableTest{
int var;


public static void main(String args[])
{
InstanceVariableTest ivt = new InstanceVariableTest();
ivt.var=20;
System.out.println(ivt.var);
InstanceVariableTest ivt1 = new InstanceVariableTest();
ivt1.var=30;
System.out.println(ivt1.var);
System.out.println(ivt.var);
System.out.println(ivt1.var);


}
}