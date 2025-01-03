package software.ulpgc.kata5.apps.windows.io;

import software.ulpgc.kata5.architecture.io.UserReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class RandomUserReader implements UserReader {
    @Override
    public String read() {
        try (InputStream is = new URL("https://randomuser.me/api/").openStream()) {
            return new String(is.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
