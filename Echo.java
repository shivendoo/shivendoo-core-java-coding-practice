public class Echo extends Vibrate 
{
    Echo()  
    {
        this(7);
        s += "e";
    }
    Echo(int x) 
    {
        s += "e2";
    }
    public static void main(String[] args) 
    {
        System.out.print("made " + s + " ");
    }
    static 
    {
    	System.out.println("thsi is static block");
        Echo e = new Echo();
        System.out.print("block " + s + " ");
    }
}