let timeOut0 =function(time =0 , msg="default"){
    setTimeout(function(){
        console.log(`${msg}`);
    },time,msg)
}
//timeOut();
//timeOut(2000,"yoo");







let timeOut =(time =0 , msg="default")=>{
    setTimeout(()=>{
        console.log(`${msg}`);
    },time,msg)
}
//timeOut();
//timeOut(2000,"yoo");
//
let timeOut1 =(time =1000 , msg="default")=>{
    setTimeout(()=>{
        console.log(`${msg}`);
    },time*1000,msg)
}
//timeOut1(0,"yoo");
//console.log('msg will be printed before');

let timeOutInterval =(time =1000 , msg="default")=>{
    setInterval((msg)=>{
        console.log(`${msg}`);
    },time*1000,msg)
}

//timeOutInterval(1,"called after evry 1 sec");
//console.log('msg will be printed before');

let handle;
let timeOutInterval1 =(time =1000 , msg="default")=>{
    handle = setInterval((msg)=>{
        console.log(`${msg}`);

    },time*1000,msg)
}

timeOutInterval(1,"called after evry 1 sec");

setTimeout(()=>{
    console.log('terminate');
    clearInterval(handle);
},5000)