package model;

public class Emi {
    private double principal;
    private double rateOfInt;
    private int timeInYears;


    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRateOfInt() {
        return rateOfInt;
    }

    public void setRateOfInt(double rateOfInt) {
        this.rateOfInt = rateOfInt;
    }

    public int getTimeInYears() {
        return timeInYears;
    }

    public void setTimeInYears(int timeInYears) {
        this.timeInYears = timeInYears;
    }

    public double calculateEmi(){
        return ( (principal * rateOfInt * Math.pow((1+rateOfInt),timeInYears) ) / (Math.pow( (1+rateOfInt),rateOfInt) - 1));
    }
}
