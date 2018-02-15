//fix34 
public int[] fix34(int[] nums) {
  
	int j = 1;
	for(int i = 0; i < nums.length - 1; i++)
	{
		if(nums[i] == 3 && nums[i+1] != 4)
		{
			for(; nums[j] != 4; j++);
			{
			nums[j] = nums[i+1];
			nums[i+1] = 4;
			}
		}
	}
	return nums;

}
//canBalance 
public boolean canBalance(int[] nums) {
  
  int sumleft = nums[0];
  int sumright = 0;
  for(int i = 1; i< nums.length;i++)
  {
    for(int j = i; j< nums.length;j++)
    {
      sumright += nums[j];
    }
    if(sumleft == sumright)
    {
      return true;
    }
    sumleft+=nums[i];
    sumright = 0;
  }
  return false;
}
//linearIn 
public boolean linearIn(int[] outer, int[] inner) {
  
  int count = 0;
  int index = 0;

  if(inner.length ==0 )
  return true;
  for(int i = 0; i< outer.length;i++)
  {
    if(inner[index] == outer[i])
    {
      count++;
      index++;
    }
    else if(outer[i]>inner[index])
    {
      return false;
    }
    if(count == inner.length)
    return true;
  }
  return false;
  
}

//seriesUp 
public int[] seriesUp(int n) {
  
  int [] result = new int[n*(n+1)/2];
  int count =0;
  for(int i = 1; i<=n; i++)
  {
    for(int k = 1; k<=i; k++)
    {
      result[count] = k;
      count++;
    }
  }
  return result;
  
}
//countClumps 
public int countClumps(int[] nums) {
  
  
  int count = 0;
  boolean match = false;
  for(int i = 0; i< nums.length-1;i++)
  {
    if(nums[i] == nums[i+1] && !match)
    {
    match = true;
    count++;
    }
   else if(nums[i]!=nums[i+1])
    {
    match = false;
    }
  }
  return count;
}
