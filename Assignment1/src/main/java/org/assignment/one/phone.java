package org.assignment.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class phone {

    private String mob;

    public void setMob(String Mob)
    {
        this.mob = Mob;
    }

    public String getMob()
    {
        return mob;
    }
}
