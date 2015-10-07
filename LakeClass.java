package com.malcolm;
import java.util.ArrayList;
public class LakeClass {
    Double runTime;
    String lakeName;
    ArrayList<Double> runTimesArray;
    public LakeClass(String lakeName){
        runTime=0.00;
        runTimesArray=new ArrayList<>();
        this.lakeName=lakeName;
    }
    public void setRunTime(Double runTime) {
        this.runTimesArray.add(runTime);
        this.runTime = runTime;
    }
    public String getLakeName() {
        return lakeName;
    }
    public void setLakeName(String lakeName) {
        this.lakeName = lakeName;
    }
    public Double getMinTime(){
        Double minTime=10000.00;
        for (Double time:runTimesArray){
            if(time<minTime){
                minTime=time;
            }
        }
        return minTime;
    }
    public String displayMinTime(){
        String minTimeString=String.format("The minimum time for Lake %s was %.2f minutes.",this.lakeName,this.getMinTime());
        return minTimeString;
    }
}
