/**
 * @author Akmal Faqih
 * @since 20/02/2022
 */
public class MDArrayJava
{
 public static void main(String[] args)
 {
 //One Dimensional Arrays
 int[] fisrtArray = {2, 5, 3}; 
 int[] secondArray = {9, 5, 3}; 
 int[] thirdArray = {2, 4, 9}; 
 int[] fourthArray = {10, 11, 12}; 
 int[] fifthArray = {13, 14, 15}; 
 int[] sixthArray = {16, 17, 18}; 
 int[] seventhArray = {19, 20, 21}; 
 int[] eighthArray = {22, 23, 24}; 
 int[] ninthArray = {25, 26, 27}; 
 //Two Dimensional Arrays
 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
 int[][] twoDimensionalArray2 = {fourthArray, fifthArray,sixthArray};
 int[][] twoDimensionalArray3 = {seventhArray, eighthArray,ninthArray};
 //Three Dimensional Array
 int[][][] threeDimensionalArray = {twoDimensionalArray1,twoDimensionalArray2, twoDimensionalArray3};
 
 for(int[][] array2D: threeDimensionalArray){   //for untuk memberi kurung kurawal buka pada baris pertama
     System.out.print("{");
     for(int[] array1D: array2D){               //for untuk memberi kurung kurawal buka, tutup dan isi 
         System.out.print("{");                 //untuk setiap matriks
         for(int isi:array1D){                  // for untuk memberi isi matrix
             System.out.print(isi+" ");          
         }
         System.out.print("}");
     }
     System.out.print(" }");
     System.out.println();
 }
 }
}
