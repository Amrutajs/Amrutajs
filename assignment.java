
Perform Arithmetic operation for Method Overloading & Overriding


**/
Class addition {
//Method overloading
int result(int a,int b){
return a+b;
}
int result (int a,int b,int c){
return a+b+c+d;
}
}
Class subtraction extends addition {
// method overloading
int result (int a, Int b){
return a-b;
}
int result (int a,int b, int c){
return a-b;
}
int result (int a,int b, int c){
return a-b-c;
}
int result (int a,int b, int c,int d){
return a-b-c-d;
}
Class multiplication extends addition {
// method overloading
int result (int a,int b){
return a*b;
}

int result (int a,int b, int c){
return a*b*c;
}
int result (int a,int b, int c,int d){
return a*b*c*d;
}
}

Class division extends addition {
// method overloading
int result (int a,int b){
return a/b;
}
}



Public class JPR 22{
Public class void main (string [] args){
Addition a1= new addition ();
Subtraction s1= new subtraction ();
Multiplication m1= new multiplication ();
Division d1= new division ();

System.out.print/n("sum:"+a1. result (1,2));
System.out.print/n("sum:"+a1. result (1,2,5));
System.out.print/n("sum:"+a1. result (1,2,9,6));

System.out.print/n("subtraction:"+s1. result (10,2));
System.out.print/n("subtraction:"+s1. result (50,20,5));
System.out.print/n("subtraction:"+s1. result (77,26,19,4));
System.out.print/n("multiplication:"+m1. result (90,2));
System.out.print/n("multiplication:"+m1. result (12,2,4));
System.out.print/n("multiplication:"+m1. result (12,2,4,7));
 System.out.print/n("division:"+d1. result (12,2));



}// main method ends
}//JPR 22 ends
