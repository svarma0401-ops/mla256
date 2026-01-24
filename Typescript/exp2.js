var Employee = /** @class */ (function () {
    function Employee(id, name, city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    Employee.prototype.getDetails = function () {
        return "Name: ".concat(this.name, ", City: ").concat(this.city);
    };
    Employee.prototype.disp = function () {
        console.log("Employee Details : ".concat(this.id, "  ").concat(this.name, "  ").concat(this.city));
    };
    return Employee;
}());
var emp = new Employee(1, "Rohit", "Pune");
console.log(emp.getDetails());
emp.disp();
