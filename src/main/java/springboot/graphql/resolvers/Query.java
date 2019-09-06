package springboot.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import springboot.graphql.entities.Pet;
import springboot.graphql.entities.User;
import springboot.graphql.enums.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Query implements GraphQLQueryResolver {

    public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();
        pets = Arrays.asList(
                new Pet("Pet-1", Animal.DOG, 5),
                new Pet("Pet-2", Animal.CAT, 4),
                new Pet("Pet-3", Animal.CAT, 4)
        );
        return pets;
    }

    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        users = Arrays.asList(
                new User(1, "nghoangdung", 25),
                new User(2, "nghoangdung", 24)
        );
        return users;
    }

    public List<User> findUsersById(int id) {
        List<User> users = new ArrayList<>();
        users = Arrays.asList(
                new User(1, "nghoangdung", 25),
                new User(2, "nghoangdung", 24)
        );
        users = users.stream().filter(r -> r.getId() == id).collect(Collectors.toList());
        return users;
    }
}
