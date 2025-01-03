package software.ulpgc.kata5.apps.windows.io;

import software.ulpgc.kata5.architecture.io.UserAdapter;
import software.ulpgc.kata5.architecture.io.pojos.RandomUserGetResponse;
import software.ulpgc.kata5.architecture.model.User;

public class RandomUserAdapter implements UserAdapter {
    @Override
    public User adapt(Object object) {
        return userFrom(((RandomUserGetResponse) object).results().get(0));
    }

    private User userFrom(RandomUserGetResponse.User user) {
        return new User(
                toGender(user.gender()),
                toUserName(user.name()),
                toUserLocation(user.location()),
                user.email(),
                user.phone()
        );
    }

    private User.Location toUserLocation(RandomUserGetResponse.User.Location location) {
        return new User.Location(location.country(), location.state(), location.city(), location.street().name());
    }

    private User.Name toUserName(RandomUserGetResponse.User.Name name) {
        return new User.Name(name.first(), name.last());
    }

    private User.Gender toGender(String gender) {
        return User.Gender.valueOf(gender.toUpperCase());
    }
}
