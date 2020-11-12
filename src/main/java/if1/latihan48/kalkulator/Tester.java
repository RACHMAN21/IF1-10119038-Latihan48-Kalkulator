/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan48.kalkulator;

/**
 *
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi kalkulator dengan pendekatan object oriented
 * 
 */

public class Tester {
    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();
        
        calculator.setValue1(7);
        calculator.setValue2(5);
        System.out.println("VALUE 1 = " + calculator.getValue1());
        System.out.println("VALUE 2 = " + calculator.getValue2());
        
        calculator.setNameProject();
        calculator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is   = " + calculator.add(calculator.getValue1(),calculator.getValue2()));
        System.out.println("Result Minus is = " + calculator.minus(calculator.getValue1(),calculator.getValue2()));
        System.out.println("Result Multiple is = " + calculator.multiplication(calculator.getValue1(),calculator.getValue2()));
        System.out.println("Result Division is = " + calculator.division(calculator.getValue1(),calculator.getValue2()));
    }
}