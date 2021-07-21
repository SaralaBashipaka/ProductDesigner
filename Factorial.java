class Factorial {
  public static void main(String []arg){
  Factorial F=new Factorial();
  For(int i=1;i<=10;i++){
   int res=F.Fact(i);
   System.out.println(i+"!= "+res);
   }
  }
 int Fact(int n){
  if(n==1)
  return 1;
  int x=n*Factorial(n-1);
  return x;
 }
}