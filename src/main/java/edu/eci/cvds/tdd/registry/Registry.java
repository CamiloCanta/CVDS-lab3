package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {

    private ArrayList<Person> personas;


    public Registry() {
        personas = new ArrayList<Person>();
    }


    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;

        //DEAD > 90, 0<UNDERAGE<18, INVALID AGE <0, VALID > 17

        if (p.getAge() > 90 && !p.isAlive()) {
            result = RegisterResult.DEAD;
        } else if (p.getAge() < 18 && p.getAge() > 0 && p.isAlive()) {
            result = RegisterResult.UNDERAGE;
        } else if (p.getAge() > 17 && p.getAge() < 90 && p.isAlive()) {
            result = RegisterResult.VALID;
        } else if (p.getAge() < 0 && p.isAlive()) {
            result = RegisterResult.INVALID_AGE;
        } else if (personas.contains(p)){
            result = RegisterResult.DUPLICATED;
        }
        else if(!p.isAlive()){
            result = RegisterResult.DEAD;
        }
        this.personas.add(p);
        return result;
    }

}
