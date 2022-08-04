package practiceproject5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BugsFixApp {

public static void main(String[] args) {
		
        System.out.println("Welcome to TheApp \n");
        
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = 
        	{
        		"1. I wish to review my earnings",
                "2. I wish to add my earnings",
                "3. I wish to delete my earnings",
                "4. I wish to sort the earnings",
                "5. I wish to search for a particular earnings",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++)
        {
            System.out.println(arr[i]);
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> earnings = new ArrayList<Integer>();
        earnings.add(10000);
        earnings.add(200);
        earnings.add(4000);
        earnings.add(300);
        earnings.add(11000);
        earnings.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved earnings are listed below: \n");
                        System.out.println(earnings+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Earnings: \n");
                        int value = sc.nextInt();
                        earnings.add(value);
                        System.out.println("Your value is updated\n");
                        earnings.addAll(arrlist);
                        System.out.println(earnings+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your earnings! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               earnings.clear();
                            System.out.println(earnings+"\n");
                            System.out.println("All your earnings are cleared!\n");
                        } else {
                            System.out.println(" try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(earnings);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(earnings);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an wrong choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the earnings you need to search:\t");
        //
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //Linear Search
        for(int i=0;i<leng;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the earnings " + input + " at " + i + " position");
        	}
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.
        
        Collections.sort(arrayList);
        System.out.println("Sorted earnings: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
       
    }
}

