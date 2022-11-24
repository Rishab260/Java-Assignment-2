class Test {
 
 
    static int i;
   
    int j;
 
  
    static
    {
        i = 10;
        System.out.println("static block called ");
    }
    // End of static block
}
public class Q7
{
	public static void main(String[] args) {
	 System.out.println(Test.i);
	}
}

