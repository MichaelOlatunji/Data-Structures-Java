package CustomArray;

public class OrderedArray extends HighArray{

    public OrderedArray(int max){
        super(max);
    }

    // TODO: Implement a Binary Search for find method

    @Override
    public void insert(long item){
        int i;
        for(i = 0; i < this.nItems; i++){
            if(this.arr[i] > item) break;
        }
        for(int j = this.nItems; j > i; j--){
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = item;
        nItems++;
    }

}
