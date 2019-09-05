package springboot.graphql.entities;

import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import springboot.graphql.enums.Animal;

@Data
public class Pet {

    private long id;

    private String name;

    private Animal type;

    private int age;

    public Pet(long id, String name, Animal type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
    }
}
