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
class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDUIM, LARGE }
    FreshJuiceSize size;
    public FreshJuice(String name){
        System.out.println(name);
    }
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice("Lemon Juice");
        juice.size = FreshJuice.FreshJuiceSize.MEDUIM;
        System.out.println(juice.size);
    }
}
