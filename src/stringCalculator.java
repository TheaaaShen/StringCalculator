public class stringCalculator {
    public static int add(String numbers){
        String[] nums=numbers.split(",|n");
        int sum=0;
//        if (nums.length>2){
//            throw new RuntimeException("More than 2 number in input");
//        }
        for (String n: nums){
            if (!n.isEmpty()) {
                int curr=Integer.parseInt(n);
                sum+=curr;
            }
        }
        return sum;
    }

}
