public class Factor {
    public static void main(String[] args) {
      
        for (int a = 1; a <=10; a++) {
             System.out.print(a + ":");
             int num =a;
             for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    System.out.print(i+",");
                }
             }

            System.out.println();
        }
    }
}
