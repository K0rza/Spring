package com.example.p10_spring_di_with_mutli_same_class_types.utils;

public class ClassNameFinder {

    private ClassNameFinder() {}

    public static String toClassName(String classPath) {
        String[] pathList =  classPath.split("\\.");
        return pathList[pathList.length -1];
    }
}
