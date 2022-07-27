class EncapsulationDemo{
    private String aadhar;
    private String name;
    private int age;


    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

}


class EncapsTest{
  public static void main(String args[]){
   EncapsulationDemo obj = new EncapsulationDemo();

   obj.setName("Ganesh");
   obj.setAge(22);
   obj.setAadhar("9966 2255 7741");

   System.out.println("Employee Name: " + obj.getName());
   System.out.println("Employee Aadhar: " + obj.getAadhar());
   System.out.println("Employee Age: " + obj.getAge());
 }
}


