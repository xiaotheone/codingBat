//noNeg 
public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(n -> n<0);
  return nums;
}
//no9 
public List<Integer> no9(List<Integer> nums) {
  
  nums.removeIf(n -> (n%10 ==9));
  return nums;
}
//noTeen 
public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(n-> n>=13 && n<=19);
  return nums;
}
//noLong 
public List<String> noLong(List<String> strings) {
  
  strings.removeIf(n->n.length()>=4);
  return strings;
}
//noZ 
public List<String> noZ(List<String> strings) {

  
  strings.removeIf(n->n.contains("z"));
  return strings;


}
//no34 
public List<String> no34(List<String> strings) {
  
  strings.removeIf(s -> s.length()==3 || s.length()==4);
  return strings;
}
//noYY 
public List<String> noYY(List<String> strings) {
  
strings.replaceAll(n->n+"y");
strings.removeIf(n->n.contains("yy"));
return strings;
}
//two2
public List<Integer> two2(List<Integer> nums) {
  
  nums.replaceAll(n->n*2);
  nums.removeIf(n->n%10 == 2);
  return nums;
}
//square56 
public List<Integer> square56(List<Integer> nums) {
 
 nums.replaceAll(n->n*n+10);
 nums.removeIf(n->n%10 ==5 || n%10 == 6);
 return nums;
}
