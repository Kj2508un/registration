package com.api;
import com.fasterxml.jackson.core.JsonToken;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {

       List<String> val=Arrays.asList("mike","stalin","jon","devish","monkey");
        List<String> collect = val.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
        System.out.println(collect);

    }
}
