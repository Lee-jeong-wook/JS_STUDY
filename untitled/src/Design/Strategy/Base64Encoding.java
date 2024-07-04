package Design.Strategy;

import java.util.Base64;

public class Base64Encoding implements EncodingStrategy{
    @Override
    public String encoding(String message) {
        return Base64.getEncoder().toString();
    }
}
