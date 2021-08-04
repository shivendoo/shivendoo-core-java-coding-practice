
public class Test
{
	
	// we can not declare STATIC inside a method body becuase static is associated with class. we can use the static inside method body
	//but can not declare inside method body   
	static String temp = "rahul";
	private static float temp()
    {
    	
    	System.out.println(temp);
//         public static float sum = 21;
//        return(--(sum));
    	return 0;
    }
    public static void main(String[] args)
    {
        Test test = new Test();
        System.out.println(test.temp());
    }
}  