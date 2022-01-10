package ADV_JAVA;
public class genericClass{
 
public static void main(String[] args) {

//   Here we are calling Its constructor 
  new Gen<Integer,Integer>(4,5);
  new Gen<String,String>("Ajay  ","Kumar verma");
  new Gen<Character,Character>('A','W');
 
   }

}


// generic class in java is class with different variable type 
// It is a special type of class 
class Gen<D1,D2>{

D1 x;
D2 y;

 Gen( D1 a, D2 b){
   x=a;
   y=b;  
    System.out.println(this.x+" "+this.y);
   System.out.println(((Object)x).getClass().getName());

}


}








