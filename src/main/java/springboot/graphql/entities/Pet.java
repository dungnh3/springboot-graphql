package springboot.graphql.entities;

import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import springboot.graphql.enums.Animal;

@Data
@RequiredArgsConstructor
public class Pet {

    private long id;

    private final String name;

    private final Animal type;

    private final int age;
}
