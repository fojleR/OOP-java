public class Student {
    public String name, address;
    public int age;
    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public int getAge(){
        return this.age;
    }
}
