package software.ulpgc.kata5.apps.windows.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.apps.windows.io.pojos.RandomUserGetResponse;
import software.ulpgc.kata5.architecture.io.UserDeserializer;

public class RandomUserDeserializer implements UserDeserializer {
    @Override
    public Object deserialize(String string) {
        return new Gson().fromJson(string, RandomUserGetResponse.class);
    }
}
