/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.CalculatorDAO;

/**
 *
 * @author Xuan Vinh
 */
public class CalculatorRepository implements ICalculatorRepository{

    @Override
    public void inputandcalculatorShape() {
        CalculatorDAO.Instance().inputandcalculatorShape();
    }
}
