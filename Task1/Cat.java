package Task1;

public class Cat {

    private String name;

    private int age;

    private Owner owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void greet() {
        if (owner == null) {
            System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет).\n", name, age);
        }
        else {
            System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n", name, age, owner);
        }
    }

}
