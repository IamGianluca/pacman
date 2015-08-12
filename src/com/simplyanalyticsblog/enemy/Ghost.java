package com.simplyanalyticsblog.enemy;

public class Ghost {
    static int numGhost = 0;
    private String name;
    private boolean status = false;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean isAlive) {
        this.status = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Ghost(String name) {
        numGhost += 1;
        setName(name);
        setStatus(true);
    }
}
