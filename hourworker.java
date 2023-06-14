public class Hourworker extends Worker {
    this.id = id;
    this.salary = salary; 
    this.type = type;
  
  
    @Override
    public double avermonth(int hour) {
                  
    return 20.8 * 8 * hour;
  }
