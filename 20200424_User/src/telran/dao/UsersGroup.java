package telran.dao;

import telran.data.User;

public class UsersGroup {
    private User[] users;
    private int size;

    public UsersGroup (int capacity){
        this.users = new User[capacity];
        size = 0;
    }

    public boolean addUser(User user){
        if(size<users.length){
            users[size] = user;
            size++;
            return true;
        }
        return false;
    }

    public boolean removeUser (User user){
        for (int i = 0; i < size; i++) {
            if(users[i].equals(user)){
                users[i]= users[size-1];
                size --;
                return true;
            }
        }
        return false;
    }

    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(users[i]);
        }
    }

    public User getUserByName(String name){
        for (int i = 0; i <size ; i++) {
            if(users[i].getName().equalsIgnoreCase(name))
                return users[i];
        }
        return null;
    }
}
