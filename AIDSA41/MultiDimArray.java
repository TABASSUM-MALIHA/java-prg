import java.util.*;
class MultiDimArray{
       public static void main(String[] ar){
              int result[][]=new int[10][2];
              Scanner sc= new Scanner(System.in);
System.out.println("Enter roll number and marks");
    for(int i=0;i<result.length;i++){
      System.out.println("roll no");
      result[i][0]=sc.nextInt();
System.out.println("marks");
 result[i][1]=sc.nextInt();

      }
      for( int j=0;j<result.length;j++){
System.out.println("roll no " +result[j][0]+" marks"+result[j][1]);
}
}
}