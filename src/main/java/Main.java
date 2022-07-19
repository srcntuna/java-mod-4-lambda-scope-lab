import java.util.function.UnaryOperator;

public class Main {
    final static String PREFIX = "__prefix__";
    final static String SUFFIX = "__suffix__";
	
	// fix the operator code
    public static UnaryOperator<String> operator = str -> {
        String trimmedStr = str.trim();

        return PREFIX+trimmedStr+SUFFIX;

    };

    public static void main(String[] args) {
        String res = operator.apply("  hello"); 
        System.out.println(res); // __prefix__hello__suffix__
    }

    interface UnaryOperator<String>{

        String apply(String str);

    }
}
