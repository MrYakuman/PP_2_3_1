package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> showUsers();

    public User getUserById(long id);

    public void save(User user);

    public void update(User user);

    public void delete(long id);
}
