import structures.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.printAll();
        dynamicArray.remove(0);
        dynamicArray.printAll();
        System.out.println(dynamicArray.size());
    }
}