/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author nagnello
 */
public class TipCalculator {
    private TipCalculatorSelector tipCalculator;

    public TipCalculator(TipCalculatorSelector tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getTip() {
       return tipCalculator.getCalculatedTip();
    }

    public TipCalculatorSelector getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculatorSelector tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
}
