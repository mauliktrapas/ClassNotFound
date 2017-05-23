package com.company;

/**
 * Created by mauliktrapas on 23/05/17.
 */

// example of ClassNotFound Exception

class Main {

    public static void main(String[] args) {

        try {
            Class obj=Class.forName("com.company.HelloWorld");
            System.out.println("Class found = " + obj.getName());
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

/*
for NoclassDefFound Error:
    If I compile both Main.java and HelloWorld.java and then If I delete HelloWorld.class file.
    then I run Main.java file NoClassDefFound error would come
*/
