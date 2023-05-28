public class test {
    public static void main(String[] args) {
       addNumbers(2,2);
       int x = 4;
       multiplyTwoNumbers();
    }

   static int addNumbers(int num1,int num2){
       int sum =   num1+num2;
       return sum;
   }

   static void multiplyTwoNumbers(){
        int num3 = addNumbers(2,2)*2;
       System.out.println(num3);
   }
}
