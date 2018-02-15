//mapBully 
public Map<String, String> mapBully(Map<String, String> map) {
 
 if(map.containsKey("a"))
  {
    map.put("b" , map.get("a"));
    map.put("a", "");
  }
  return map;
}
//mapShare 
public Map<String, String> mapShare(Map<String, String> map) {
  
  if (map.get("a")!= null)
  {
    map.put("b", map.get("a"));
  }
  map.remove("c");
  return map;
}
//mapAB 
public Map<String, String> mapAB(Map<String, String> map) {
  if(map.get("a")!=null && map.get("b")!= null)
  {
    String value = map.get("a") + map.get("b");
    map.put("ab", value);
  }
  return map;
}
//topping1 
public Map<String, String> topping1(Map<String, String> map) {
  
  if(map.containsKey("ice cream"))
  {
    map.put("ice cream", "cherry");
  }
  map.put("bread","butter");
  return map;
}
//topping2 
public Map<String, String> topping2(Map<String, String> map) {
  if(map.get("ice cream") != null)
  {
    map.put("yogurt", map.get("ice cream"));
  }
  if (map.containsKey("spinach")) {
    map.put("spinach", "nuts");
  }
  return map;
}
//topping3 
public Map<String, String> topping3(Map<String, String> map) {
  
  if(map.containsKey("potato"))
  {
    map.put("fries",map.get("potato"));
  }
  if(map.containsKey("salad"))
  {
    map.put("spinach",map.get("salad"));
  }
  return map;
}
//mapAB2 
public Map<String, String> mapAB2(Map<String, String> map) {
  
  if(map.containsKey("a") && map.containsKey("b"))
  {
    if ((map.get("a")).equals( map.get("b"))){
    map.remove("a");
    map.remove("b");
    }
  }
  return map;
}
//mapAB3 
public Map<String, String> mapAB3(Map<String, String> map) {
  
  boolean a = map.containsKey("a");
  boolean b = map.containsKey("b");
  
  if((a == true && b == false)|| (a==false && b == true) )
  {
    if(a == true)
    {
      map.put("b",map.get("a"));
    }
    else
    {
      map.put("a",map.get("b"));
    }
  }
  return map;
  
}
//mapAB4 
public Map<String, String> mapAB4(Map<String, String> map) {
  
  String a ;
  String b ;
  String empty = "";
   if(map.containsKey("a") && map.containsKey("b"))
   {
     a = map.get("a");
     b = map.get("b");
   
   if((a.length()!=b.length()) && a.length()>b.length())
   {
    map.put("c",a);
   }
    else if ((a.length()!=b.length()) && a.length()< b.length())
   {
      map.put("c",b);
   }
   else
   {
    map.put("a",empty);
    map.put("b",empty);
   }
   }
  return map;
}
