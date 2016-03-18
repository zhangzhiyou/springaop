package com.you.people;

import com.you.axe.Axe;

/**
 * Created by zhiyou on 16-3-6.
 */
public class American implements Person {

    private Axe axe;

    public American(Axe axe) {
        this.axe = axe;
    }
    @Override
    public void userAxe() {
        System.out.println("美国人使用"+axe.chop());
    }
}
