public class Dog extends Animal implements Comparable<Dog>{
    private String name;
    private int legs;

    public Dog(String name, int legs){
	super(name, legs);
	this.name = name;
	this.legs = legs;
    }

        public int compareTo(Dog d){
	    if(this.getName().equals(d.getName()))
	       return this.getLegs() - d.getLegs();
	    else
	       return this.getName().compareTo(d.getName());
    }

}