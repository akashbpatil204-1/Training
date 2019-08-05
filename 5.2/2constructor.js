const User = function(ff,ll){
    this.ff=ff;
    this.ll=ll;
    console.log("The value of u: ");
    console.log(this);
}

User.prototype.getFf = function(){//function attched to object using  prototype
    return this.ff;
}


User.prototype.getLL = function(){
    return this.ll;
}


User.prototype.getFullName = function(){
    return `${this.ff} ${this.ll}`;
}






//let u = new User();//create new obj without new points to global 
let u =  new User('john','wick');
console.log(u.getFullName());