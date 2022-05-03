package com.television.coursework.Validator;

public class InputDataValidator {

    public static boolean validate(Class clazz, Object object){
        return clazz.isInstance(object);
    }
}
