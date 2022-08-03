package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Job1 {
    int id, profit, deadline;

    Job1(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class JobSequencing_Solution1 {

    // Simple and easy solution
    // refer: https://takeuforward.org/data-structure/job-sequencing-problem/
    /*
    Time Complexity: O(N log N) + O(N*M).
                     O(N log N ) for sorting the jobs in decreasing order of profit. O(N*M) since we are iterating through all N jobs and for every job we are checking from the last deadline, say M deadlines in the worst case.
    Space Complexity: O(M) for an array that keeps track on which day which job is performed if M is the maximum deadline available.
     */

    public static void main(String[] args) {

        Job1[] arr = new Job1[8];
        int n = arr.length;

        arr[0] = new Job1(1, 4, 20);
        arr[1] = new Job1(2, 5, 60);
        arr[2] = new Job1(3, 6, 70);
        arr[3] = new Job1(4, 6, 65);
        arr[4] = new Job1(5, 4, 25);
        arr[5] = new Job1(6, 2, 80);
        arr[6] = new Job1(7, 2, 10);
        arr[7] = new Job1(8, 2, 22);

        int[] ans = solveJobSequencing(arr, n);
        System.out.println("Number of Jobs: " + ans[0]);
        System.out.println("Maximum profit: " + ans[1]);
    }

    private static int[] solveJobSequencing(Job1[] arr, int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxDeadline = 0;
        for (int i = 0; i < n; i++)
            if (arr[i].deadline > maxDeadline)
                maxDeadline = arr[i].deadline;

        int[] result = new int[maxDeadline + 1];

        for (int i = 1; i <= maxDeadline; i++)
            result[i] = -1;

        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) { //index of jobs

            for (int j = arr[i].deadline; j > 0; j--) { //deadlines of jobs

                // free slot found
                if (result[j] == -1) {
                    result[j] = arr[i].id;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        System.out.print("Job sequence: ");
        for (int i = 1; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();

        int[] ans = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;

        return ans;
    }
}


class Job2 {
    char job_id;
    int deadline;
    int profit;

    Job2(char job_id, int deadline, int profit) {
        this.deadline = deadline;
        this.job_id = job_id;
        this.profit = profit;
    }
}

class JobSequencing_Solution2 {

    // Time complexity : O(nlog(n))
    // Space complexity : O(n)

    static void printJobScheduling(ArrayList<Job2> arr) {
        int n = arr.size();

        // sorting the array on the
        // basis of their deadlines
        arr.sort((a, b) -> {
            return a.deadline - b.deadline;
        });

        // initialise the result array and maxHeap
        ArrayList<Job2> result = new ArrayList<>();
        PriorityQueue<Job2> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    return b.profit - a.profit;
                });

        // starting the iteration from the end
        for (int i = n - 1; i >= 0; i--) {
            int slot_available;
            // calculate slots between two deadlines
            if (i == 0) {
                slot_available = arr.get(i).deadline;
            } else {
                slot_available = arr.get(i).deadline
                        - arr.get(i - 1).deadline;
            }

            // include the profit of job(as priority),
            // deadline and job_id in maxHeap
            maxHeap.add(arr.get(i));

            while (slot_available > 0
                    && maxHeap.size() > 0) {

                // get the job with max_profit
                Job2 solution1JobSequencing = maxHeap.remove();

                // reduce the slots
                slot_available--;

                // include the job in the result array
                result.add(solution1JobSequencing);
            }
        }

        // jobs included might be shuffled
        // sort the result array by their deadlines
        result.sort((a, b) -> {
            return a.deadline - b.deadline;
        });
        for (Job2 solution1JobSequencing : result) {
            System.out.print(solution1JobSequencing.job_id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Job2> arr = new ArrayList<Job2>();

        arr.add(new Job2('a', 2, 100));
        arr.add(new Job2('b', 1, 19));
        arr.add(new Job2('c', 2, 27));
        arr.add(new Job2('d', 1, 25));
        arr.add(new Job2('e', 3, 15));

        // Function call
        System.out.println("Following is maximum "
                + "profit sequence of jobs");

        // Calling function
        printJobScheduling(arr);
    }
}