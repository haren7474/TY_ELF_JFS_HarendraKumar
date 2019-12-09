class Person {
    constructor(name, age) {
        this.name=name;
        this.age=age;
    }

    getName() {
        return this.name
    }
    setName(name, age)
    {
        if(age===26)
        {
        this.name=name;
        }
    }
}

const person1= new Person("Anushka", 34)
const person2= new Person("Scarlet", 26)
console.log(person1.name)
let name=person2.getName()
console.log(name)

person2.setName("Harendra",26)
console.log("After Setting: ",person2.name)


class Teacher extends Person{
    constructor(name, age, subjects){
        super(name, age)
        this.subjects= subjects;
    }

    getSubjects(){
        return this.subjects
    }
}

const teacher1= new Teacher("Guru", 23, ["Maths", "CS"])
const subj= teacher1.getSubjects();
console.log(subj)
