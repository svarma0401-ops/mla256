interface Student {
    id: number;
    name: string;
    college: string;
    city?: string; // Optional property
}

const student1: Student = {
    id: 1,
    name: "Rohit",
    college: "XYZ University",
    city: "Delhi"
};

const student2: Student = {
    id: 2,
    name: "Kohli",
    college: "ABC College",
    city: "Mumbai"
};
console.log(`Student 1: ID=${student1.id}, Name=${student1.name}, College=${student1.college}, City=${student1.city}`);
console.log(`Student 2: ID=${student2.id}, Name=${student2.name}, College=${student2.college}, City=${student2.city}`);