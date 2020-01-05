package kukulam.module.testing.level.E;

public class StringToIntegerConverterImplementation implements StringToIntegerConverter {
    @Override
    public int convert(String number) {
        try {
            return Integer.parseInt(number);
        } catch (RuntimeException e) {
            return 0;
        }
    }
}
