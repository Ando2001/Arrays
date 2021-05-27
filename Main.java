public class Main {
    public static void main(String[] args) {
        DynamicStringArray Array1 = new DynamicStringArray();
        Array1.add("ABCD");
        Array1.add("SKCS");
        Array1.add("KJWC");
        Array1.add("AWND");
        Array1.add("VYJW");
        Array1.add("MBNI");
        Array1.add("OJWO");
        Array1.printArray();
        Array1.insertString("AAAA", 3);
        Array1.printArray();
        Array1.remove(5);
        Array1.printArray();
        Array1.remove("SKCS");
        Array1.printArray();
        System.out.println(Array1.indexoff("OJWO"));
        Array1.insertString("ABCD", 2);
        Array1.insertString("ABCD", 4);
        Array1.printArray();
        System.out.println(Array1.lastindexoff("ABCD"));
        System.out.println(Array1.coutofString("ABCD"));
        String[] strings = new String[3];
        strings[0] = "ABCD";
        strings[1] = "SKCS";
        strings[2] = "KJVC";
        Array1.removeOll(strings);
        Array1.printArray();
        Array1.replace("AAX", "GH");
        Array1.printArray();
        Array1.sortASC();
        Array1.printArray();
        Array1.sortDESC();
        Array1.printArray();
        Array1.swap(1, 0);
    }
}
