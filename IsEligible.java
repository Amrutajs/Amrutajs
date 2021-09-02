
Public class IsEligible {
//IsEligible function takes age and give exception if age is less than 18
Void IsEligible (int age){
try{
if(age>18){
System.out. println("you are eligible to vote...");
}
else {
//if age is less than 18 then throw exception
throw new Exception ("you are not eligible to vote");
}
}
Catch (Exception e){//catch Exception and display message to user  
System.out.println(e);
}
}
Public static void main (string [] args){
IsEligible obj=new IsEligible ();
obj. IsEligible (15);
}
}
