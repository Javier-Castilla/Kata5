package software.ulpgc.kata5.apps.windows.io.pojos;

import java.util.List;

public record RandomUserGetResponse(List<User> results) {
    public record User(String gender, Name name, Location location, String email, String phone) {
        public record Name(String title, String first, String last) {}

        public record Location(String country, String state, String city, Street street) {
            public record Street(int number, String name) {}
        }
    }
}
