class Numbers {

    static void main(String[] args) {

        // Assim como em Java, Groovy também tem os tipos primitivos e suas versões como Classes: os Wrappers;
        println 1.class
        println 5.5.class // -> BigDecimal. Para converter para Double ou Float:
        println 5.5d.class
        println 5.5f.class
    }
}