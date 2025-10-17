public class FirstClass {
    /*
     * The keyword "public" is what is called an "access modifier" and declares the method's exposure level.
     *
     * The keyword "static" binds a method to its class so it can be called by just the class name.
     *
     * The keyword "void" represents the "return type".
     *
     * The "String[] args" represents method's parameter list.
     */
    public static void main(String[] args) {
        /*
         * Using args parameters:
         * At the command line, send the parameter value for execution with “java FirstClass "San Diego" NY”
         */
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
