import com.bt.test.Employee;
import com.bt.test.EmployeeTest2;

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
public class EmployeeTest {
    private int a = 0;
    private static String str = "hello";
    private static void Test2(){
        System.out.println("执行了"+str);
    }

    public static void main(String[] args) {
        EmployeeTest.Test2();
        System.out.println(str);
        Employee empOne = new Employee("Jame Harden");
        Employee empTwo = new Employee("Daniel Stu");

        empOne.setAge(26);
        empOne.setSalary(1800);
        empOne.setDesignation("Scoring Guard");
        empOne.printEmployee();
        //System.out.println(empOne.b);

        empTwo.setAge(29);
        empTwo.setSalary(900);
        empTwo.setDesignation("Center Force");
        empTwo.printEmployee();

        System.out.println(empTwo.getCount());
    }
}
