//countEvens
public int countEvens(int[] nums) {
  int count = 0;
  for(int i = 0 ; i < nums.length; i++)
  {
    if(nums[i]%2 ==0)
    count++;
  }
  return count;
}

//bigDiff 
public int bigDiff(int[] nums) {
  
  Arrays.sort(nums);
  
  return(Math.abs(nums[0]-nums[nums.length-1]));
}
//centeredAverage
public int centeredAverage(int[] nums) {
  
  Arrays.sort(nums);
  
  int sum = 0;
  for(int i = 1; i< nums.length-1;i++)
  {
   sum +=nums[i]; 
  }
  return sum/(nums.length-2);
  
}
//sum13 
public int sum13(int[] nums) {
  
  int sum = 0;
  for(int i = 0; i< nums.length;i++)
  {
    if(nums[i] != 13)
    {
      sum+=nums[i];
    }
    else if(nums[i] == 13 && i<nums.length-1)
    {
       nums[i+1] = 0;
    }
  }
  return sum;
}
//sum67
public int sum67(int[] nums) {
  
  int sum = 0;
  int zero = 0;
 for (int j = 0 ; j< nums.length; j++)
 {
   if(nums[j] == 6)
   {
     for(int k = j; nums[k]!=7; k++)
     {
       nums[k] = 0;
       zero = k;
     }
     nums[zero+1] = 0; 
   }
   else
   sum+= nums[j];
 }
  return sum;
}
//has22
public boolean has22(int[] nums) {
  
  for(int i = 0; i < nums.length-1; i++)
  {
    if(nums[i] == 2 && nums[i+1]==2)
    return true;
  }
  return false;
}
//lucky13

public boolean lucky13(int[] nums) {
  
  boolean flag = true;
  for(int i=0; i<nums.length;i++)
  {
   if (nums[i] == 1 || nums[i]==3)
    {
     flag = false;
    }
  }
  return flag;
}
//sum28
public boolean sum28(int[] nums) {
  
  int sum = 0;
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 2)
    {
      sum+=nums[i];
    }
  }
  return sum == 8;
}
//more14
public boolean more14(int[] nums) {
  
  int count1 = 0;
  int count4 = 0;
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 1)
    count1++;
    if(nums[i] ==4)
    count4++;
  }
  return count1>count4;
}
//fizzArray
public int[] fizzArray(int n) {
  
  int [] result = new int [n];
  
  for(int i = 0; i < n; i++)
  {
    result[i] = i;
  }
  return result;
  
}
//only14
public boolean only14(int[] nums) {
  
  for(int i = 0; i < nums.length; i++)
  {
    if(!(nums[i] == 1 || nums[i] == 4))
    return false;
  }
  return true;
}
//fizzArray2
public String[] fizzArray2(int n) {
  
  String [] result = new String[n];
  int index = 0;
  for(int i = 0; i < n ;i++)
  {
    result[index] = String.valueOf(i); 
    index++;
  }
  return result;
}
//no14
public boolean no14(int[] nums) {
   
   boolean flag1 = false;
   boolean flag4 = false;
   
  for(int i = 0; i< nums.length;i++)
  {
  if(nums[i] == 1 )
    flag1 = true;
  if(nums[i] ==4)
   flag4 = true;
  }
  if(flag1 == true && flag4 ==false)
  return true;
  if(flag1 == false && flag4 ==true)
  return true;
  if(flag1 == true && flag4 == true)
  return false;
  
  return true;
}
//isEverywhere
public boolean isEverywhere(int[] nums, int val) {
  
  for(int i = 0 ; i < nums.length-1; i++)
  {
    if(!(nums[i]== val || nums[i+1]==val))
    return false;
  }
  return true;
}
//either24
public boolean either24(int[] nums) {
  
  int len = nums.length;
  int two = 0; 
  int four = 0;
  for(int i = 0; i < len-1; i++)
  {
    if(nums[i] == 2 && nums[i+1] ==2)
    {
    two++;
    }
    if(nums[i] == 4 && nums[i+1] ==4)
    {
    four++; 
    }
    
  }
  
  if(two>0 && four>0)
  return false;
  if(two == 0 && four>0)
  return true;
  if(two >0 && four ==0)
  return true;
  return false;
}
//matchUp
public int matchUp(int[] nums1, int[] nums2) {
  
  int count = 0;
  for(int i = 0 ; i < nums1.length; i++)
  {
    if(nums1[i] != nums2[i] && check(nums1[i],nums2[i]) )
    count++;
  }
  return count;
  
}
public boolean check(int i , int j)
{
   int k = Math.abs(i-j);
   
   return (k<=2);
}

//has77
public boolean has77(int[] nums) {
  

  
    for(int i = 0; i<nums.length-1; i++)
    {
      if (nums[i] == 7)
      {
       if (nums[i+1]==7)
       {
       return true;
       }
       else if(i<nums.length-2 && nums[i+2]==7)
       {
         return true;
       }
   
       }
       
      }
      return false;
    }
    //has12
public boolean has12(int[] nums) {
  
  
 boolean flag = false;
  
  for(int i = 0; i < nums.length; i++)
  {
     if(flag)
     {
        if(nums[i] == 2)
        return true;
     }
     else if(nums[i]==1)
     {
       flag = true;
     }
  }
  return false;
}
//modThree 
public boolean modThree(int[] nums) {
  
  for(int i = 0 ;i< nums.length - 2; i++)
  {
    
    if(nums[i]%2 == nums[i+1]%2 && nums[i]%2 ==nums[i+2]%2)
    return true;
  }
  return false;
}
//haveThree 
public boolean haveThree(int[] nums) {
  
  int count = 0;
  boolean flag = true;
  for(int i = 0; i< nums.length; i++)
  {
    if(nums[i] ==3)
    {
      count++;
    }
  }
 if(count!=3)
 {
   flag = false;
 }
 else
 {
  for(int i = 0; i< nums.length; i++)
  {
   if(nums[i] ==3)
   {
     if(i>0 && nums[i-1] == 3)
     {
       flag = false;
     }
     else if(i<nums.length-1 && nums[i+1] == 3)
     {
       return false;
     }
     else
     {
       flag = true;
     }
     
   }
  }
 }
 return flag;
  
}
//twoTwo 
public boolean twoTwo(int[] nums) {
  
  boolean flag = true;
  for(int i = 0; i< nums.length; i++)
  {
    if(i<nums.length-1 && nums[i] == 2 && nums[i-1] ==2 && flag)
    {
      flag = true;
    }
    else
    {
      flag = false;
    }
  }
  

  return flag;
}
//sameEnds
public boolean sameEnds(int[] nums, int len) {
  
 for(int i = 0 ; i< len; i++)
 {
   if(nums[i]  != nums[nums.length - len + i ])
   return false;
 }
 return true;
}
//tripleUp 
public boolean tripleUp(int[] nums) {
  
  for(int i = 0 ; i <nums.length-2; i++)
  {
    if(nums[i] == (nums[i+1]-1)  && (nums[i+2]-2)==(nums[i+1]-1) )
    {
    return true;
    }

}
  return false;
}
//fizzArray3 
public int[] fizzArray3(int start, int end) {
  
  int [] result = new int[end-start];
  int index = 0;

  for(int i = start; i< end; i++)
  {
    result[index] = i;
    index++;
  }
  return result;
}
//shiftLeft 
public int[] shiftLeft(int[] nums) {
  
  if(nums.length<1)
  return nums;
  int first = nums[0];
 
  for(int i = 0; i< nums.length-1;i++)
  {
    nums[i]= nums[i+1];
  }
  nums[nums.length-1] = first;
  return nums;
}
//tenRun 
public int[] tenRun(int[] nums) {
  
  for(int  i = 0; i < nums.length; i++)
  {
    if(nums[i]%10 == 0)
    {
      for (int j = i +1; j < nums.length && !(nums[j] % 10 == 0);j++)
      {
        nums[j] = nums[i];
      }
    }
  }
  return nums;
}
//pre4 
public int[] pre4(int[] nums) {
  
  int count = 0;
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 4)
    break;
    else
    count++;
  }
  int [] result = new int[count];
  for(int i = 0; i <count; i++)
  {
    result[i] = nums[i];
  }
  return result;
}
//post4 
public int[] post4(int[] nums) {
  int count = 0;

  for(int i = nums.length-1; i>0; i--)
  {
    if(nums[i] == 4)
    break;
    else
    count++;
  }
  int [] result = new int [count];
  int index =0;
  
  for(int j = nums.length-count ; j< nums.length; j++)
  {
    result[index] = nums[j];
    index++;
  }
  return result;
}
//notAlone 
public int[] notAlone(int[] nums, int val) {
  

  for(int i = 0 ; i< nums.length-1;i++)
{
  if(i>0 && nums[i+1]!=val && nums[i-1]!=val)
  if(nums[i-1]>nums[i+1])
  nums[i] = nums[i-1];
  else 
  nums[i] = nums[i+1];
}


  return nums;
}
//zeroFront 
public int[] zeroFront(int[] nums) {
  
  //Arrays.sort(nums);
  //return nums;
  
  for(int i = 0 ; i<nums.length; i++)
  {
   if(nums[i]!=0){
    for(int j = i; j< nums.length; j++)
    {
      int value = 0;
      int index = 0;
      if(nums[j] == 0)
      {
       index = j;
       nums[j] = nums[i];
       nums[i] = 0;
      }
    }
   }
  }
  return nums;
}
//withoutTen 
public int[] withoutTen(int[] nums) {
    int[] result = new int[nums.length];
    int index = 0;
 
   for(int i = 0; i< nums.length; i++)
   {
     if(nums[i]!=10)
     {
       result[index] = nums[i];
       index++;
     }
   }
   
    return result;
}
//zeroMax 
public int[] zeroMax(int[] nums) {

int max = 0;
 for(int i= 0; i < nums.length; i++)
 {
   if(nums[i] == 0)
   {
   for(int j = i+1 ; j < nums.length;j++)
    {
     if(nums[j]>max && nums[j]%2 == 1 )
     max = nums[j];
    }
   nums[i] = max;
   max = 0;
   }
   
 }

return nums;
}
//evenOdd 
public int[] evenOdd(int[] nums) {
  
  int [] result = new int [nums.length];
   int even = 0;
   int odd = nums.length-1;
   
   for(int i = 0 ;i< nums.length;i++)
   {
     if(nums[i]%2 ==0)
     {
       result[even] = nums[i];
       even++;
     }
     else
     {
       result[odd] = nums[i];
       odd--;
     }
    
   }
   return result;
  
}
//fizzBuzz 
public String[] fizzBuzz(int start, int end) {
  
  String [] result = new String[end-start];
  
 int index = 0;
  
  for(int i = start; i<end; i++)
  {
    if(i%3==0 && i%5==0)
    {
      result[index] = "FizzBuzz";
      index++;
    }
    else if(i%3 == 0)
    {
      result[index] = "Fizz";
      index++;
    }
    else if(i%5 == 0)
    {
      result[index] = "Buzz";
      index++;
    }
    else
    {
      result[index] = String.valueOf(i);
      index++;
    }
  }
  return result;
}
