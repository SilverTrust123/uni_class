public class Employee{
    public String name;
    public int id;
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "員工:"+name+"身分證號碼:"+id;
    }
    public boolean search(Employee[] emp, String name){
        for(int i = 0;i < 3;i++){
            if (Emp[i].equal(name)) {
                return true;
            }else{
                return false;
            }
        }
    }
}