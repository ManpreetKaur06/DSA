class CountOperations  {
    public int countOperations(int num1, int num2) {

        // optimised optimised approach
         int count = 0;
        
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                count += num1 / num2;
                num1 %= num2;
            } else {
                count += num2 / num1;
                num2 %= num1;
            }
        }
        
        return count;
        // int count = 0;

        // while(num1 != 0 && num2 != 0){
        //     if(num1 > num2){
        //         num1 = num1 - num2;
        //     }else{
        //         num2 = num2 - num1;
        //     }
        //     count++;
        // }
        // return count;
    }

     public static void main(String[] args) {
        CountOperations  outer = new CountOperations ();
       
        int num1 = 2;
        int num2 = 3;
        int ans = outer.countOperations(num1  , num2);
        System.out.println("Answer is: " + ans);
    }

}