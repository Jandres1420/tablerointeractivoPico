package co.edu.escuelaing.interactivebalckboardlife.entities;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private static final Ticket instance = new Ticket();
    private List<Integer> tickets;
    public Ticket(){
        tickets = new ArrayList<>();
    }

    public static Ticket getInstance() {
        return instance;
    }

    public void checkTicket(){
        
    }

    public List<Integer> getTickets() {
        return this.tickets;
    }

    public void setTickets(List<Integer> tickets) {
        this.tickets = tickets;
    }


}

