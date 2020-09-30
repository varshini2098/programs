class virus {
String name;
String origin;
String media;
int lifespan;
void symptoms(){
System.out.println(name+ " Symptoms are fever,cough,cold,headache");
}
void transmission(){
System.out.println(name+ " transmits over" +media);
}
public static void main(String args[])
{
virus v = new virus();
v.name="corona";
v.origin="china";
v.media = "contacts";
v.lifespan= 14;
v.symptoms();
v.transmission();
virus h = new virus();
h.name="h1n1";
h.origin="mexico";
h.media = "contacts";
h.lifespan= 10;
h.symptoms();
h.transmission();
}
}
