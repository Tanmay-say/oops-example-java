
class Students {
    private String name;
    private int age;
    public void setAge(int age){
        if(age < 0) {
            System.out.println("Age cannot be negative");
            System.exit(0);
        }
        else{
            this.age = age;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void students(String name, int age) {
        setName(name);
        setAge(age);
    }
        
    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

}