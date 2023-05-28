public class smallestintegerinArray {
    //Write a program that takes an array as a parameter and then returns the smallest integer


    public static void main(String[] args) {
        int nums[] = new int[]{100, 20, 3, 2, -3};

        smallestInt(nums);
    }

    static void smallestInt(int nums[]) {
        int smallestnums = nums[0];
        int youngestIndex = 0;

        for (int i = 0; i < nums.length; i++) {
                    if (nums[i] > smallestnums) {
                        smallestnums = smallestnums;
                    } else if (nums[i] < smallestnums) {
                        smallestnums = nums[i];
                        youngestIndex = i;

                    }
                }
        System.out.println(smallestnums);
        System.out.println(youngestIndex);
            }


        }



