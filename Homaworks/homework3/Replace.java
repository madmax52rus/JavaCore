package homework3;

class Replace {
    static void replace(Replace[] arr, int element1, int element2) {
        Replace tmp = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = tmp;
    }
}
