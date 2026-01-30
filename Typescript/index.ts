const fullName : string = "John Doe";
const age : number = 30;
const isEmployed : boolean = true;
const scores : number[] = [85, 90, 78];
const person : { name: string; age: number } = { name: "Alice", age: 25 };

console.log(`Name: ${fullName}`);
console.log(`Age: ${age}`);
console.log(`Employed: ${isEmployed}`);
console.log(`Scores: ${scores.join(", ")}`);
console.log(`Person: Name=${person.name}, Age=${person.age}`);  

var greeting : string = "Hello, World!";
console.log(greeting);

let pi : number = 3.14;
console.log(`Value of Pi: ${pi}`);

//array of objects
let employees : { id: number; name: string; department: string }[] = [
    { id: 1, name: "Alice", department: "HR" },
    { id: 2, name: "Bob", department: "IT" },
    { id: 3, name: "Charlie", department: "Finance" }
];
employees.forEach(emp => {
    console.log(`Employee ID: ${emp.id}, Name: ${emp.name}, Department: ${emp.department}`);
});

// tuple
let product : [number, string, number] = [1, "Laptop", 1500];
console.log(`Product ID: ${product[0]}, Name: ${product[1]}, Price: $${product[2]}`);

// enum Color {
//     Red = "RED",
//     Green = "GREEN",
//     Blue = "BLUE"
// }
// let favoriteColor : Color = Color.Green;
// console.log(`"Favorite Color: ${favoriteColor}");
 
// any type
let randomValue : any = 10;
console.log(`Random Value: ${randomValue}`);
randomValue = "Now I'm a string";
console.log(`Random Value: ${randomValue}`);
randomValue = true;
console.log(`Random Value: ${randomValue}`);

// void function
function logMessage(message: string): void {
    console.log(`Log: ${message}`);
}
logMessage("This is a void function example.");

// function with return type
function add(a: number, b: number): number {
    return a + b;
}
let sum : number = add(5, 10);
console.log(`Sum: ${sum}`);

// never type
function throwError(message: string): never {
    throw new Error(message);
}
// Uncomment the following line to see the never type in action
// throwError("This is a never type example.");

//union type
function displayId(id: number | string): void {
    console.log(`ID: ${id}`);
}
displayId(101);
displayId("202A");

// intersection type
interface Address {
    street: string;
    city: string;
    country: string;
}

interface Contact {
    phone: string;
    email: string;
}  

type Employee = Address & Contact;

let emp: Employee = { 
    street: "123 Main St", 
    city: "Metropolis", 
    country: "Fictionland", 
    phone: "123-456-7890", 
    email: "abc@gmail.com" 
};

console.log(`Employee Address: ${emp.street}, ${emp.city}, ${emp.country}`);
console.log(`Employee Contact: Phone=${emp.phone}, Email=${emp.email}`);

// type assertion
let someValue: any = "This is a string";
let strLength: number = (someValue as string).length;
console.log(`String Length: ${strLength}`);

// arrow function example
const add1 = (x: number, y:number) : number => x+y;
console.log("Add 3+5 = ",add1(3,5));

// inheritance example
class Animal {
  name: string;

  constructor(name: string) {
    this.name = name;
  }

  makeSound(): void {
    console.log("Animal makes a sound");
  }
}

class Dog extends Animal {

  constructor(name: string) {
    super(name); 
  }

  makeSound(): void {
    console.log(this.name + " says: Woof!");
  }
}

const dog1 = new Dog("Buddy");

dog1.makeSound();
console.log(dog1.name); 

interface UserProfile {
  id: number;
  name: string;
  email: string;
  age: number;
  address: {
    city: string;
    country: string;
  };
  skills: string[];
  isActive: boolean;
}

const jsonData = `{
  "id": 101,
  "name": "Shubham Varma",
  "email": "shubham@example.com",
  "age": 23,
  "address": {
    "city": "Mumbai",
    "country": "India"
  },
  "skills": ["Java", "Spring Boot", "TypeScript"],
  "isActive": true
}`;

const user: UserProfile = JSON.parse(jsonData);

console.log(user.name);
console.log(user.address.country);


interface Product {
  readonly productId: number;
  productName: string;
}

const p1: Product = {
  productId: 1,
  productName: "Laptop"
};

//p1.productId = 2; Error
p1.productName = "Gaming Laptop"; //  allowed
console.log(p1);
