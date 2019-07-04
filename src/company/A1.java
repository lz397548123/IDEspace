package company;

/**
 * @ClassName: A
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:52
 * @Version: 1.0
 */
class A1 {
    public final void f() {
        char cStart='a',cEnd='z';
        for(char c=cStart;c<=cEnd;c++) {
            System.out.println(" "+c);
        }
    }
}
class B1 extends A1{
    public void g() {  char cStart='α',cEnd='ω';
        for(char c=cStart;c<=cEnd;c++) {
            System.out.println(" "+c);
        }
    }
}

