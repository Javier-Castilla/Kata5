package software.ulpgc.kata5.architecture.model;

public record User(Gender gender, Name name, Location location, String email, String phoneNumber) {
    public enum Gender {
        FEMALE, MALE;
    }

    public record Name(String first, String lastName) {}

    public record Location(String country, String state, String city, String streetName) {}
}
