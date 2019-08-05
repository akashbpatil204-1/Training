//object destrucring

let players=['Virat','Rohit','Dhoni','Raina'];

const [ ,captain , vCaptain]=players;

//instead of
/*
const capatain =players[0];
const vCaptain =players[1];

*/

//console.log(`Captain : ${captain},Vice-captain :${vCaptain}`);


let batsman = 'sachin';
let runner = 'gang';
//swapping
[batsman ,runner] = [runner,batsman];
//console.log(`${batsman} and  ${runner}`);


let player = {
    name:'virat ',
    centuries:23,
    halfCenturies:50,
    matches:350,

}
 player = {
    name:'aavirat ',
    centuries:123,
    halfCenturies:150,
    matches:1350,

}

const {name:pname , centuries, matches} = player;

//console.log(`${pname} has played ${matches} and cent ${centuries}`);
//console.log(player);

let item = {
    name:'iphone',
    price:12345
}

let currencyCalculator = function({price:amount}){
    return{
        'INR':amount,
        'USD' :amount/68,
        'EURO':amount/80
    }
}

const {USD:amountInDollars} = currencyCalculator(item);
console.log(`${amountInDollars}`);