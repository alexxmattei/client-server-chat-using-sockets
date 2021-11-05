package Utils.Session;

public enum Session {
    NONE(0),
    USER(1),
    ADMIN(2);

    int roleId;

    Session(int role) {
        roleId = role;
    }
}
