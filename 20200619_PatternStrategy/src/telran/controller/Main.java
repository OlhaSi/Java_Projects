package telran.controller;

import telran.data.DisabledState;
import telran.data.EnableState;
import telran.data.Gadget;
import telran.data.GadgetState;

public class Main {

    public static void main(String[] args) {
        Gadget g = new Gadget();
//        g.setState("ON");
//        g.doAction();
//        g.setState("OFF");
//        g.doAction();

        GadgetState off = new DisabledState();
        GadgetState on = new EnableState();
        g.setState(on);
        g.doAction();
        g.setState(off);
        g.doAction();
    }
}
