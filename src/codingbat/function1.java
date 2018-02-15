//doubling 
public List<Integer> doubling(List<Integer> nums) {
  
  nums.replaceAll(n -> n*2);
  return nums;
}
//square 
public List<Integer> square(List<Integer> nums) {
  
  nums.replaceAll(n->n*n);
  return nums;
}
//addStar 
public List<String> addStar(List<String> strings) {
  
  strings.replaceAll(n->n+"*");
  return strings;
}
//copies3 
public List<String> copies3(List<String> strings) {
  strings.replaceAll(n->n+n+n);
  return strings;
}
//moreY 
public List<String> moreY(List<String> strings) {
 
 strings.replaceAll(n->"y"+n+"y");
 return strings;
}
//math1 
public List<Integer> math1(List<Integer> nums) {
  
  nums.replaceAll(n->(n+1)*10);
  return nums;
}
//rightDigit 
public List<Integer> rightDigit(List<Integer> nums) {

  nums.replaceAll(n-> n%10);
  return nums;
}

//lower 
public List<String> lower(List<String> strings) {
  strings.replaceAll(s->s.toLowerCase());
  return strings;
}
//noX 
public List<String> noX(List<String> strings) {
  strings.replaceAll(x -> x.replaceAll("x",""));
  return strings;
}
