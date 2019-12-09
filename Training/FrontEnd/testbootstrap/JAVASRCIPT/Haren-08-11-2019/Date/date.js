
console.log("Current Timestamp ");

var date = new Date()
console.log("date ",date);

var dateMs = new Date(86400000)
console.log("dateMs, it increaments by these milliseconds ",dateMs);


var dateString = new Date("October 10 2019");
console.log("dateString, it changes string to date ", dateString);

var dateParam = new Date(2018,11,11)
console.log("dateParam, it gives you date with given date like year month etc"+ dateParam);


console.log("getFullYear ", date.getFullYear());
console.log("getHours ", date.getHours());
console.log("getMinutes ", date.getMinutes());


console.log("=============Print Month=========");
var months= ["Jan", "Feb","March","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"];
var getMonths= date.getMonth();
console.log("getMonths ",getMonths);
console.log(months[getMonths]);

console.log("=============Print Day=========");
var days= ["Sun", "Mon","Tues","Wed","Thus","Fri","Satur"];
var getDay= date.getDay();
console.log("getMonths ",getDay);
console.log(days[getDay]);


