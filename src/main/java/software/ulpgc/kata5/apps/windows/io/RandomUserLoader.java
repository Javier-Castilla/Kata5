package software.ulpgc.kata5.apps.windows.io;

import software.ulpgc.kata5.architecture.io.UserAdapter;
import software.ulpgc.kata5.architecture.io.UserDeserializer;
import software.ulpgc.kata5.architecture.io.UserLoader;
import software.ulpgc.kata5.architecture.io.UserReader;
import software.ulpgc.kata5.architecture.model.User;

public class RandomUserLoader implements UserLoader {
    private final UserReader reader;
    private final UserDeserializer deserializer;
    private final UserAdapter adapter;

    public RandomUserLoader(UserReader reader, UserDeserializer deserializer, UserAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    @Override
    public User load() {
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
