
add(2.4,4.5);//success before function

function add(a ,b){
console.log(a+b);
}

add(2.4,4.5);
//sub(2,9) got error for below fucntion for calling before defining
var sub = function(a,b){
    console.log(a-b);
}

sub(5,3);
