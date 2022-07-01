# Lambda Scope Lab

## Instruction

You’re given this starter code:

```java
import java.util.function.UnaryOperator;

public class Main {
    String PREFIX = "__prefix__";
    String SUFFIX = "__suffix__";

		// fix the operator code
    public static UnaryOperator<String> operator = str -> str;

    public static void main(String[] args) {
        String res = operator.apply("  hello");
        System.out.println(res); // __prefix__hello__suffix__
    }
}
```

Your tasks are to:

- Fix the modifiers of the `PREFIX` and `SUFFIX` variables so they can be used
  in the `operator` lambda expression.
- Fix the lambda expression so that:
  - `str` doesn’t have any whitespace.
  - The `PREFIX` and `SUFFIX` values are added to the string.
