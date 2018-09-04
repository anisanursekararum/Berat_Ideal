/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berat_ideal;

/**
 *
 * @author Sekar Arum
 */
public abstract class Manusia 
    {
        public double TinggiBadan;
        public Manusia (double TB)
        {
            TinggiBadan = TB;
        }
        public double getTB()
        {
            return TinggiBadan;
        }
        public abstract double HtgBBI();
    }
