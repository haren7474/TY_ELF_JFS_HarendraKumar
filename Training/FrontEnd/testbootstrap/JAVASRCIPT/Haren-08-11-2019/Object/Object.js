var person= 
	{
	firstName:"Sweta",
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


	
	
			