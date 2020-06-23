package telran.data;

public class User {
    private String name;
    private int secretCode;

    public User(String name, int secretCode) {
        this.name = name;
        this.secretCode = secretCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public boolean checkSecretCode(int number) {
        return secretCode == number;
    }

    @Override
    public String toString() {
        return "\nUser: " +
                name + ", secretCode: " + secretCode;
    }

    public static User getUserByName(User[] users, String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equalsIgnoreCase(name))
                return users[i];
        }
        return null;
    }
}
