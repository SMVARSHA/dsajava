package sjb.dsa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Stack st=new Stack(5);
        st.push(10);
        st.push(30);
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());
        st.display();
    }
}
