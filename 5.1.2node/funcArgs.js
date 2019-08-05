let sum = function(a,b){
    return a+b;
}

let sub = function(a,b){
    return a-b;
}

let product = function(a,b){
    return a*b;
}

let calculate = function(a,b,fun){
    return fun(a,b);
}

var concat = function(a,b){
    console.log('came inside concat');
    return a+b;
}
console.log(calculate("h","i",function(a, b){
    return a+b;
}))

console.log(calculate(3,4,sum))
