public class DynamicArray {
    private int[] array;
    private int length;

    public DynamicArray() {
        array = new int[10];
        length = 0;
    }

    public void expand() {
        int[] tempArray = new int[array.length * 2];
        for (int i = 0; i < length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    public void append(int num) {
        if (array.length == length) {
            expand();
        }
        array[length] = num;
        length++;

    }

    public int pop() {
        int value = array[length];
        array[length] = 0;
        length--;
        return value;
    }

}
