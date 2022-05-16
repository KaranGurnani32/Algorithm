package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JobSequence {

    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        inputJobDetails(jobs);
        Job[] jobsToPerform = maximumprofit(jobs);
        printArray(jobsToPerform);
    }

    private static void printArray(Job[] jobs) {
        for (Job job : jobs) {
            System.out.println(job.id);
            System.out.println(job.profit);
            System.out.println(job.deadLine);
        }
    }

    private static void inputJobDetails(ArrayList<Job> jobs) {
        Scanner scanner = new Scanner(System.in);

        int id = 1;
        System.out.println("Enter no. of jobs");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Job job = new Job();
            System.out.println("Enter deadLine : ");
            job.deadLine = scanner.nextInt();
            System.out.println("Enter profit : ");
            job.profit = scanner.nextInt();
            job.id = id;
            id++;
            jobs.add(job);
        }
    }

    private static Job[] maximumprofit(ArrayList<Job> jobs) {

        //max slots
        int maxSlots = 0;

        for (Job job : jobs) {
            if (job.deadLine > maxSlots) {
                maxSlots = job.deadLine;
            }
        }

        Job[] slots = new Job[maxSlots];

        Collections.sort(jobs, new compareByDecreasingProfit());

        for (Job job: jobs) {
            if (slots[job.deadLine - 1] == null) {
                slots[job.deadLine - 1] = job;
            } else {
                for (int j = job.deadLine - 2; j >= 0; j--) {
                    if (slots[j] == null) {
                        slots[j] = job;
                    }
                }
            }
        }
        return slots;
    }

//    private static Job[] maximumprofit(ArrayList<Job> jobs) {
//
//        //Find max slots available
//        int maxSlots = 0;
//
//        for (Job job : jobs) {
//            if (job.deadLine > maxSlots) {
//                maxSlots = job.deadLine;
//            }
//        }
//
//        Job[] slots = new Job[maxSlots];
//
//        //Sort the jobs in decreasing order of profits
//        Collections.sort(jobs, new compareByDecreasingProfit());
//
//        //Put jobs to the slot by end
//        for (Job job : jobs) {
//            if (slots[job.deadLine - 1] == null) {
//                slots[job.deadLine - 1] = job;
//            } else {
//                //If slot not empty check slots by left
//                for (int j = job.deadLine - 2; j >= 0; j--) {
//                    if (slots[j] == null) {
//                        slots[j] = job;
//                    }
//                }
//
//
//            }
//        }
//        return slots;
//    }

//    private static void inputJobDetails(ArrayList<Job> jobs) {
//        Scanner scanner = new Scanner(System.in);
//
//        int id = 1;
//        System.out.println("Enter number of jobs");
//        int count = scanner.nextInt();
//
//        for (int i = 0; i < count; i++) {
//            Job job = new Job();
//            System.out.println("Enter deadLine : ");
//            job.deadLine = scanner.nextInt();
//            System.out.println("Enter profit : ");
//            job.profit = scanner.nextInt();
//            job.id = id;
//            id++;
//            jobs.add(job);
//        }
//    }
//
}
