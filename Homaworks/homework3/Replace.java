package homework3;

class Replace {
    public static void replaceElements(Object[] array, int a, int b) {
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
