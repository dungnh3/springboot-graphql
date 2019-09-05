package springboot.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import springboot.graphql.entities.Pet;
import springboot.graphql.enums.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<>();
        pets = Arrays.asList(
                new Pet(1, "Pet-1", Animal.DOG, 5),
                new Pet(2, "Pet-2", Animal.CAT, 4)
        );
        return pets;
    }
}
