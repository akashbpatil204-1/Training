class Employee{
    // only one const in js
    constructor(fn,ln,age,salary){
        this._fn = fn;
        this._ln=ln;
        this._age=age;
        this._salary=salary;
    }

    set Fn(fn){
        this._fn=fn;
    }
    set Ln(ln){
        this._ln=ln;
    }
    set Age(age){
        this._age=age;
    }
    set Salary(salary){
        this._salary=salary;
    }

    
    get Fn(){
        return this._fn;
    }
    get Ln(){
        return this._ln;
    }
    get Age(){
        return  this._age;
    }
    get Salary(){
        return this._salary;
    }

    
    

    

}
let E1 = new Employee("john","wick",45,99999);
let E2 = new Employee("don","john",35,567890);
console.log(E1._fn);
E1._salary = 12334;
console.log(E1._salary);
console.log(E1);
//console.log(E1.getSalary());
//E1.Salary = 7777777;
//console.log(E1.Salary);

class RegularEmployee extends Employee{
    constructor(fn,ln,age,salary,vacationDays){
        super(fn,ln,age,salary);
        this._vacationDays = vacationDays;
    }

    set VacationDays(vacationDays){
          this._vacationDays = vacationDays;
    }
    get VacationDays(){
        return  this._vacationDays;
    }
}

let RE1 = new RegularEmployee("harry","potter",30,34455,12);

console.log(RE1.VacationDays);
console.log(RE1.Age);