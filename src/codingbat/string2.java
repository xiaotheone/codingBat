//doubleChar 
public String doubleChar(String str) {
  
String result = "";
for(int i = 0; i< str.length(); i++)
{
 result  = result + str.charAt(i) + str.charAt(i);

}
return result;

}

//countHi 
public int countHi(String str) {
  
  int count = 0;
  
  for(int i = 0 ; i< str.length(); i++)
  {
    if (str.charAt(i) == 'i')
    {
      if (str.charAt(i-1) =='h')
      {
        count++;
      }
    }
  }
  return count;
}
//catDog 
public boolean catDog(String str) {

 int cat = 0;
 int dog = 0;
 
 for(int i = 0; i< str.length()-2; i++)
 {
     if ("cat".equals(str.substring(i,i+3)))
     {
       cat++;
     }
     if("dog".equals(str.substring(i,i+3)))
     {
      dog++;
     }
 }
 return cat == dog;
}
//countCode
public int countCode(String str) {
  
  int count = 0;
  for(int i = 0; i<str.length()-3; i++)
  {
    if("co".equals(str.substring(i,i+2))&&"e".equals(str.substring(i+3,i+4)))
    {
      count++;
    }
  }
  return count;
}
//endOther 
public boolean endOther(String a, String b) {
  
  String x = a.toLowerCase();
  String y=  b.toLowerCase();
  
  int xlength = x.length();
  int ylength = y.length();
  
  boolean flag = false;
  
  if(xlength>ylength)
  {
     if(y.equals(x.substring(xlength-ylength,xlength)))
     {
     flag = true;
     }
   
  }
  else if(x.equals(y.substring(ylength-xlength,ylength)))
     {
     flag = true;
  }
  return flag;

}
//bobThere 
public boolean bobThere(String str) {
  
 int len = str.length();
 
 for(int i = 0 ; i < len-2 ;i++)
 {
   if(str.charAt(i) == 'b' && (str.charAt(i+2) == 'b'))
   return true;
 }
 return false;
}
//xyBalance 
public boolean xyBalance(String str) {
    boolean y = false;
    for(int i = str.length() - 1; i >= 0; i--) {
        if(str.charAt(i) == 'y')
            y = true;
                    
        if(str.charAt(i) == 'x' && !y)
            return false;
    }
                                  
    return true;
}
//mixString 
public String mixString(String a, String b) {
  
  String result = "";
  
  int alen = a.length();
  int blen = b.length();
  
  int max = Math.max(alen,blen);
  
  for(int i = 0; i < max; i++)
  {
    if(i<=alen-1)
    {
      result += a.substring(i,i+1);
    }
    if(i<=blen-1)
    {
      result +=b.substring(i,i+1);
    }
  }
  return result;
}
//repeatEnd 
public String repeatEnd(String str, int n) {
  
  int strLength = str.length();
  String result = "";
  String repeat = str.substring(strLength-n, strLength);
  
  while(n>0)
  {
    result+=repeat;
    n--;
  }
  return result;
}
//repeatFront 
public String repeatFront(String str, int n) {
  
  int count = n;
  String sub = str.substring(0,n);
  String result = "";
  
  for(int i = 0 ; i<=count; i++)
  {
    result+= sub.substring(0,n-i);
  }
  return result;
  
}
//repeatSeparator
public String repeatSeparator(String word, String sep, int count) {
  
  if(count <1)
  return "";
  String result = "";
  for(int i = 0; i< count-1; i++)
  {
    result +=word;
    result +=sep;
  }
  result+=word;
  return result;
}
//prefixAgain 
public boolean prefixAgain(String str, int n) {
  
  String sub = str.substring(0,n);
  {
  if(str.length()==2)
  {
    if(str.charAt(0) == str.charAt(1))
    return true;
  }
    for(int i = n; i<str.length()-n;i++)
    {
       if(str.substring(i,i+n).equals(sub))
       {
         return true;
       }
    }
    return false;
  }
  
}

//xyzMiddle 
public boolean xyzMiddle(String str) {
  
  int half = str.length()/2;
  if(str.length()<3)
  return false;
  if((str.substring(half-1,half+2).equals("xyz")))
  return true;
  if(str.substring(half-2,half+1).equals("xyz") && str.length()%2==0)
  return true;
  return false;
}
//getSandwich 

  public String getSandwich(String str) {
   
   int first = str.indexOf("bread");
   int last =  str.lastIndexOf("bread");
   
   if(last!= -1 && first!=last)
   {
     return str.substring(first+5, last);
   }
   return "";
}
//oneTwo 
public String oneTwo(String str) {
  
  int len = str.length();
  String result = "";
 for(int i = 0 ; i < len-2;i+=3)
  {
 result += str.substring(i+1,i+3)+ str.charAt(i);
  }
  return result;
  
}
//zipZap
public String zipZap(String str) {
  
  String result = "";
  for(int i = 0 ; i< str.length()-2;i++)
  {
     if(str.substring(i,i+3).equals("zip")||str.substring(i,i+3).equals("zap"))
     {
      result = result+str.substring(i,i+1) + str.substring(i+2,i+3); 
     }
     result = result+str.substring(i,i+1);
 
  }
  return result;
}
//starOut
public String starOut(String s) {
 
 String result = "";
 
 for(int i = 0; i< s.length();i++)
 {
   
   if (s.charAt(i) == '*') continue;
    if (i > 0 && s.charAt(i - 1) == '*') continue;
    if (i < s.length() - 1 && s.charAt(i + 1) == '*') continue;
   
   result += s.substring(i,i+1);
   
 }
 return result;
}
//plusOut 
public String plusOut(String str, String word) {

   String result = "";
   if(str.contains(word))
   {
     str = str.replace(word,"--");
     
     for(int i = 0 ; i<str.length();i++)
     {
       if(str.charAt(i)!='-')
       {
        str =  str.replace(str.substring(i,i+1),"+");
       }
     }
   }
   str = str.replace("--",word);
   return str;
}

