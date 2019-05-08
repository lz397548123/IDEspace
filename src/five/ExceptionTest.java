package five;

/**
 * @ClassName: ExceptionTest
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/24 10:49
 * @Version: 1.0
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int x = 16;
        int y = 0;
        int z[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            System.out.println("x/y = "+ x/y);
        }catch (ArithmeticException e) {
            System.out.println("除数零异常"+e.getMessage());
        }
        for (int i=0; i<z.length; i++) {
            try {
                System.out.println("z["+i+"]/"+i+"="+(z[i]/(i+1)));
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("捕获到数组下标越界异常！"+e.getMessage());
            }catch (ArithmeticException e) {
                System.out.println("捕获到算术异常！"+e.getMessage());
            }catch (Exception e) {
                System.out.println("捕获"+e.getMessage()+"异常！");
            }
            finally {
                System.out.println("i = "+i);
            }
        }
    }
}
