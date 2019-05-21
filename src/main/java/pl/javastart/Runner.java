package pl.javastart;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Runner {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //TODO

        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();  // Należy przekazać pl.javastart.Tricky
        String params = "JavaStart";

        Class c = Class.forName(className);
        Constructor ctorlist[] = c.getDeclaredConstructors();
        Method methlist[] = c.getDeclaredMethods();

        Constructor ct = ctorlist[0];
        ct.setAccessible(true);
        Method m = methlist[0];
        Object o = ct.newInstance(params);
        m.invoke(o);
    }
}