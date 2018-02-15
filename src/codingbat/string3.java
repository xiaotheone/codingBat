//equalIsNot 
public boolean equalIsNot(String str) {
  
  int is = 0;
  int not = 0;
  int len = str.length();
  
  for(int i = 0; i < len; i++)
  {
   if(i< len-2)
   {
     if(str.substring(i,i+3).equals("not"))
     {
       not++;
     }
   }
   if(i< len-1)
   {
     if(str.substring(i,i+2).equals("is"))
     {
       is++;
     }
   }
  }
  if(is == not)
  return true;
  else
  return false;
}
//gHappy
public boolean gHappy(String str) throws NumberFormatException {
  
  boolean flag = true;
  char letter = 'g';
  int len = str.length();
  for(int i = 0; i< len;i++)
  {
    if(str.charAt(i) == 'g')
    {
       if(i>0 && str.charAt(i-1) =='g')
       flag = true;
       else if (i < len-1 && str.charAt(i+1) == 'g')
       flag = true;
       else
       flag = false;
    }
  }
  return flag;
}
//countTriple
public int countTriple(String str) {

 int count = 0;
 
 for(int i = 0; i< str.length()-2;i++)
 {
  char temp = str.charAt(i);
  if(temp == str.charAt(i+1) && temp == str.charAt(i+2))
  count++;
 }
 return count;
}
//sumDigits 
public int sumDigits(String str) {
  
int sum = 0;
 for(int i = 0; i<str.length();i++)
 {
   if(test(str.charAt(i)))
   {
     int get = Integer.parseInt(str.substring(i,i+1));
     sum +=get;
   }
 }
 return sum;
}
public boolean test(char test)
{
 
  if(Character.isDigit(test))
  {
    return true;
  }
  else
  {
    return false;
  }
}
//sameEnds 
public String sameEnds(String string) {
    String result = "";
    int len = string.length();
    for (int i = 0; i <= len / 2; i++)
        for (int j = len / 2; j < len; j++)
            if (string.substring(0, i).equals(string.substring(j)))
                result = string.substring(0, i);
    return result;
}

//mirrorEnds 
public String mirrorEnds(String string) {
  
  int half = string.length()/2;
  int len = string.length()-1;
  
  String temp = "";
 String test = new StringBuilder(string).reverse().toString();
 if(test.equals(string))
 {
   return string;
 }
  for(int i = 0; i< half; i++)
  {
    if(string.charAt(i) == string.charAt(len-i))
    {
      temp += string.charAt(i);
    }
    else
    break;
  }
  return temp;
  
}
//maxBlock 
public int maxBlock(String str) {
   
   int max = 1;
   int count = 1;
   if(str.length() ==0 )
   return 0;
   for(int i = 1; i < str.length(); i++)
   {
     if(str.charAt(i) != str.charAt(i-1))
     {
       if(count > max)
       {
       max = count;
       }
       count = 1;
     }
     else
     {
       count++;
     }
   }
   return Math.max(max, count);
   
   
}
//sumNumbers 
public int sumNumbers(String str) {
  
  int len = str.length();
  int sum = 0;
  String temp = "";

  for(int i = 0 ; i < len; i++)
  {
    
    if(Character.isDigit(str.charAt(i)))
    {
      if(i< len-1 && Character.isDigit(str.charAt(i+1)))
      {
        temp += str.charAt(i);
      }
      else
      {
        temp +=str.charAt(i);
        sum +=Integer.parseInt(temp);
        temp = "";
      }
    }
  }
  return sum;
}
//notReplace 
public String notReplace(String str) {
  
  String result = "";
  str = " "+ str + "  ";
  for(int i = 0; i < str.length()-2;i++)
  {
    
    if(str.charAt(i) == 'i')
    {
     if(str.charAt(i+1) == 's'
        &&!Character.isLetter(str.charAt(i+2)) 
        &&!Character.isLetter(str.charAt(i-1)) )
        {
          result += "is not";
          i += 1;
        }
        else
        result += 'i';
    }
    else
    result += str.charAt(i);
  }
  return result.substring(1);
}
