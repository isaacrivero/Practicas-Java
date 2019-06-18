package com.ejemplos.lambdas;



public class MainLambda {
    public static void main(String[] args){
        InterfazFuncion foo = parameter -> parameter + " from lambda";
        String result = MainLambda.add("Message ", foo);
        System.out.println(result);
        result = MainLambda.add("Mensaje ", (p) ->  p+" from lamba");
        result = MainLambda.add("Mensaje ", (p) ->  {
            return p+" from lamba";
        });
        result = MainLambda.add("Mensaje ", p ->  {
            return p+" from lamba";
        });
        ProcessorImpl processor= new ProcessorImpl();

        result = processor.processWithSupplier( () -> "abc");
        System.out.println(result);
    }
    public static String add(String string, InterfazFuncion foo) {
        return foo.method(string);
    }
}
