public class Arrays {
    public static void main(String[] args){
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        // printing all array elements
        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i]+ " ");
        }
        // summing all elements
        double total = 0;
        for (int i=0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total is "+total);
        // Finding largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max){
                max = myList[i];
            }
        }
        System.out.println("Max is "+max);
        // printing all elements
        for (double elt: myList){
            System.out.println(elt);
        }
    }
}
