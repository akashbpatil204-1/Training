var dish = { //obj can contains fun also
    id:23,
    name:'Pav bhaji',
    price:45,
   
    getPrice:function(){
        return this.price;
    } ,
    getName:function(){
        return this.name;
    }


}

//console.log(dish.getName());
var fun = function([]){
    console.log(this);
}
//default behaviour this is commplete file
//fun();

//fun.call(dish);//this only for dish

var obj = {
fn:'as',ln:'df'

}
//fun.call(obj);
//fun.call("dfk")
var arr =[];
arr[0]='tcs';
arr[1]='bang'
var fun = function(array){
    console.log(array)
    console.log(this.fn ,this.ln);
}

var rebindFun =fun.bind(obj,arr);
rebindFun();


var applyFun = function(p1,p2,p3){
    console.log(p1+" "+ p2 +" "+p3);

}

applyFun.call([1,2,3]);//didnt 
applyFun.apply([1,2,3]);







