package ca.kevin.rockassignment1.domain;

import java.io.Serializable;

public class RPS implements Serializable {
    private int message = 1;
    public RPS(){

    }
    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "RPS{" + "message=" + message + '}';
    }
    }
