package com.relon.designpattern.demo.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        String consName = "com.relon.designpattern.demo.pattern.singleton.DoubleCheckSingleton";

        Constructor<?>[] declaredConstructors = DoubleCheckSingleton.class.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            DoubleCheckSingleton o = (DoubleCheckSingleton) declaredConstructor.newInstance();
            System.out.println(instance == o);
        }

    }

}
