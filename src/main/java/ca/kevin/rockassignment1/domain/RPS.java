package ca.kevin.rockassignment1.domain;

import java.io.Serializable;
import java.util.Random;






public class RPS implements Serializable {
    private int message = 1;
    private int cpuChoice = 0;



    public void getRandomNum(){
        Random rand = new Random();
        cpuChoice = rand.nextInt(3);
        System.out.println(cpuChoice);

    }

    public int getCpuChoice(){
        return cpuChoice;
    }
    public int getWinner(){
        System.out.println("message:" + message);
        if (message == 0 & cpuChoice == 1){ return 2;}
        if (message == 1 & cpuChoice == 2){ return 2;}
        if (message == 2 & cpuChoice == 0){ return 2;}
        if (message == 0 & cpuChoice == 2){ return 1;}
        if (message == 1 & cpuChoice == 0){ return 1;}
        if (message == 2 & cpuChoice == 1){ return 1;}
        else{return 0;}

    }
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
