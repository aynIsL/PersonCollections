package kyselov.person;

public class Person {
    private final String firstName;
    private final String eMail;
    private final int age;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.eMail = builder.eMail;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return this.getFirstName() + "  " + this.geteMail() + "  " + this.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return !(eMail != null ? !eMail.equals(person.eMail) : person.eMail != null);

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public String getFirstName() {

        return firstName;
    }

    public String geteMail() {
        return eMail;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String firstName;
        private String eMail;
        private int age;

        public Builder(){}
        public Builder (Person original){
            this.firstName = original.firstName;
            this.eMail = original.eMail;
            this.age = original.age;
        }

        public Builder firstName(String firstName) {

            this.firstName = firstName;
            return this;
        }

        public Builder eMail(String lastName){
            this.eMail = lastName;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
