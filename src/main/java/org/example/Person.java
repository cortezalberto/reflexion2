package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Person {

    private String name;

    private void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

}
