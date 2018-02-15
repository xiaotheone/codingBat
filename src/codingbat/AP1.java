//scoresIncreasing 
public boolean scoresIncreasing(int[] scores) {
  
  int first = scores[0];
  boolean flag = true;
  for(int i = 1 ; i < scores.length;i++)
  {
    if (scores[i] >= first && flag)
    {
      first = scores[i];
    }
    else
    {
      flag = false;
    }
  }
  return flag;
  
}
//scores100 
public boolean scores100(int[] scores) {
  
  for (int i = 0; i < scores.length -1 ; i++)
  {
     if(scores[i] == 100)
     {
       if (scores[i] == scores[i+1])
       {
         return true;
       }
     }
  }
  return false;

}
//scoresClump
public boolean scoresClump(int[] scores) {
  
  for(int i = 0; i < scores.length-2; i++)
  {
    if ((scores[i+2] - scores[i]) <=2)
     {
       return true;
     }
     else
     {
       return false;
     }
  }
  return false;
}
//scoresAverage
public int scoresAverage(int[] scores) {
  
  int avg1 = average(scores, 0, scores.length/2);
int avg2 = average(scores, scores.length/2, scores.length);


  
 return Math.max(avg1,avg2);
}

public int average(int[] scores,int start , int end)
{
  int sum = 0;
  for(int i = start; i<end; i++)
  {
   sum  +=scores[start];
  }
  return sum/(end-start);
}
//wordsCount 
public int wordsCount(String[] words, int len) {
  
  int count = 0;
  for(int i = 0 ; i< words.length; i++)
  {
     if(words[i].length() ==len)
     {
       count ++;
     }
  }
  return count;
}
//wordsFront 
public String[] wordsFront(String[] words, int n) {
  
  
  String newArray[] = new String[n];
  
  for(int i = 0 ; i < n ; i++)
  {
    newArray[i] = words[i];
  }
  return newArray;
  
}
//wordsWithoutList 
public List wordsWithoutList(String[] words, int len) {
 
ArrayList<String> list = new ArrayList<String>();

for(int i = 0 ; i< words.length; i++)
{
  if(words[i].length()!=len)
  {
    list.add(words[i]);
  }
}
return list;

}
//hasOne 
public boolean hasOne(int n) {

  
  while(n > 0)
  {
    if (n%10 == 1)
    return true;
    n = n/10;
  }
  
  return false;
}
//dividesSelf
public boolean dividesSelf(int n) {

  int temp  = n;
  if(n%10 == 0)
  return false;
  
  while(n != 0)
  {
    if(temp%(n%10) !=0)
    return false;
    n = n/10;
  }
 return true; 
}
//copyEvens 
public int[] copyEvens(int[] nums, int count) {
  
  int [] result = new int[count];
  int index = 0;
  
  for(int i = 0 ;i< nums.length; i++)
  {
    if(nums[i]%2 == 0 && count!=0)
    {
      result[index] = nums[i];
      count--;
      index++;
    }
     
  }
  return result;
  
}
//copyEndy 
public int[] copyEndy(int[] nums, int count) {
  
  int [] result = new int[count];
  int index = 0;
  for(int i = 0; i< nums.length; i++)
  {
    if(endy(nums[i])&&count!=0)
    {
      result[index] = nums[i];
      count--;
      index++;
    }
  }
  return result;
}

public boolean endy(int input)
{
  if((input>=0 && input<=10)||(input>=90 && input<=100))
  return true;
  else
  return false;
}
//matchUp
public int matchUp(String[] a, String[] b) {
  
int count = 0;
for(int i = 0; i<a.length; i++)
{
  String temp1 = a[i];
  String temp2 = b[i];
  
  if(temp1!="" && temp2!="")
  {
    if(temp1.charAt(0) == temp2.charAt(0))
    
      count++;
    
  }
}
 
 return count; 
}
//scoreUp 
public int scoreUp(String[] key, String[] answers) {
  
  int score = 0;
  for(int i = 0 ; i < key.length; i++)
  {
    if(key[i] == answers[i])
    {
      score = score + 4;
    }
    else if(answers[i].equals("?"))
    {
      score = score + 0;
    }
    else
    {
      score = score -1;
    }
    
  }
  return score;
  
}
//wordsWithout 
public String[] wordsWithout(String[] words, String target) {
  
  int count = 0; 
  String string = "";
  int index = 0;
  
  for(int i = 0 ; i< words.length; i++)
  {
    if (!words[i].equals(target))
    {
     count++;
    }
  }
 String [] result = new String[count];
 
 for(int j = 0; j < words.length; j++)
 {
   if (!words[j].equals(target))
   {
    result[index] = words[j];
    index++;
   }
 }
return result;
  
}
//scoresSpecial
public int scoresSpecial(int[] a, int[] b) {
  int largest1 = largest(a);
  int largest2 = largest(b);
  return largest1+largest2;
  
}


public int largest(int[] array)
{
  int largest = 0;
  for(int i = 0; i < array.length; i++)
  {
    if(array[i]%10 ==0 && array[i]>largest)
    {
      largest = array[i];
    }
  }
  return largest;
}
//userCompare 
public int userCompare(String aName, int aId, String bName, int bId) {

if(aName.compareTo(bName) < 0 )
{
  return -1;
}
if(aName.compareTo(bName) > 0 )
{
  return 1;
}
if(aName.compareTo(bName) == 0 && aId >bId)
{
  return 1;
}
if(aName.compareTo(bName) == 0 && aId < bId)
{
  return -1;
}
return 0;
}
//mergeTwo 
public String[] mergeTwo(String[] a, String[] b, int n) {
 
 
  String [] result = new String[n];
  
  int aindex = 0;
  int bindex = 0;
  
  for(int i = 0; i < n; i++)
  {
    if(a[aindex].compareTo(b[bindex])<0)
    {
      result[i] = a[aindex];
      aindex ++;
    }
    else if (a[aindex].compareTo(b[bindex]) > 0)
    {
      result[i] = b[bindex];
      bindex++;
    }
    else 
    {
      result[i] = a[aindex];
      aindex++;
      bindex++;
    }
  }
 return result;
}
//commonTwo 
public int commonTwo(String[] a, String[] b) {
  
   String string = "";
   int count = 0;
   
  for(int i = 0 ;i < b.length;i++)
  {
    for(int j = 0 ; j < a.length ; j++)
      if(a[j].equals(b[i]) && !string.contains(a[j]))
      {
       count++;
       string += a[j];
      }
  }
  return count;
}

