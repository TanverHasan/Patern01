/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author 1410453
 */
public class PlatinumAccount extends AccountBase {

    public PlatinumAccount() {
        super();
    }

    @Override
    public int addRewardPoints(double amount) {
        rewardPoints += (int) Math.round(amount / platinumTAValue);
        return rewardPoints;
    }

}
