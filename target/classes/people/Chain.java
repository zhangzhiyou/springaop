package com.you.people;

import com.you.axe.Axe;

/**
 * Created by zhiyou on 16-3-6.
 */
public class Chain implements Person {

    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public Axe getAxe() {
        return axe;
    }

    @Override
    public void userAxe() {
        System.out.println("中国人使用"+axe.chop());
    }
}

