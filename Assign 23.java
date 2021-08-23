Public class JPR23
{


Public static void main (string[]args)
{
Student S1= new student ();
Student S2= new student ("Amruta","Tyco","A","23-10-2021","kadlas","Amrutajs@gmail.com",9699923766);


//Admit student
S2. admit();
//Change the address
S2. Change add("sangola");
//Change the emali
S2. ChangeEmail("amru@gmail.com");


//Change the mobile number
S2. Changemob("9922892195");
S2. disp();
}


Class student
{
Static string college= "SPC";
String name;
String cls;
String div;
String admdate;
String address;
String email;
Long mobile;

//default constructor
Student ()
{
System.out.println("this is default constructor...");
}
Student (string name, string cls, string div, string admdate, string address, string email, long mobile)
{
 
this.name= name;
this.cls= cls;
this.div= div;
this.admdate= admdate;
this.address= address;
this.email= email;
this.mobile= mobile;
}

Void admit ()
{
System.out.println("you are admited in="+ college");
}
Void change div (string div);
{
div=dv;
System.out.println("after changing division="+div);
}
Void changeemail(string eml)
{
Email=em1;
System.out.println("after changing email address="+email);
}
Void changeadd(string add)
{
address=add;
System.out.println("after changing address="+address);
}
Void changemob(long mobile no)
{
mobile=mob no;
System.out.println("after changing mobile number="+mobile);
}
Void disp()
{

System.out.println("name of student is="+name);
System.out.println("class of student is="+cls);
System.out.println("mobile number of student is="+mobile);
System.out.println("email of student is="+email);
System.out.println("address of student is="+address);
System.out.println("addmission date of student is="+admdate);
}
}





