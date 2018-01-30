import javax.sound.midi.Soundbank;

/**
 * <p>类描述：
 * <pre>
 * 改动说明：
 *      【修改人：卞涛 / 2018年01月30日 / 版本：1.0】
 *
 * </pre>
 *
 * @author 卞涛
 * @version 1.0
 * @since 2018年01月30日
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        String str5 = 
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3==str2);
        System.out.println(str3.equals(str2));
    }
}
