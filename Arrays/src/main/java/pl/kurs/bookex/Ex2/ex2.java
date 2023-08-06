package pl.kurs.bookex.Ex2;

public class ex2 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = 559;
        nums[2] = 9;
        nums[3] = 19;
        nums[4] = 29;
        nums[5] = 59;
        nums[6] = 399;
        nums[7] = 299;
        nums[8] = 49;
        nums[9] = 5549;

        min = max = nums[0];
        for (int i=1; i<10; i++) {
            if(nums[i] < min)min = nums[i];
            if(nums[i] > max)max = nums[i];
        }
        System.out.println("najwieksza i najmniejsza wartość: "+max+" "+min);

    }
}
