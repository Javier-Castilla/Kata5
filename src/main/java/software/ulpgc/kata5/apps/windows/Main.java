package software.ulpgc.kata5.apps.windows;

import software.ulpgc.kata5.apps.windows.io.RandomUserAdapter;
import software.ulpgc.kata5.apps.windows.io.RandomUserDeserializer;
import software.ulpgc.kata5.apps.windows.io.RandomUserReader;
import software.ulpgc.kata5.apps.windows.io.UserLoader;

public class Main {
    public static void main(String[] args) {
        UserLoader loader = new UserLoader(
                new RandomUserReader(),
                new RandomUserDeserializer(),
                new RandomUserAdapter()
        );

        for (int i = 0; i < 10; i++) {
            System.out.println(loader.load());
        }
    }
}
