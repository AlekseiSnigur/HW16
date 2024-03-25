public class HW16 {
        public static void main(String[] args) {
            //Task 1:
            int[] averageNumbers = {1, 23, 45, 67, 89};
            int sum = 0;
            for (int num : averageNumbers) {
                sum += num;
            }
            double average = (double) sum / averageNumbers.length;
            System.out.println("Average number is: " + average);

            //Task 2:
            int[] maxNumbers = {1, 2, 3, 150, 45, 15};
            int max = maxNumbers [0];
            for (int i = 1; i < maxNumbers.length; i++ ){
                if (maxNumbers[i] > max){
                    max = maxNumbers[i];
                }
            }
            System.out.println("Max number is: " + max);

            //Task 3:
            int[] duplicateNumbers = {1, 2, 3, 2, 4, 5};
            boolean duplicate = false;
            for (int i = 0; i < duplicateNumbers.length; i++) {
                for (int j = i + 1; j < duplicateNumbers.length; j++) {
                    if (duplicateNumbers[i] == duplicateNumbers[j]) {
                        System.out.println("Duplicated number is: " + duplicateNumbers[i]);
                        duplicate = true;
                    }
                }
            }
            if(!duplicate){
                System.out.println("Duplicated numbers are missing");
            }

            //Task 4:
            int[] sumNumbers = {1, 23, 45, 67, 89};
            int total = 0;
            for (int num : sumNumbers) {
                total += num;
            }
            System.out.println("Total amount of array numbers is: " + total);

            //Task 5:
            for(int i = 10; i>=0; i--){
                System.out.println(i);
            }

            //Task 6a:
            String str = "Hello, World!";
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    count++;
                }
            }
            System.out.println("Symbols without spaces: " + count);

            //Task 6b:
            String string = "All Of The Times";
            int spaces = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    spaces++;
                }
            }
            System.out.println("Spaces quantity:  " + spaces);

            //Task7:
            int[] numbers = {1, 2, 3, 4, 5};
            int i = 0;
            int j = 0;
            while (j < numbers.length) {
                i += numbers[j];
                j++;
            }
            System.out.println("Total amount of array numbers is: " + i);
        }
}
