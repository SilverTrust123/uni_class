import Google.Map;
public  class Person{
    private String name;
    private String address;

    public Person(){
        this.name = null;
        this.address = null;
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Person(Person p){
        this.name = p.getName();
        this.address = p.getAddress();
    }
    @Override
    public String toString(){
        return String.format("%s:%s",this.name,this.address);
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
}