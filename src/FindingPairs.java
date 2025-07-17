import java.util.Scanner;

public class FindingPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements as list");
        String input = scanner.nextLine().replaceAll("[\\[\\]\\s]", "");
        String[] parts = input.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i]);

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair found (" + nums[i] + ", " + nums[j] + ")");
                    found = true;
                }

        if (!found) System.out.println("Pair not found.");
        scanner.close();
    }
}