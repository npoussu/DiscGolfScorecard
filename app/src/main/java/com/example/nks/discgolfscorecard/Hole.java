package com.example.nks.discgolfscorecard;

public class Hole {
    private int par_;
    private int hole_number_;
    private int result_;

    public Hole(int par, int hole_number) {
        par_ = par;
        hole_number_ = hole_number;
        result_ = 0;
    }

    public void increaseResult() {
        result_++;
    }

    public void setResult(int score) {
        result_ = score;
    }

    public int getPar() {
        return par_;
    }

    public int getHoleNumber() {
        return hole_number_;
    }
}
