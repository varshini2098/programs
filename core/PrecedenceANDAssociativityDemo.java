class PrecedenceANDAssociativityDemo{
public static void main(String[] args){

int a = 10,b= 40, c=30, d =40, e =50, f;

//f = a+b*c-d/e;

f = b++/++a;// (b++) /(++a) // 4  3
System.out.println("a+++++b = : "+ f);
}

}