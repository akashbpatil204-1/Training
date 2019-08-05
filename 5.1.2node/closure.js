let outerfunction = function(fname,lname){
    var fn = fname;
    var ln = lname;
    console.log('set values to f and l')
    var innerFunction =function(msg,fn,ln){
        fn=fn;
        ln=ln;
        console.log(msg+" "+fn+" "+ln);
    }
    return innerFunction;
}
var result = outerfunction("aas","tttt");
result("hello");
result("kk");
result('aa','a','p');


var _ = (function(){
    var id =0;
    var name=" ";
    var price = 0;
    
    var obj = {
        setId:function(argId){
            id = argId;
        },
        getId:function(){
            return id;
        },
        setName:function(argId){
            name = argId;
        },
        getName:function(){
            return name;
        },
        setPrice:function(argId){
            price = argId;
        },
        getPrice:function(){
            return price;
        },

        getDesc:function(){
            return `id:${_.getId()} name:${_.getName()} price:${_.getPrice()}`;
        }
    
    }
    return obj;
}()) //() for singleton pattern

//scope of id,name,price will be over after exe function but we can get their value using get and set method.


//var result =dish();//only one time 
//result.setId(23);
_.setId(23);
_.setName("aaaaa");
_.setPrice(345);
console.log(_.getDesc());
console.log( `id:${_.getId()} name:${_.getName()} price:${_.getPrice()}`);
//console.log(_);
//console.log();

let fun = (function(){
    console.log(`${i}`);
    console.log(`${j}`);

    i=0;
}()


