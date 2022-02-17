public class even {
    public static void main (String [] args) {
        int [] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        //sysout even number
        for(int num : nums) {
            if(num %2 == 0) {
                System.out.println(num);
            }
        }
    }
}
