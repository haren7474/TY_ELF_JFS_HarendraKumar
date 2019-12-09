console.log("****************Object with new****************");

console.log("========Car Object=====");
    var car= new Object();
    
    car.color="Red",
    car.brand="Merc",
    car.price=999999

    console.log("color " + car.color);
    console.log("brand " + car.brand);
    console.log("price " + car.price);


    console.log("========Pen Object=====");
    var pen= new Object();
    {
        pen.color="blue",
        pen.brand="cello",
        pen.price=15.2
    }

    console.log("color " + pen.color);
    console.log("brand " + pen.brand);
    console.log("price " + pen.price);


console.log("******************Object without new*****************");

console.log("========Person Object=====");
var person= 
	{
	firstName:"Shweta",
	lastName: "Singh",
	age: 23,
	gender: "F",
	
	eat : function()
		{
		console.log("Biryani")
		},
	
	getFullName: function()
			{
			return this.firstName + " " + this.lastName;
			}
	}

	var firstName= person.firstName;
	var lastName= person.lastName;
	var age= person.age;
	var gender= person.gender;
	var food= person.eat();
	var fullName= person.getFullName();

	console.log("firstName " + firstName);
	console.log("lastName " + lastName );
	console.log("age " + age);
	console.log("gender "+ gender);
	
    console.log("fullName " +fullName );
    
    console.log("========Car Object=====");
    var car=
    {
        color:"Red",
        brand:"Merc",
        price:999999
    }

    console.log("color " + car.color);
    console.log("brand " + car.brand);
    console.log("price " + car.price);

    console.log("========Mobile Object=====");
    var mobile=
    {
        color:"Red",
        brand:"OnePlus",
        price:35000
    }

    console.log("color " + mobile.color);
    console.log("brand " + mobile.brand);
    console.log("price " + mobile.price);

    console.log("========Employee Object=====");
    var employee=
    {
        name:"Haren",
        empid:"TYSS99103",
        designation:"SSD"
    }

    console.log("name " + employee.name);
    console.log("empid " + employee.empid);
    console.log("designation " + employee.designation);


    console.log("========Pen Object=====");
    var pen=
    {
        color:"blue",
        brand:"cello",
        price:15.2
    }

    console.log("color " + pen.color);
    console.log("brand " + pen.brand);
    console.log("price " + pen.price);

console.log("******************Array with new*****************");
var numbers= new Array(1,2,3,4,5)
console.log(numbers);

var chars= new Array('a','b','c','d','e')
console.log(chars);

var objects= new Array(
    {
        name: "Harendra",
        id:1
    },
    {
        name: "Sweta",
        id:2
    }
)
console.log(objects);


console.log("******************Array without new*****************");
var number1= [1, 2, 3, 4, 5]
console.log(number1);

var chars1= ['a','b','c','d','e']
console.log(chars1);

var objects1= [
    {
        name: "Harendra",
        id:1
    },
    {
        name: "Sweta",
        id:2
    }
]
console.log(objects1);
    
console.log("Printing through for loop");
for(var i=0; i<objects1.length;i++)
{
    console.log(objects1[i])
}

console.log("Printing through for of loop");
for(obj of objects1)
{
    console.log(obj)
}


console.log("Printing through for in loop");
for(obj in objects1)
{
    console.log(objects[obj])
}
			