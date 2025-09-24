public class Sort{
    public int data[];
    public Sort(int data[]){
        this.data = data;
    }
    public void tostring(){
        for(int i = 0;i < data.length;i++){
            System.out.printf(%5d,data[i]);
        }
    }
    public void bubbleSort(){
        for(int i = 0;i < data.length;i++){
            if (data[i] > data[i+1]) {
                int temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
        }
    }
}