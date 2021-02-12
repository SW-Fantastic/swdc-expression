package org.swdc.expression.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;

public class ReflectionUtil {

    public static Object getProperty(Object target, String key) {
        if (target instanceof Map) {
            return ((Map) target).get(key);
        }
        try {
            Object result = AccessController.doPrivileged((PrivilegedAction<Object>) () -> {
                try {
                    Field field = target.getClass().getDeclaredField(key);
                    field.setAccessible(true);
                    return field.get(target);
                } catch (Exception e) {
                    return null;
                }
            });
            if (result != null) {
                return result;
            }
            String methodName = key.substring(0,1).toUpperCase() + key.substring(1);
            String getterName = "get" + key.substring(0,1).toUpperCase() + key.substring(1);
            Method getter = null;
            try {
                getter = target.getClass().getMethod(getterName);
                return getter.invoke(target);
            } catch (NoSuchMethodException e) {

            }

            try {
                getterName = "is" + methodName;
                getter = target.getClass().getMethod(getterName);
                return getter.invoke(target);
            } catch (NoSuchMethodException e) {

            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static Class getBoxedClass(Class primary) {
        if (primary == int.class) {
            return Integer.class;
        }
        if (primary == float.class) {
            return Float.class;
        }
        if (primary == double.class) {
            return Double.class;
        }
        if (primary == char.class) {
            return Character.class;
        }
        if (primary == byte.class) {
            return Byte.class;
        }
        if (primary == short.class) {
            return Short.class;
        }
        return primary;
    }

    public static boolean isNumber(Object o) {
        if (Number.class.isAssignableFrom(getBoxedClass(o.getClass()))) {
            return true;
        }
        return false;
    }

    public static boolean isComparable(Object o) {
        return Comparable.class.isAssignableFrom(o.getClass());
    }


}
