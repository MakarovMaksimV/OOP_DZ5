package notebook.model.repository;

import notebook.model.User;

import java.util.List;
import java.util.Optional;

public interface GBRepository {
    List<User> findAll();
    User create(User user);
    Optional<User> update(Long userId, User update);
    void delete(Long id);
    void deleteAll();
    void saveAll(List<String> data);
    List<String> readAll();





}
