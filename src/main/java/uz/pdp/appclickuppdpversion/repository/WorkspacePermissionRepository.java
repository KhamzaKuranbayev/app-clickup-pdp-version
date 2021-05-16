package uz.pdp.appclickuppdpversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appclickuppdpversion.entity.WorkspacePermission;

import java.util.UUID;

public interface WorkspacePermissionRepository extends JpaRepository<WorkspacePermission, UUID> {
}
