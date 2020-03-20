import java.util.Scanner;
public class ManAr {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size:");

		int size = sc.nextInt(), num[] = new int[size], even=0, ar=2, b, br=1, ctr, ctr2 = 0;

    	for (ctr = 0; ctr < size ; ctr++){
    		System.out.print("Input Array [ " + ctr + " ] : ");
    		num [ctr] = sc.nextInt();
    	}

    	System.out.print("What do you want to do with elements?\n" +
    		"1. List all even nos\n"+
    		"2. List all odd nos\n"+
    		"3. List all nos greater than 5\n" +
    		"4. List all prime nos\n" +
    		"5. List all array nos\n" +
    		"6. Display the sum of all even nos\n" +
    		"7. Sort in ascending order\n" +
    		"8. Sort in descending order\n" +
    		"9. Exit\n");

			int opt = sc.nextInt();

			switch (opt){
			case 1:
				for(int i=0;i<size;i++){
				   if(num[i]%2==0){
				     System.out.println(num[i]);
				   }
			    }
				break;
			case 2:
				for(int i=0;i<size;i++){
				   if(num[i]%2!=0){
					 System.out.println(num[i]);
				   }
				}
				break;
			case 3:
				for(int i=0;i<size;i++){
		           if(num[i]>5){
		        	 System.out.println(num[i]);
		           }
				}
				break;
			case 4:
			    System.out.print("Prime numbers: ");
				   for(ctr=0;ctr<size;ctr++){
				     int i, a, pr = 0;
				 	 a=num[ctr]/2;
				 	 if(num[ctr]!=0||num[ctr]!=1){
				 	   for(i=2;i<=a;i++){
				 	     if(num[ctr]%i==0){
				 		 pr=1;
				 	      }
				 	   }
				 		 if(pr==0&&num[ctr]!=1)
				 		    System.out.print(num[ctr]+" ");
				 	}
				 }
				break;
			case 5:
				for(int i=0;i<size;i++){
					System.out.println(num[i]);
				}
				break;
			case 6:
				for(int i=0;i<size;i++){
				   if(num[i]%2==0)
				   {
				   	  even=even+num[i];
				   }
				}
				   System.out.println("Sum of even numbers:"+even);
				break;
			case 7:
				System.out.print("Ascending order:");
				for (ctr=0; ctr<size; ctr++){
					for(ctr2=ctr+1; ctr2<size; ctr2++){
						if (num[ctr]>num[ctr2]){
							num[ctr]=num[ctr]+num[ctr2];
							num[ctr2]=num[ctr]-num[ctr2];
							num[ctr]=num[ctr]-num[ctr2];
						}
					}
				}
				for(ctr=0; ctr<size; ctr++){
					System.out.print(" "+num[ctr]);
				}
				break;
			case 8:
					System.out.print("Descending order:");
				for (ctr=0; ctr<size; ctr++){
					for(ctr2=ctr+1; ctr2<size; ctr2++){
						if (num[ctr]<num[ctr2]){
							num[ctr]=num[ctr]+num[ctr2];
							num[ctr2]=num[ctr]-num[ctr2];
							num[ctr]=num[ctr]-num[ctr2];
						}
					}
				}
				for(ctr=0; ctr<size; ctr++){
					System.out.print(" "+num[ctr]);
				}
				break;
			case 9:
				return;
			    }

           }
     }
//1. 7
//2. Case 4, System.out.print(num[ctr]+" ");
//3. Case 1, if(num[i]%2==0)
//4. int opt = sc.nextInt();
//5. integer, 1 dimensional array