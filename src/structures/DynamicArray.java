package structures;

public class DynamicArray<T> {

    private T[] data;
    private int size;
    private int capacity;


    public DynamicArray() {
        this.capacity = 10;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T add){
        if (size == capacity)
            resize();

        data[size] = add;
        size++;
    }

    private void resize(){
        capacity*=2;

        T[] newData = (T[]) new Object[capacity];

        for (int i =0; i<size;i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public void printAll(){
        for (int i =0;i<size;i++){
            System.out.println(data[i]);
        }
    }

    public int size(){
        return this.size;
    }

    public int capacity(){
        return this.capacity;
    }

    public T get(int i){

        if (i< 0 || i >= size)
            throw new IndexOutOfBoundsException();

        return data[i];
    }

    public void remove(int index){
        if (index< 0 || index >= size)
            throw new IndexOutOfBoundsException();

        for (int i = index; i<size ; i++){
            data[i] = data[i+1];
        }
        data[size - 1] = null;
        size--;
    }
}
