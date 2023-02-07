package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> showUsers();
    public User getUserById(long id);

    public void save(User user);
    public void update(User user);
    public void delete(long id);
}
