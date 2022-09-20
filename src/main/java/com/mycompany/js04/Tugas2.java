/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js04;

//Created by 21343032_Muhammad Rizky Sandyra

public class Tugas2 {
    public static void main(String[] args) {
        int numb1 = 10;
        int numb2 = 23;
        int numb3 = 5;
        int max = 0;
        
        max = (numb1 < numb2) ? numb2 : numb1;
        max = (max < numb3) ? numb3 : max;
        
        System.out.println("Number 1 = " + numb1);
        System.out.println("Number 2 = " + numb2);
        System.out.println("Number 3 = " + numb3);
        System.out.println("Nilai tertingginya adalah angka = "+ max);
    }
}
