//https://www.youtube.com/watch?v=s6SH72uAn3Q&t=29s
//https://github.com/JuliaChenJing/Web_Application_Dictionary/blob/master/javaScriptPractice/promise_demo.js

newFunction();

function newFunction() {
    
    let promiseToCleanTheRoom = new Promise(function (resolve, reject) {
        //cleaning the room
        let isClean = false;
        if (isClean) {
            resolve('Clean');
        }
        else {
            reject('not Clean');
        }
    });

    promiseToCleanTheRoom.then(function (fromResolve) {
        console.log('the room is' + fromResolve); //the room is clean
    }).catch(function (fromReject) {
        console.log('the room is ' + fromReject);//the room is not clean
    });
}
