package binarysearchwebsiteques;

public class FirstFitRoom {
// You are given a list of integers rooms and an integer target.
// Return the first integer in rooms that's target or larger. If there is no solution, return -1.

    public static void main(String[] args) {
        int[] rooms = {15, 10, 30, 50, 25};
        int target = 20;

        System.out.println(solve(rooms, target));
    }

    public static int solve(int[] rooms, int target) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == target || rooms[i] > target) {
                return rooms[i];
            }
        }
        return -1;
    }
}
