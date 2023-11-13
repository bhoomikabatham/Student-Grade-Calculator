                                                         /*         2. TASK

                                                            STUDENT GRADE CALCULATOR

Input: Take marks obtained (out of 100) in each subject.

Calculate Total Marks: Sum up the marks obtained in all subjects.

Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.

Grade Calculation: Assign grades based on the average percentage achieved.

Display Results: Show the total marks, average percentage, and the corresponding grade to the user.*/

import java.util.Scanner;

class SubjectGradeCalculator {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        System.out.println("please enter the length/no. of the subjects");

        int length = in.nextInt();

        float[] sub = new float[length];

        for(int i=0;i<sub.length;i++){

			System.out.println("enter the values of marks out of 100  subject" +i+":");

			sub[i] = in.nextFloat();

			}

		   float sum = 0;

			for(int i=0;i<sub.length;i++){

				sum = sum+sub[i];
			}

			System.out.println("total marks obtain = "+sum);

			float avg = sum/sub.length;

			System.out.println("average = "+avg);

			float per =  (((float)sum*100)/(sub.length*100));

			System.out.println("percentage obtain = " +per+"%");

			if(per>=95){

				System.out.println("PASS");

				System.out.println("grade A+");

			}

			else if(per>=85){

				System.out.println("PASS");

				System.out.println("grade A");

			}

			else if(per>=80){

			System.out.println("PASS");

				System.out.println("grade B+");

			}

			else if(per>=75){

				System.out.println("PASS");

				System.out.println("grade B");

			}

			else if(per>=70){

				System.out.println("PASS");

				System.out.println("grade C+");

			}

			else if(per>65){

				System.out.println("PASS");

				System.out.println("grade C");

		}

		    else if(per>=60){

				System.out.println("PASS");

				System.out.println("grade D+");

			}

			else if(per>=55){

				System.out.println("PASS");

				System.out.println("grade E+");

			}
			else if(per>=50){

				System.out.println("PASS");

				System.out.println("grade E");

			}

			else if(per>=45){

				System.out.println("PASS");

				System.out.println("grade F+");

			}
			else if(per>=33){

				System.out.println("PASS");

				System.out.println("grade F");

			}

			else {

				System.out.println("Fail");

			}

      }

}
