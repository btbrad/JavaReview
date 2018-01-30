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
public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("Passed Name is :"+name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(  ){
        System.out.println("Puppy's age is ："+puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Bruce");
        myPuppy.setAge(4);
        myPuppy.getAge();
        System.out.println("成员变量"+myPuppy.puppyAge);
    }
}
