package software.ulpgc.kata5.apps.windows;

import software.ulpgc.kata5.apps.windows.io.RandomUserAdapter;
import software.ulpgc.kata5.apps.windows.io.RandomUserDeserializer;
import software.ulpgc.kata5.apps.windows.io.RandomUserLoader;
import software.ulpgc.kata5.apps.windows.io.RandomUserReader;

public class Main {
    public static void main(String[] args) {
        RandomUserLoader loader = new RandomUserLoader(
                new RandomUserReader(),
                new RandomUserDeserializer(),
                new RandomUserAdapter()
        );

        for (int i = 0; i < 5; i++) {
            System.out.println(loader.load());
        }
    }
}
