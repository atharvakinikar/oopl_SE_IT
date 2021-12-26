class exception_handling{
    public static void main(String[] args) {
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        int num1=5;
        int num2=0;
        int div=num1/num2;
        System.out.println(div);
        
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null 
        String s=null;
        System.out.println(s.length());

        //Exception in thread "main" java.lang.NumberFormatException: For input string: "exception"
        String a="exception";
        int i=Integer.parseInt(a);

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4 
        int arr[]={1,2,3,4};
        System.out.println(arr[10]);
    }
}