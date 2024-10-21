package com.pluralsight;

public class Employees {
        private String employeeId;
        private String name;
        private String department;
        private double payRate;
        private double hoursWorked;


        public Employees(String employeeId, String name,String department, double payRate, double hoursWorked){
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = this.hoursWorked;
        }


        public String getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDepartment() {
            return department;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public double getPayRate() {
            return payRate;
        }
        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }
        public double getHoursWorked() {
            return hoursWorked;
        }
        public void setHoursWorked(double hoursWorked){
            this.hoursWorked = hoursWorked;
        }


        double overtimePay =  (((hoursWorked-40)*payRate)*1.5);
        double overtimeHours = (hoursWorked - 40);
        double regularHours = (hoursWorked - overtimeHours);


        public String getTotalPay(){
        return ("Total Pay: " + (payRate * hoursWorked)+ overtimePay);

        }
        public String getRegularHours(){
        return ("Regular hours worked this week: " + regularHours);

        }
        public String getOvertimeHours(){
        return ("Overtime hours worked this week: " + overtimeHours);

        }
}
