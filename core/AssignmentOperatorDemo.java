class AssignmentOperatorDemo{

public static void main(String[] args){

// without shorthand statement

int a = 10;
a = a + 5;
int b = 10;
b = b- 5;
int c = 10;
c = c * 2;
int d = 10;
d = d/ 2;
int e = 10;
e = e % 3;

System.out.println(" a :"+ a +
                   " b :"+ b +
                   " c :"+ c +
                   " d :"+ d +
                   " e :"+ e);

// with shorthand statement

a += 5;
b -= 5;
c *= 2;
d /= 2;
e %= 3;

System.out.println(" a :"+ a +
                   " b :"+ b +
                   " c :"+ c +
                   " d :"+ d +
                   " e :"+ e);

}

}