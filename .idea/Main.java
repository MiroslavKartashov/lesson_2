package com.geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//       invertArray();
//       fillInArray ();
//       mathArray ();
        quatDiagArray();
//       minMaxArr();
//       sumLeftRightArr();
//       nArr () ;
    }

    //
//// 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
//// апример: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//    public static void invertArray(){
//         int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0,};
//         for (int i = 0; i < arr.length; i++) {
//           System.out.print(i + "-" + arr[i] + " ");
//            }
//           System.out.println(" ");
//         for (int i = 0; i < arr.length; i++)
//           if (arr[i] == 1) {
//           arr[i] = 0;
//          }else arr[i] = 1;
//         for (int i = 0; i < arr.length; i++) {
//           System.out.print(i + "-" + arr[i] + " ");
//         }
//           System.out.println("2");
//        }
//
////2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
//    public static void fillInArray (){
//         int[] array = new int[8];
//         int j = 0;
//         for(int i = 0; i < array.length; i++){
//          System.out.print (i + "-" + array[i]+" ");
//         }
//          System.out.println (" ");
//         for(int i = 0; i < array.length; i++, j = j+3){
//          array[i] = j;
//         }
//         for(int i = 0; i < array.length; i++){
//          System.out.print (i + "-" + array[i]+" ");
//         }
//          System.out.println();
//}
//// 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//    public static void mathArray () {
//         int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//         for (int i = 0; i < arr.length; i++) {
//          System.out.print(i + "|" + arr[i] + " ");
//         }
//          System.out.println (" ");
//         for (int i = 0; i < arr.length; i++ ){
//           if (arr[i] < 6){
//           arr[i] = arr[i] * 2;
//         }
//          System.out.print(i + "|" + arr[i] + " ");
//         }
//          System.out.println();
//     }
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами;
    public static void quatDiagArray() {
        int[][] dMatrix = new int[7][7];
        for (int i = 0; i < dMatrix.length; i++) {
            for (int j = 0; j < dMatrix.length; j++) {
                if ((i - j) % 8 == 0) dMatrix[i][j] = 1;
                else dMatrix[i][j] = 0;
                System.out.print(" " + dMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
////** 5 Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//    public static void minMaxArr() {
//         int[] mMaxArr = {5, 3, -19, 1, -1, 44, 5, -13, 56, 84};
//         int max = mMaxArr[0];
//         int min = mMaxArr[0];
//         for (int i = 0; i < mMaxArr.length; i++) {
//         if (mMaxArr[i] > max) {
//          max = mMaxArr[i];
//         }
//         if (mMaxArr[i] < min) {
//          min = mMaxArr[i];
//         }
//        }
//         System.out.println("максимальное число " + max);
//         System.out.println("минимальное  число " + min);
//    }
//
//
////    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//// граница показана символами ||, эти символы в массив не входят.
//    public static boolean sumLeftRightArr(int[] lRsum) {
//        int[] lRSum = new int[];
//        int lSum = 0;
//          for(int i = 0; i < lRSum.length; i++){
//             lSum += lRSum[i];
//             int rSum = 0;
//              for (int j = 0; j < lRSum.length; j++){
//                 if (j > i) {
//                     rSum = lRSum[j];}
//               else
//                  lRSum[j] = 0;}
//
//           if(lSum == rSum){
//              return true;
//           }
//        }
//            return false;
//    }
//
//
////7. **** Написать метод, которому на вход подается одномерный
//// массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить
//// все элементымассива на n позиций (Циклично). Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//
//    public static int nArr (int[] nArr , int value) {
//        int[] nArrey =new int[];
//        boolean dir;
//        if (value < 0) {
//            dir = true;
//            value = -value;
//        } else {
//            dir = false;
//        }
//        value %= nArrey.length;
//        int last = nArrey.length - 1;
//        for (int i = 0; i < value; i++) {
//            int temp = (dir) ? nArrey[0] : nArrey[last];
//            for (int j = 0; j < last; j++) {
//                if (dir) nArrey[j] = nArrey[j + 1];
//                else
//                    nArrey[last - j] = nArrey[last - j - 1];
//            }
//            if (dir) nArrey[last] = temp;
//            else
//                nArrey[0] = temp;
//        }
//    }
//}

