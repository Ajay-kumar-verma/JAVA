public class Casting {
   
public static void main(String args[]){

 int x=34;
 float y=x;
   x=(int)y;



System.out.println(y);
System.out.println(x);
System.out.println(" ");


byte c1='A';
// short c1='A';
// int  c1='A';
System.out.println(c1);

char c2=65; // while compile time it gets converted into an char
System.out.println(c2);

// In char and int no need to specify the type
// it auto gets converted ....

// While compile time it possible Run time it not possible 

// int x2=65;
// char c4=x2;


char c4='a';
int c5=c4;
System.out.println(c5);



 }

}
