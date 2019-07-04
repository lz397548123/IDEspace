package company;

import java.io.*;

/**
 * @ClassName: Test1
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 21:19
 * @Version: 1.0
 */
public class Test1 {
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\liangzhuang\\Desktop\\input.txt"));
        String s;
        while (true)
        {
            System.out.print("请输入一个字符串： ");
            System.out.flush();
            s=br.readLine();
            if (s.length()==0) {
                break;
            }
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
