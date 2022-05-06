public class MainClass {
    public static void main(String[] args) {
      int i=0;
      int [] array=new int [10];
        for (int j = 0; j < array.length ; j++) {
            array[j]=j;

        }
        for (int k : array) {
            System.out.println(k);
        }
    }
}
