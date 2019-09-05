package springboot.graphql.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.intellij.lang.annotations.Identifier;

import javax.annotation.Generated;

@Data
@RequiredArgsConstructor
public class User {

    private final long id;

    private final String username;

    private final int age;
}
