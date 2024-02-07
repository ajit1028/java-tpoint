public class hello{
         
    public static void main(String[] args) {
        Call obj = new Call();
        System.out.println(obj.val);
        obj.callMe();
    }
}


class Call{
       int val=28;
       void callMe()
       {
          System.out.println("Hello, how are you?");
       }
}