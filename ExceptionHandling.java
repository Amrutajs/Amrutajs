
Public class Exception Handling {
Void div(int a,int b){
try {
int result=a/b;
System.out.println("Result is:"+result);
}
Catch (Arithmetic Exception ae){
System.out.println("cannot divide by zero");
}
Catch (Exception e){
System.out.println(e);
}
}
Public static void main (string [] args){
ExceptionHandling obj=new ExceptionHandling();
obj. div(2.0);
}
}
