package software.ulpgc.kata5.apps.windows.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.architecture.io.UserDeserializer;
import software.ulpgc.kata5.architecture.io.pojos.RandomUserGetResponse;

public class RandomUserDeserializer implements UserDeserializer {
    @Override
    public Object deserialize(String string) {
        return new Gson().fromJson(string, RandomUserGetResponse.class);
    }
}
