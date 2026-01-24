class Employee{
    id: number;
    name: string;
    city: string;
    constructor(id: number, name: string, city: string){
        this.id = id;
        this.name = name;
        this.city = city;
    }
getDetails(): string{
    return `Name: ${this.name}, City: ${this.city}`;
}
    public disp():void{
        console.log(`Employee Details : ${this.id}  ${this.name}  ${this.city}`);
    }
}


let emp = new Employee(1, "Rohit", "Pune");
console.log(emp.getDetails());
emp.disp();