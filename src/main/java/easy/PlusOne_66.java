package easy;

import java.util.stream.IntStream;

public class PlusOne_66 {

	public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        int arr[] = new int[digits.length + 1];
        int i = 0;
        boolean append = false;
        for(i = digits.length; i> 0; i--) {
        
            if(digits[i - 1] == 9) {
                arr[i] = 0;
            } else {
                arr[i] = digits[i - 1] + 1;
                append = true;
                break;
            }
        }

        if(!append ) {
            arr[0] = 1;
            return arr;
        } else {
            for (i = i-1; i> 0; i--) {
                arr[i] = digits[i - 1];
            }
            return IntStream.range(1, arr.length)
								.map(in -> arr[in])
								.toArray();
        }
    }
}
