package com.hb.kart.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.hb.kart.pojos.Client;

public class CollectionDeClients implements Iterator<Client>, Iterable<Client> {

    private List<Client> clients = new ArrayList<>();
    private int offset = 0;

    @Override
    public Iterator<Client> iterator() {
        offset = 0;
        return clients.iterator();
    }

    @Override
    public boolean hasNext() {
        //test conditionnelle si offset correspond au dernier
        return offset<clients.size();
    }

    @Override
    public Client next(){
        return clients.get(offset++);
    }

    public void add(Client client){
        clients.add(client);
    }
}
