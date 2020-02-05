package ma.berexia.services;

import java.util.Collection;

import ma.berexia.entities.Permission;

public interface RolesPermissionsForms {
	public void addPermissionOnFormsToRole(String role, String operation, String forms);

	public void removePermissionOnFormsToRole(String role, String operation, String forms);

	public Collection<Permission> findPermissionByRoleAndForms(String role, String forms);
}
