public class SalaryCalc {
    private double salary;

    public SalaryCalc(double salary) {
        this.salary = salary;
    }
    public double CalcHourly( ){
        final int HoursPerYear = 40*52;
        if ( salary < 0 ){
            throw new IllegalArgumentException( "Illegal Negative Salary");
        }
        if ( salary > 1000000 ){
            salary = 100000;
        }
        double hourly = salary / HoursPerYear;
        hourly = Math.round(hourly * 100.0) / 100.0;

        return hourly;
    }
}
