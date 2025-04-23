import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */

 private int numSteps;
 private int totalDays; 
 private int activeDays; 
 private int min; 

 public StepTracker(int minSteps){

  numSteps = 0;
  totalDays = 0;
  min = minSteps; 
  
 }

 public void addDailySteps(int num){

  numSteps += num; 

  if(num >= min){

   activeDays++; 
   
  }
  
  totalDays++;
 }

 public int activeDays(){

  return activeDays;
  
 }

 public double averageSteps(){

 return (double) numSteps/totalDays; 
  
 }
} 
