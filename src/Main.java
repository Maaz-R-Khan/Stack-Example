public class Main {
    public static void main(String[] args) {
    StackArray st = new StackArray(20);

    st.isFull();
    st.isEmpty();
    st.hasElements();

    //Last in First Out
    st.push("Maaz");
    st.push("Khan");
    System.out.println(st.peek());
    st.pop();
    System.out.println(st.peek());
    }
}