

Package com. Google;
/*
Author:Amruta sawant
Code for calculate area of sheps 
**/
//-----abstract------
Abstract class area 
{
Final float PI=3.14f;
//Final variable abstract public void area();
}
//---Inheritance---
//Inheritance oval->area
//---class---
Class oval extends area{
int x,y;
float area;
oval(intx,inty){
This.x=x;
This.y=y;
}
//---polymorphism---
//Override abstract method
@override
Public void area (){
area=x*y*PI;
System.out.println("Area of oval is:"+area);
}
}
//Inheritance triangle->area
Class triangle extends area{
int base,hight;
float area;
Triangle (int base,int height){
This.base=base;
This. height=height;
}
//Override abstract method
@override
Public void area (){
area =(float)(0.5*base*height);
System.out. println("area of triangle is"+area);
}
}

//----interface----
Interface shape {
float PI=3.14f;
//Final variable by default public void area();
}

//Inheritance triangle->shape
Class rectangle implement shape{
int x,y;
float area;
Rectangle (int x,int y){
This.x=x;
This.y=y
}
// Override area method of interface shape
@override
Public void area (){
area = x*y;
System.out.println("Area of rectangle is:"+area);
}
}

// Inheritance Pentagon->shape
Class Pentagon implement shape {
int side,apothem;
float area;
Pentagon (int side,int apothem;){
This. apothem= apothem;
This. Side= side;
}
@override
Public void area (){
area =(float)(5/2)*side*apothem;
System.out.println("Area of Pentagon is:"+area);
}
}

// Inheritance hexagon->shape
Class hexagon implement shape {
int side;
float _double_rt=(3*math.sqft(3))/2
double area;
Hexagon (int side){
This. Side= side;
}
@override

Public void area (){
area =(double)rt*side*.side;
System.out.println("Area of hexagon is:"+area);
}
}

 // Inheritance trapezium->shape
Class trapezium implement shape {
int a,b,h;
float area;
trapezium(int a,int b,int h){
This.a=a;
This.b=b;
This.h=h;
}
@override
Public void area (){
area =(double)(0.5)*a*b*h;
System.out.println("Area of Trapezium is:"+area);
}
}
//Inheritance circle->area
Class circle extends area{
double radius;
double area;
Circle (double radius){
This. radius=radius;
}
@override
Public void area (){
area =PI*radius*radius;
System.out. println("area of circle is"+area);
}
}
Public class assign 1{
Public static void main (string[]args){
Area a= new oval(17,7);
//----object-----
a, area ();

a= new triangle (10,12);
a, area();

Shape sp=new rectangle (30,18);
Sp.area();

 sp=new Pentagon (5,3);
sp.area();

sp=new hexagon (8);
sp.area();

 sp=new Trapezium(2,7,4);
sp.area();

 sp=new circle(5,8);
sp.area();

}// Main method end
}//Assign 1 ends.


