public class Main {
    public static void main(String[] args) {
        int[] data={6,4,8,5};
        for(int i =0;i< data.length-1;i++){
            for(int j=0 ;j< data.length-1;j++){
                if(data[j]>data[j+1]){
                    int temp =data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        for(int i: data){
            System.out.print(i+" ");
        }
    }
}