
const promise= new Promise(function(resolve, reject){
    if(0>10) {
        resolve("Success")
    } else {
        reject("Error")
    }
})

promise.then(function(data){
    console.log("Data: ", data)
}).catch(function(error){
    console.log("Error: ", error)
})

const personData= new Promise(function(resolve, reject){
    if(20>10)
    {
        let pData= [10,20,30,40]
        resolve (pData)
    }
    else {
        reject("No Data Found")
    }
})

personData.then(function(pData){
    console.log("pData: ", pData)
    pData= pData.push(24, 35)
    return pData;
}).then(function(planetData){
    console.log("Planet Data: ", planetData)
}).catch(function(error){
    console.log("Error: ", error)
})