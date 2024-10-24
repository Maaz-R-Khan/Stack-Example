public class StackArray {
    //defining a private array of Strings
    private String array[];
    private int size = 10;
    private int index = 0;

    public StackArray(int size) {
        array = new String[size]; //the size refers to the input parameter here.
        this.size = size; //refers to the data member
    }

    public boolean isEmpty() {
        System.out.println("Stack is Empty = " + (this.index == 0));
        return (index == 0);
    }

    public boolean isFull() {

        System.out.println("Stack is Full = " + (this.index == this.size));
        return (index == size); //when index is equal to size, then you are reaching out of bounds.
                                // no more space to insert
    }

    public boolean hasElements() {
        System.out.println("Stack has elements = " + (this.index != 0));
        return (this.index != 0);
    }

    public void push(String value) {
        if(!isFull()) {
            array[index++] = value; //place the value in the current index, then move to the next one.
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public String pop() {
        if(!isEmpty()) {
            String temp = array[index - 1];
            index--;
            return temp;
        }
        else{
            System.out.println("Sorry, Stack is empty");
            return null;
        }
    }

    public String peek() {
        if(!isEmpty()) {
            return array[index - 1];
        }
        else{
            return null;
        }
    }

}
