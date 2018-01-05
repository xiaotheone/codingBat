/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;


public class Warmup1_solution{
    //Sleep in
public boolean sleepIn(boolean weekday, boolean vacation) {
  
  if((!weekday || vacation))
  return true;
  else
  return false;
}
//monkeyTrouble 
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  
  if(aSmile && bSmile)
  return true;
  else if(!aSmile && !bSmile)
  
    return true;
  
  else
  return false;
}
//sumDouble
public int sumDouble(int a, int b) {
  
  if(a!=b)
  return a+b;
  else
  return (a+b)*2;
}
//diff21
public int diff21(int n) {
  
  int num_abs = Math.abs(n-21);
  if(n > 21)
  return num_abs*2;
  return num_abs;
}
//parrotTrouble 
public boolean parrotTrouble(boolean talking, int hour) {
   
   if(talking)
   {
      if(hour<7 || hour>20)
      {
        return true;
      }
   }
   return false;
}

//makes10 
public boolean makes10(int a, int b) {
   if((a+b) == 10)
   return true;
   else if (a == 10 || b == 10)
   return true;
   return false;
}
//nearHundred 
public boolean nearHundred(int n) {
  
   int result = Math.abs(100 - n);
   int result2 = Math.abs(200 - n) ;
   if(result <=10 || result2 <=10 )
   return true;
   return false;
}
// posNeg 
public boolean posNeg(int a, int b, boolean negative) {
 
 if(a>0 && b<0 && negative == false)
 return true;
 else if(a<0 && b>0 && negative == false)
 return true;
 else if (a<0 && b<0 && negative == true)
 return true;
 return false;
 
}
//notString 
public String notString(String str) {
  
  if (str.length()>=3 && str.substring(0,3).equals("not"))
  {
    return str;
  }
  return "not "+str; 
}
//missingChar 
public String missingChar(String str, int n) {
  
  return str.substring(0,n) + str.substring(n+1);
}
//frontBack 
public String frontBack(String str) {
  int len = str.length();
  if(len<=1)
  return str;
  else
  return str.substring(len-1)+str.substring(1,len-1)+str.substring(0,1);
}
//front3 
public String front3(String str) {
  
  if(str.length()<3)
  
  return str+str+str;
  
  else
  
  return str.substring(0,3) + str.substring(0,3)+str.substring(0,3);
}
  // backAround 
  public String backAround(String str) {
   return str.substring(str.length()-1) + str + str.substring(str.length()-1);
}
//or35 
  public boolean or35(int n) {
  
  if(n%3 == 0 || n%5==0)
  return true;
  return false;
}
  // front22 
public String front22(String str) {
  
if(str.length()<2)
{
  return str+str+str;
}
 return str.substring(0,2) + str+str.substring(0,2);
}
//startHi 
public boolean startHi(String str) {
  
  if (str.length()<2)
  return false;
  else
  return (str.substring(0,2).equals("hi"));
}
//icyHot 
public boolean icyHot(int temp1, int temp2) {
  
  return ((temp1<0 && temp2>100) || (temp1>0 && temp2 <100));
}
//in1020 
public boolean in1020(int a, int b) {
   
   return((a>=10 && a<=20) || (b>=10 &&b<=20));
   
}
//hasTeen
public boolean hasTeen(int a, int b, int c) {


  return ((a>=13 &&a<=19) || (b>=13 &&b<=19) ||(c>=13 &&c<=19)); 
  
}
//loneTeen 
public boolean loneTeen(int a, int b) {
  
  if((a>=13 && a<=19)&&(b>=13 && b<=19))
  return false;
  if((a>=13 && a<=19)||(b>=13 && b<=19))
  return true;
  return false;
}
//delDel 
public String delDel(String str) {

if(str.length()<=3)
return str;
else if(str.substring(1,4).equals("del"))
return str.substring(0,1)+str.substring(4);
return str;
}
//mixStart 
public boolean mixStart(String str) {
  
  if(str.length() < 3)
  return false;
  
  if(str.substring(0,3).equals("mix")||str.substring(1,3).equals("ix"))
  return true;
  return false;
}
//startOz 
public String startOz(String str) {

 if(str.length()<=1)
 return str;
 if(str.substring(0,2).equals("oz"))
 return "oz";
 if(str.substring(0,1).equals("o"))
 return "o";
 if(str.substring(1,2).equals("z"))
 return "z";
  return "";
}
//intMax 
public int intMax(int a, int b, int c) {
  
  int max;
  if(a > b)
  max = a;
  else
  max = b;
  if(c > max)
  max = c;
  return max;
}

//close10 
public int close10(int a, int b) {
  
  int first = Math.abs(10-a);
  int second = Math.abs(10-b);
  
  if(first == second)
  return 0;
   else if(a<b)
   return a;
   else if (a>b)
   return b;
   
return 0;
}
//in3050 
public boolean in3050(int a, int b) {
  
  if(a>=30 && a<=40 && b>=30 && b<=40)
  return true;
   if(a>=40 && a<=50 && b>=40 && b<=50)
   return true;
   return false;
}
//max1020 
public int max1020(int a, int b) {
   
   if(a>=10 && a<=20 && b>=10 && b<=20)
   {
     if(a>b)
     return a;
     else
     return b;
   }
   if(a>=10 && a<=20 && (b>20 || b<10))
   return a;
   if(b>=10 && b<=20 && (a>20 || a<10))
   return b;
   return 0;
  
}
//stringE 
public boolean stringE(String str) {
  
  int count = 0;
  for(int i = 0; i < str.length(); i++)
  {
    if(str.charAt(i) == 'e')
    {
      count++;
    }
  }
  if(count<=3 && count>=1)
  return true;
  return false;
}
  //lastDigit public
  
  public boolean lastDigit(int a, int b) {
  
  return(a%10 == b%10);
}

//endUp 
  public String endUp(String str) {
  
   int len = str.length();
  if(str.length()<=3)
  return str.toUpperCase();
  else
  return str.substring(0,len-3)+(str.substring(len-3)).toUpperCase();
}
//everyNth 
  public String everyNth(String str, int n) {

  String result = "";  
  for(int i = 0; i< str.length(); i++)
  {
     if(i%n== 0)
     {
       result+=str.substring(i,i+1);
     }
  }
  return result;
}

}





