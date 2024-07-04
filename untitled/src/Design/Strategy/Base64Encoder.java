package Design.Strategy;

import java.util.Base64;

public class Base64Encoder implements EncodingStrategy {

    @Override
    public String encoding(String message) {
        return message;
    }
}
