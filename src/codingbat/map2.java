//word0 
public Map<String, Integer> word0(String[] strings) {
  
  Map<String, Integer> map = new HashMap();
  
  for(int i = 0; i < strings.length; i++)
  {
      map.put(strings[i], 0);
  }
  return map;
}
//wordLen
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(int i = 0; i < strings.length; i++)
  {
    map.put(strings[i], strings[i].length());
  }
  return map;
}
//pairs
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap(10);
  
  for(int i = 0; i < strings.length; i++)
  {
     String temp = strings[i];
     int len = temp.length();
     map.put(temp.substring(0,1), temp.substring(len-1));
  }
  return map;
  
}
//wordCount
public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap (20);

for(int i = 0; i < strings.length; i++)
{
  
  if(!map.containsKey(strings[i]))
  {
    map.put(strings[i],1);
  }
  else
  {
    int count = map.get(strings[i]);
    map.put(strings[i],count+1);
  }
}
return map;


}
//firstChar 
public Map<String, String> firstChar(String[] strings) {

Map <String, String> map = new HashMap();

for(int i = 0; i < strings.length;i++)
{
  String key = strings[i].substring(0,1);
  
  if(map.containsKey(key))
  {
    String value = map.get(key) + strings[i];
    map.put(key,value);
  }
  else
  {
    map.put(key,strings[i]);
  }
}
return map;
}
//wordAppend 
public String wordAppend(String[] strings) {
  
Map <String, Integer> map = new HashMap();
  String result = "";
  
  for(int i = 0 ; i< strings.length; i++)
  {
    String key = strings[i];
    if (map.containsKey(key))
    {
     int value = map.get(key);
     value ++;
     if(value%2 == 0)
     {
       result +=key;
     
     }
       map.put(key,value);
    }
    else
    {
     map.put(key, 1);
    }
    
  }
  return result;
}
//wordMultiple 
public Map<String, Boolean> wordMultiple(String[] strings) {
  
  Map <String, Boolean> map = new HashMap<String, Boolean>();
  
  for(int i = 0 ; i < strings.length; i++)
  {
    if(!map.containsKey(strings[i]))
    {
      map.put(strings[i], false);
    }
    else
    {
      map.put(strings[i], true);
    }
  }
  return map;
  
}
