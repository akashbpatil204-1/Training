var returnFunction = function(fn ,ln){
    var greetFun = function(msg){
        console.log(msg+" "+fn+" "+ln );
    }
    return greetFun;
}


var result =returnFunction('aa','bb');
result("wlecome");//function with msg param
result("Good morning");
