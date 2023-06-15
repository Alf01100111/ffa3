public class Hourworker extends Worker {
    this.id = id;
    this.hourSalary = hourSalary; 
    
  
  
    @Override
    public double avermonth(int hour) {
                  
    return 20.8 * 8 * hour;
  }
