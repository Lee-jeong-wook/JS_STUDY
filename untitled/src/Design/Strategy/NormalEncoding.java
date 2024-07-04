package Design.Strategy;

import java.util.Base64;

public class NormalEncoding implements EncodingStrategy{
    @Override
    public String encoding(String message) {
        return message;
    }
}
