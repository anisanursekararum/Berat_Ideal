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
public class Perempuan extends Manusia
    {
        public Perempuan (double TB)
        {
            super(TB);
        }
        public final double HtgBBI()
        {
            return(super.getTB()-100)*0.8;
        }
    }
