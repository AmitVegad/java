import java.util.Scanner;

public class excerise1 {
     public static void main(String[] args) {
        
    System.out.println("Enter age:");
    Scanner sc= new Scanner(System.in);
    int age[] = new int[10];
    // int senior[]=new int[5];
    // int q2[]=new int[5];
     for(int i=0;i<10;i++){
        
         age[i]=sc.nextInt();
     }  
    // for(int i=0,j=0;i<10;i++){
    //     if(age[i]>60){
    //      i=q2[j];
    //      j++;
    //     }
    //     for(i=0;i<5;i++){
    //      int ab=q2[i];
    //      senior[i]=ab;
    //     }
    
   // }
    for(int k=0;k < age.length;k++)    //length is the property of the array  
        System.out.println(age[k]);
    sc.close();
}


    }

