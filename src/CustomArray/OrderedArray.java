package CustomArray;

public class OrderedArray extends HighArray{

    public OrderedArray(int max){
        super(max);
    }

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

    @Override
    public boolean delete(long item){
        int index;
        if(this.findIndex(item) >= 0){
            index = this.findIndex(item);
            for(int j = index; j < this.nItems; j++){
                arr[j] = arr[j + 1];
            }
            nItems--;
            return true;
        } else{
            return false;
        }
    }

}
