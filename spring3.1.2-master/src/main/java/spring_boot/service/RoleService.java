package spring_boot.service;

import spring_boot.model.Role;
import java.util.List;

public interface RoleService {

    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(long id);

    List<Role> getAllRoles();

    Role getRoleByName(String name);
}
