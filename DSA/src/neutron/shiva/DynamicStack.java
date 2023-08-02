package DSA.src.neutron.shiva;

public class DynamicStack extends CustomStack{ //same as normal stack, just push method is changed since dynamic stack is never full
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override //overrides the default push function for the stack(such that item is pushed to the stack even after exceeding the default size)
    public boolean push(int item){
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        return super.push(item);
    }
}
