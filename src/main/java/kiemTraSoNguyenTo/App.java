package kiemTraSoNguyenTo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        pheptinh();
        giaiphuongtrinhbac1();
    }

        public static void pheptinh()
         {
            int x = 20;
            int y = 10;
            int k = x+y;
            int l = x*y;
            int m = x/y;
            System.out.println(k);
            System.out.println(l);
            System.out.println(m);
         }
         public static void giaiphuongtrinhbac1()
         {
             int a = 2;
             int b = 6;
             System.out.println("Phuong trinh bac 1 x =" +(b/a));

         }
}
