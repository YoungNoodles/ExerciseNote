import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*Test test = Test.getTest();
        System.out.println(test.getName());*/
        //获取字节码文件
        Class<?> aClass = Class.forName("Test");

        //获取构造方法
        //公共构造方法
        /*Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println();*/
        //所有构造方法
        /*Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }*/

        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class, Integer.class);
        String name = constructor.getName();
        int modifiers = constructor.getModifiers();
        Parameter[] parameters = constructor.getParameters();
        System.out.println(name);
        System.out.println(modifiers);
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //暴力反射：越过权限检验
        constructor.setAccessible(true);

        Test stu =(Test) constructor.newInstance("张三", 23);

    }
}
