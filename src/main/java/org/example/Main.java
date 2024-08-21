package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
// Ejemplo sencillo 2: Invocar métodos y acceder a campos
        try {
            // Crear una instancia de Person
            Person person = new Person("Maria");
            System.out.println("Mi nombre es :" + person.getName());

            // Obtener la clase de la instancia
            Class<?> clazz = person.getClass();

            // Acceder y modificar el campo privado 'name'
            Field nameField = clazz.getDeclaredField("name");
            // Lo Hago accesible
            nameField.setAccessible(true);
            nameField.set(person, "Jane");

            // Invocar el método privado 'sayHello'
            Method sayHelloMethod = clazz.getDeclaredMethod("sayHello");
            sayHelloMethod.setAccessible(true);
            // Acá lo ejecuto
            sayHelloMethod.invoke(person);

        } catch (Exception e) {
            e.printStackTrace();
        }


        // ------------------------------------ COMO CREAMOS UNA INSTANCIA DE UNA CLASE
        try {
            // Obtener la clase
            Class<?> clazz = Class.forName("java.util.ArrayList");

            // Crear una instancia de la clase DINAMICAMENTE
            Object instance = clazz.getDeclaredConstructor().newInstance();

            // Comprobar el tipo de la instancia
            if (instance instanceof java.util.ArrayList) {
                System.out.println("Instancia creada exitosamente de tipo ArrayList");
            } else {
                System.out.println("La instancia no es de tipo ArrayList");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
