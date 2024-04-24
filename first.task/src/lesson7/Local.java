package lesson7;

public class Local {
    static String regexp = "\\D";

    public static void method(String x, String y) {
        final int z = 10;

        class Z {
            String f = null;
            public void vF(String f){
                String c = f.replace(regexp, "");
                if (f.length() == z) {
                    this.f = c;
                }
            }
        }
    }
}
